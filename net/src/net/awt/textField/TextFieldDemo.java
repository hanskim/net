package net.awt.textField;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Toolkit;

public class TextFieldDemo {

	public static void main(String[] args) {
		
		/*
		 * ������Ʈ ����
		 * 
		 */
		Frame frame = new Frame("�޸���");
		frame.setSize(500, 300);
		
		//toolkit ��ü ����, new �� �ƴ� �޼ҵ帮�Ϲ������ ��ü�� ������Ŵ
		Toolkit toolkit = Toolkit.getDefaultToolkit();
	    // ȭ�� ũ��
		Dimension dim = toolkit.getScreenSize() ; 
		
		
		Label labId = new Label("ID") ; 
		labId.setBounds(50,50,30,30);// �տ� �ΰ��� ��ġ( ���� : frame�� 0,0����) , �ڿ� �ΰ��� ���μ��� ( ���� : �ȼ�)
		
		Label labPwd = new Label("PASSWORD") ; 
		labPwd.setBounds(50, 130, 100, 10);// �տ� �ΰ��� ��ġ( ���� : frame�� 0,0����) , �ڿ� �ΰ��� ���μ��� ( ���� : �ȼ�)
		
		TextField txtId= new TextField(10) ;  // 10���ڸ� �Է��� �� �ִ� ����
		TextField txtPwd = new TextField( 10);
		txtPwd.setEchoChar('*');  // ���ΰ� char Ÿ���̶� ''
		
		frame.setLayout(new FlowLayout());
		frame.add(labId);
		frame.add(txtId);
		frame.add(labPwd);
		frame.add(txtPwd);
		
	
		
		//������Ʈ �������
		frame.setLocation(dim.width/2 , dim.height/2);
		//��üȭ�鿡�� ����, ������ ��ġ�� �д�
		// Ư�� ����� ���ϴ� �ͺ��� ������ó�� dim �� ����ϸ�
		// �������� ȭ�鿡 ���� �������� ������ ȭ���� ũ�� �۵� �߾� �αٿ� ��ġ�ϰ� ��
		frame.setVisible(true);   
		// ���⼭ �������� ���������� ������ Solution �̶�� �� �� �ִ�.
		// terminate�� ������Ѿ���. 
		

	}

}