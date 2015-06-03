package net.awt.frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class NotePad extends Frame {

	private TextArea ts = new TextArea();
	private Font font = new Font("����ü", Font.ROMAN_BASELINE, 30);

	public NotePad() {
		ts.setFont(font);
		this.add(ts);
		this.setTitle("�޸���");
		this.setBackground(Color.gray);
		this.setBounds(100, 100, 600, 450);
		this.setVisible(true);

		// ExitAdapter exit = new //ExitAdapter( );
		this.addWindowListener(new ExitAdapter());
	}

	class ExitAdapter extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("������ â�� �ݽ��ϴ�.");
			System.exit(1); // 1 = ���� ���� ���� ��� â�� �ݴ� �ǹ�
		}
	}

	public static void main(String[] args) {
		new NotePad(); // anonymous ������
	}

}
