package net.api.swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


/*
 * 프레임의 기본 레이아웃 관리자는  BoarderLayout(동서남북)
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
		setTitle("JEE (MVC)모델" );
		
		Toolkit toolkit = Toolkit.getDefaultToolkit() ;
		Dimension dimension = toolkit.getScreenSize() ;
		
		//패널객체 생성 
		JPanel jPanel1 = new JPanel() ;
		JPanel jPanel2 = new JPanel() ;
		JPanel jPanel3 = new JPanel() ;
		
		// 패널 색상 변경 
		jPanel1.setBackground(Color.yellow);
		jPanel2.setBackground(Color.GREEN);
		jPanel3.setBackground(Color.red);

		// 라벨객체생성된 객체를 패널2에의 콤포넌트로 추가
		JLabel label = new JLabel("JEE (MVC)모델") ;
		jPanel2.add(label) ; 
		
		// 버튼객체생성
		JButton button1 = new JButton( "Model : 순수 자바");
		JButton button2 = new JButton( "View : JSP");
		JButton button3 = new JButton( "Controll : 서블릿");
		JButton button4 = new JButton( "(+)데이터베이스 : 오라클");
		
		// 패널에 버튼 객체 추가
		jPanel1.add(button1);
		jPanel1.add(button2);
		jPanel1.add(button3);
		jPanel1.add(button4);
		
		// 패널에 패널2 와 패널 3 추가
		jPanel1.add(jPanel2);
		jPanel1.add(jPanel3);
		
		// 프레임에 판넬을 추가
		add(jPanel1);
		setLocation(dimension.width/100 , dimension.height/100);
		setVisible(true);
		
	}
}
