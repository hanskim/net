package net.api.awt;


/* AWT
 * 
 * GUI (Graphic User Interface) 환경의 프로그램 및 안드로이드 위젯과 비슷한 개념
 * 
 * 1. 컴포넌트   :   사용자 인터페이스를 구성하는 요소
 *  버튼, 체크박스, 레이블, 텍스트필드, 리스트, 팝업 메뉴와 같은 부속품의 총칭
 *  자바에서는 Component 라는 클래스가 있는데 모든 콤포넌트들은 이 Component 클래스의 자손이다.
 *  
 * 2. 컨테이너 :  Component 자손들 중에 Container와 그 자손을 말함
 *    컨테이너는 콤포넌트들이 붙어있는 윈도우 같은 것
 *    윈도우, 프레임. 패널, 다이얼로그 박스 들이 있다.
 *    (다른 콤포넌트를 담을수 있는 콤포넌트)
 *    
 * 3.레이아웃  : 컨테이너에 콤포넌트를 붙일 때 어떤  식으로 배치할 것인가 
 * 
 * 
 * 4. 이벤드  : 사용자로부터 입력이 일어나는 것
 *    
 * 5. Layout 메니져
 *    컴포넌트를 적절한 위치에 배치할 수 있도록 하기 위해 레이아웃 매니져를  제공
 *    
 *    레이아웃 메니져의 종류
 *    FlowLayout : 왼쪽에서 오른쪽으로, 위에서 아래로, 순서대로 배치하는 단순한 레이아웃
 *    GridLayout  :  가로세로 비율로 나누어 공간(셀)에 배치
 *    BorderLalyout : 동, 서 , 남, 북, 중앙으로 배치   : 프레임의 default  layout 이다. 
 *    CardLayout   : 여리개의 카드를 쌓아둔 것ㄴ처럼 보여주는 레이아웃
 *    GridBayLayout :  가장 복잡한 레이아웃
 *    
 *    null : 레이아웃 메니져를 이용하지 않고 좌표를 지정하여 붙인 배치
 *    
 *    레이아웃 메니져 사용법
 *    setLayout (new Flowlayout)
 *    각 레이아웃의 기본, Flowlayout => panel이나 Applet의 기본 레이아웃
 *    Borderlayout  => Frame 과 Dialog의 기본 레이아웃
 *    
 *    
 */

public class AwtSyntax {
	
	
	}

