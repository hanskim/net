package net.awt.socket;

/*
 * 다자간 채팅
 * 
 * 1. 서버
 * 병행처리를 위한 client 객체생성 (사용자 정의 클래스)
 * Vector에 생성된 client 객체 추가 (객체 카운트)
 * 각각의  client 에 대한  Thread 객체 생성
 * -스레드 시작
 * -run() 메서드에서 호출名 을 읽어 txt에 출력
 * 각각의  client에게 접속된 사용자이름을 보냄  : 브로드캐스팅
 * 
 * 2. 클라이언트 
 * 본인의 이름을 서버에 전송
 * 서버로부터 밭은 호출명을 출력화면에 보여줌
 * input 창을 통해 대화전송
 * 
 */

public class ChattingSyntax {

}
