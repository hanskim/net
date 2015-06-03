package net.awt.textArea;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.Toolkit;

public class TextAreaDemo {
	public static void main(String[] args) {
		
		Frame frame = new Frame("메모장");
		frame.setSize(500, 300);
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension dim = toolkit.getScreenSize() ; 
		
		
		TextArea area = new TextArea("※공지사항※  \n",20,50 );
		area.selectAll();  // 입력 글자 전체 선택
		
		frame.setLayout(new FlowLayout());
		frame.add(area);
		
		
		
		
		
		frame.setLocation(dim.width/2 , dim.height/2);
		frame.setVisible(true);   
		
	}

}
