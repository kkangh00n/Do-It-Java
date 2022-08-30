package Chapter10.interfaceePolymorphism;
import java.io.IOException;
// 인터페이스의 다형성!!
public class Test {

	public static void main(String[] args) throws IOException{ //입출력 아직 안배움 ㅎㅎ
		// TODO Auto-generated method stub
		System.out.println("업무 방식을 선택");
		System.out.println("R : 상담원들이 순차적으로 진행");
		System.out.println("L : 대기가 적은 상담원이 진행");
		System.out.println("P : 우선순위가 높은 고객부터 할당");
		
		int ch = System.in.read();
		Scheduler sc = null; //객체만 생성
		
		if (ch == 'R' || ch == 'r') {
			sc = new RoundRobin(); //업캐스팅
			sc.getNextCall();
			sc.sendCallToAgent(); //sc는 Scheduler인터페이스의 객체, 하지만 오버라이딩 된 메소드 사용
		}
		else if (ch == 'L' || ch == 'l') {
			sc = new LeastJob(); //업캐스팅
			sc.getNextCall();
			sc.sendCallToAgent();
		}
		else if (ch == 'P' || ch == 'p') {
			sc = new Priority(); //업캐스팅
			sc.getNextCall();
			sc.sendCallToAgent();
		}
		else {
			System.out.println("지원되지 않는 기능");
		}
	}

}
