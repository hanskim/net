package net.awt.button;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class ButtonDemo {
	public static void main(String[] args) {
		
		Frame frame = new Frame("메모장");
		frame.setSize(500, 300);
		
		//toolkit 객체 생성, new 가 아닌 메소드리턴방식으로 객체를 생성시킴
		Toolkit toolkit = Toolkit.getDefaultToolkit();
	    // 화면 크기
		Dimension dim = toolkit.getScreenSize() ; 
		
		
		// 버튼 생성자 , 크기, 위치 설정.
		Button button = new Button("확인" );
		button.setSize(100,50);
		button.setLocation(100,75);
		
		/*
		 * 컴포넌트 조립
		 */
		frame.setLayout(null);  //  null 이면 좌표를 지정하여 붙이 예제
		frame.add(button);
		
		
		
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
