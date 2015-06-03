package net.awt.label;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Toolkit;

public class LabelDemo {

	public static void main(String[] args) {
		
		/*
		 * 컴포넌트 생성
		 * 
		 */
		Frame frame = new Frame("메모장");
		frame.setSize(500, 300);
		
		//toolkit 객체 생성, new 가 아닌 메소드리턴방식으로 객체를 생성시킴
		Toolkit toolkit = Toolkit.getDefaultToolkit();
	    // 화면 크기
		Dimension dim = toolkit.getScreenSize() ; 
		
		
		Label labId = new Label("ID") ; 
		labId.setBounds(50,50,30,30);// 앞에 두개는 위치( 기준 : frame의 0,0에서) , 뒤에 두개는 가로세로 ( 단위 : 픽셀)
		
		Label labPwd = new Label("PASSWORD") ; 
		labPwd.setBounds(50, 130, 100, 10);// 앞에 두개는 위치( 기준 : frame의 0,0에서) , 뒤에 두개는 가로세로 ( 단위 : 픽셀)
		
		
		frame.setLayout(null);
	//	frame.setLayout(new FlowLayout());
		// layout매니져중에서 flowlayout 사용하겠다.
		frame.add(labId);
		frame.add(labPwd);
		

		//콤포넌트 구현방법
		frame.setLocation(dim.width/2 , dim.height/2);
		//전체화면에서 절반, 절반의 위치에 둔다
		// 특정 사이즈를 접하는 것보다 위에서처럼 dim 을 사용하면
		// 보여지는 화면에 따라 동적으로 무조건 화면이 크든 작든 중앙 부근에 위치하게 됨
		frame.setVisible(true);   
		// 여기서 보여지는 웹브라우져가 일종의 Solution 이라고 할 수 있다.
		// terminate로 종료시켜야함. 
		

	}

}
