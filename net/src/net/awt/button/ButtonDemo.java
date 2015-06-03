package net.awt.button;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class ButtonDemo {
	public static void main(String[] args) {
		
		Frame frame = new Frame("�޸���");
		frame.setSize(500, 300);
		
		//toolkit ��ü ����, new �� �ƴ� �޼ҵ帮�Ϲ������ ��ü�� ������Ŵ
		Toolkit toolkit = Toolkit.getDefaultToolkit();
	    // ȭ�� ũ��
		Dimension dim = toolkit.getScreenSize() ; 
		
		
		// ��ư ������ , ũ��, ��ġ ����.
		Button button = new Button("Ȯ��" );
		button.setSize(100,50);
		button.setLocation(100,75);
		
		/*
		 * ������Ʈ ����
		 */
		frame.setLayout(null);  //  null �̸� ��ǥ�� �����Ͽ� ���� ����
		frame.add(button);
		
		
		
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
