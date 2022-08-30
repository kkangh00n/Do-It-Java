package Chapter10.interfaceePolymorphism;

public class Priority implements Scheduler{
	public void getNextCall() {
		System.out.println("우선순위가 높은 고객의 상담을 갖고온다");
	}
	public void sendCallToAgent() {
		System.out.println("업무 능력이 좋은 상담원에게 배분한다.");
	}
}
