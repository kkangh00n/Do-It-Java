package Chapter10.interfaceePolymorphism;

public class Priority implements Scheduler{
	public void getNextCall() {
		System.out.println("�켱������ ���� ���� ����� ����´�");
	}
	public void sendCallToAgent() {
		System.out.println("���� �ɷ��� ���� �������� ����Ѵ�.");
	}
}
