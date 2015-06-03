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
		 * ������Ʈ ����
		 * 
		 */
		Frame frame = new Frame("�޸���");
		frame.setSize(500, 300);
		
		//toolkit ��ü ����, new �� �ƴ� �޼ҵ帮�Ϲ������ ��ü�� ������Ŵ
		Toolkit toolkit = Toolkit.getDefaultToolkit();
	    // ȭ�� ũ��
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
	     * ������Ʈ ����
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
