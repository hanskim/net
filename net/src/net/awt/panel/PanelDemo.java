package net.awt.panel;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Toolkit;

public class PanelDemo {

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
		
	
		
		Panel panel = new Panel() ; 
		panel.setBackground(Color.green);
		panel.setSize(100,100);
		panel.setLocation(50, 50);
		
		/*
		 * [2] ������Ʈ�� ����
		 * 
		 */
		
		Button ok = new Button("ok");
		
		panel.add(ok);
		frame.add(panel);
		
		
		
	
		
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
