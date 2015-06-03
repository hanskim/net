package net.awt.label;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Toolkit;

public class LabelDemo {

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
		
		
		frame.setLayout(null);
	//	frame.setLayout(new FlowLayout());
		// layout�Ŵ����߿��� flowlayout ����ϰڴ�.
		frame.add(labId);
		frame.add(labPwd);
		

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
