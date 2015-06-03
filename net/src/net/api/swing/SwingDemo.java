package net.api.swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


/*
 * �������� �⺻ ���̾ƿ� �����ڴ�  BoarderLayout(��������)
 * 
 * 
 */


public class SwingDemo {
	public static void main(String[] args) {
		
		MyFrame mf = new MyFrame( );
	}

}

class MyFrame extends JFrame{
	
	public MyFrame () {
		setSize(600,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JEE (MVC)��" );
		
		Toolkit toolkit = Toolkit.getDefaultToolkit() ;
		Dimension dimension = toolkit.getScreenSize() ;
		
		//�гΰ�ü ���� 
		JPanel jPanel1 = new JPanel() ;
		JPanel jPanel2 = new JPanel() ;
		JPanel jPanel3 = new JPanel() ;
		
		// �г� ���� ���� 
		jPanel1.setBackground(Color.yellow);
		jPanel2.setBackground(Color.GREEN);
		jPanel3.setBackground(Color.red);

		// �󺧰�ü������ ��ü�� �г�2���� ������Ʈ�� �߰�
		JLabel label = new JLabel("JEE (MVC)��") ;
		jPanel2.add(label) ; 
		
		// ��ư��ü����
		JButton button1 = new JButton( "Model : ���� �ڹ�");
		JButton button2 = new JButton( "View : JSP");
		JButton button3 = new JButton( "Controll : ����");
		JButton button4 = new JButton( "(+)�����ͺ��̽� : ����Ŭ");
		
		// �гο� ��ư ��ü �߰�
		jPanel1.add(button1);
		jPanel1.add(button2);
		jPanel1.add(button3);
		jPanel1.add(button4);
		
		// �гο� �г�2 �� �г� 3 �߰�
		jPanel1.add(jPanel2);
		jPanel1.add(jPanel3);
		
		// �����ӿ� �ǳ��� �߰�
		add(jPanel1);
		setLocation(dimension.width/100 , dimension.height/100);
		setVisible(true);
		
	}
}
