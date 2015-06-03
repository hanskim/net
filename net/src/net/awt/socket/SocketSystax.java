package net.awt.socket;

/*
 * Socket Programming
 *  - 소켓  : 프로세스간에 통신에 사용되는 양쪽 끝단 (End Point)
 *  
 *  ex) 전화기 
 *  
 * - 소켓프로그래밍  
 * : 소켓을 이용한 통신 프로그램 
 * : 프로세스간 통신을 위해 마련된 프로그램
 * : 자바에서는 java.net 패키지를 통해 소켓프로그래밍을 지원함
 * 
 * TCP / IP  프로토콜  : 異  기종 (EX. 파이손, 델파이.. 등등 다른 프로그램과의 협력개발시)  시스템간의 통신을 위한 표준 프로토콜
 * 
 * 프로토콜의 집합 
 *  : 내부적으로 TCP, UDP 모두 이 프로토콜에 포함되어 있음
 *  : OSI 7 계층 중 전송계층에 해당됨
 *  
 *  TCP 전송방식  ( 유비보수 시 접근하는 루트) 
 *   - 연결방식  : 연결 후 통신(전화기) 1:1 
 *   - 특징 : 신뢰성 있는 데이터 전송, 데이터의 수신여부를 확인함  데이터가 손실되면 재전송, UDP 보다 전송 속도가 느림
 *   - 해당  클래스 : Socket , ServerSockets
 *   - WAR 압축파일을 서버에다 올리면 알에프티피 같은 것들이.... ? ? 
 *   - 개발 시에는 사용할 일이 없는데 유지보수시 (서버에 올라온 상태에서) TCP 를 통해서 접근하여 유지보수 한다. 
 *   
 *   UDP 전송방식 ( 개발 시 접근하는 루트) 
 *   - 연결방식  : 비연결 방식 (방송, 택배) 1:1 , 1:N ,N:N
 *   - 특징  : 신뢰성 없는 데이터 전송  데이터 수신 여부 확인 안함. 데이터 손실에도 계속 진행, TCP보다 전송 속도가 빠름
 *   - 해당 클래스  : DatagramSocket , DatagramPacket , MulticastSocket 
 *
 */

public class SocketSystax {


}
