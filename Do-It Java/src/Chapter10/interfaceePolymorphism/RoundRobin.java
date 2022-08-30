package Chapter10.interfaceePolymorphism;

public class RoundRobin implements Scheduler {
	public void getNextCall() {
		System.out.println("상담 전화를 순차적으로 대기열에서 가져온다");
	}
	public void sendCallToAgent() {
		System.out.println("다음 순서 상담원에게 배분한다");
	}
}
