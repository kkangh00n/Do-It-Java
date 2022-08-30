package Chapter10.extendsandimplements;
//큐 구현을 위한 인터페이스
public interface Queue {
	void enQueue(String title); //큐 삽입
	String deQueue();  //큐 삭제
	int getSize(); //큐의 크기
}
