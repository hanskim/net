package net.awt.textArea;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.Toolkit;

public class TextAreaDemo {
	public static void main(String[] args) {
		
		Frame frame = new Frame("�޸���");
		frame.setSize(500, 300);
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension dim = toolkit.getScreenSize() ; 
		
		
		TextArea area = new TextArea("�ذ������ס�  \n",20,50 );
		area.selectAll();  // �Է� ���� ��ü ����
		
		frame.setLayout(new FlowLayout());
		frame.add(area);
		
		
		
		
		
		frame.setLocation(dim.width/2 , dim.height/2);
		frame.setVisible(true);   
		
	}

}
