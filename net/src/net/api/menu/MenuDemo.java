package net.api.menu;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Toolkit;

public class MenuDemo {
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
		
	    MenuBar menuBar = new MenuBar( );
	    Menu menufile = new Menu("file");
	    
	    MenuItem itemNew = new MenuItem("New" );
	    MenuItem itemOpen = new MenuItem("Open");
	    Menu subMenu = new Menu( "Others");
	    MenuItem itemExit = new MenuItem("Exit" );
	    
	    MenuItem submenuPrint = new MenuItem( "Print");
	    MenuItem submenuPreview = new MenuItem( "Preview");
	    MenuItem submenuSetup = new MenuItem( "PrintSetup");
	    
	    
	    /*
	     * 콤포넌트 조립
	     */
	    
	   subMenu.add(submenuPrint);
	   subMenu.add(submenuPreview);
	   subMenu.add(submenuSetup);
	   
	  Menu menuEdit = new Menu("Edit" );
	  Menu menuView = new Menu("View" );
	  Menu menuHelp = new Menu("Help" );
	  
	  menufile.add(itemNew);
	  menufile.add(itemOpen);
	  menufile.add(subMenu);
	  menufile.addSeparator();
	  menufile.add(itemExit);
	  
	  menuBar.add(menufile);
	  menuBar.add(menuEdit);
	  menuBar.add(menuView);
	  menuBar.setHelpMenu(menuHelp);
	  
	  frame.setMenuBar(menuBar);

	
		
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
