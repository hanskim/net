package net.awt.Font;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Toolkit;

public class FontDemo {

	public static void main(String[] args) {
		
		Frame frame = new Frame("메모장");
		frame.setSize(500, 300);
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension dim = toolkit.getScreenSize() ; 
		
		Label labId = new Label("Hello AWT") ; 
		labId.setBounds(50,50,30,30);// 앞에 두개는 위치( 기준 : frame의 0,0에서) , 뒤에 두개는 가로세로 ( 단위 : 픽셀)
		
		Font plain = new Font("sherif",Font.PLAIN,20);
		Font italic = new Font("sherif",Font.ITALIC,20);
		Font bold = new Font("sherif",Font.BOLD,20);
		Font bolditalic = new Font("sherif",Font.ITALIC+Font.ITALIC,20);
		
		labId.setFont(bolditalic);
		frame.setLayout(new FlowLayout());
		frame.add(labId);
		
		
		
		
		
		
		
		
		frame.setLocation(dim.width/2 , dim.height/2);
		frame.setVisible(true);   

	}

}
