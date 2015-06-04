package net.awt.socket;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class SwingChatServer extends JFrame implements ActionListener {

	JTextArea txtList;
	JButton btnExit;
	ServerSocket ss = null;
	Vector inwon; // �ο��� ����

	/*
	 * Arraylist �� ������� ��Ȥ Vector �� ����Ͽ� ���� ����ȭ ���������̴�. ���� ���α׷��� ����ȭ ������ �ʿ��ϴ�
	 */

	public SwingChatServer() {
		super("Chatting Server");
		txtList = new JTextArea();
		btnExit = new JButton("��������");

		add(txtList, "Center");
		add(btnExit, "South");
		setSize(350, 650);
		setVisible(true);
		// �̺�Ʈ ó�� =====================================
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		btnExit.addActionListener(this);
		inwon = new Vector();
		serverStart();

	}

	private void serverStart() {
		// TODO Auto-generated method stub
		final int PORT = 7500;
		try {
			ss = new ServerSocket(PORT);
			System.out.println("������ ���۵Ǿ����ϴ�.");
			txtList.append("������ ���۵Ǿ����ϴ� ");
			txtList.setFont(new Font("����ü", Font.BOLD, 16));
			while (true) {
				Socket socket = ss.accept();
				String str = socket.getInetAddress().getHostAddress();
				txtList.append(str);
				// ���� ó���� �ϱ� ���� Ŭ���̾�Ʈ ��ü ���� ( ����� ���� Ŭ����)

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	public void setMsg(String str) {
		txtList.append(str);

	}

}

class ChatHandle extends Thread {
	SwingChatServer server = null;
	Socket socket = null;
	PrintWriter pw = null;
	BufferedReader in = null;

	public ChatHandle(SwingChatServer server, Socket socket) {
		this.server = server;
		this.socket = socket;

		try {
			InputStream is = socket.getInputStream();
			in = new BufferedReader(new InputStreamReader(is));
			OutputStream os = socket.getOutputStream();
			pw = new PrintWriter(new OutputStreamWriter(os));

		} catch (Exception e) {
			e.printStackTrace();
		}
	} // ������ ��

	@Override
	public void run() {
		String nickName = null;
		try {
			nickName = in.readLine();
			// �������� �޼�������� ����� �ϱ����� setMsg() �����Ͽ� ���
			server.setMsg("[" + nickName + "���� �����ϼ̽��ϴ� ]");
			// �µ� �޼����� ȭ�鿡 �Ѹ��� �޼ҵ� broadcast();
			broadcast("[" + nickName + "]���� �����ϼ̽��ϴ� ");
			// ��ȭ���� ============
			while (true) {
				try {
					String text = in.readLine();
					server.setMsg(nickName + ":> " + text + "\n");
					broadcast(nickName + ":> " + text + "\n");
				} catch (Exception e) {
					e.printStackTrace();
				} finally { // ���� �߻� ���� ������� �ݵ�� ���ľ��ϴ� ��
					synchronized (server.inwon) {
						server.inwon.remove(this);
						server.setMsg("[" + nickName + "] ���� �����ϼ̽��ϴ�. \n");
						broadcast("[" + nickName + "] ���� �����ϼ̽��ϴ�. \n");
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ��� ����ڿ��� �޼����� �����ִ� ���

	private void broadcast(String str) {
		synchronized (server.inwon) {
			int s = server.inwon.size();
			for (int i = 0; i < s; i++) {
				ChatHandle ch = (ChatHandle) server.inwon.elementAt(i);
				server.txtList.append(str + "\n");
				ch.pw.println(str);
				ch.pw.flush();
			}
		}

	}

}
