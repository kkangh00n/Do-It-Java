package Chapter10.interfaceePolymorphism;

public class LeastJob implements Scheduler{
	public void getNextCall() {
		System.out.println("��� ��ȭ�� ���������� ��⿭���� �����´�");
	}
	public void sendCallToAgent() {
		System.out.println("��Ⱑ ���� �������� ���� ����Ѵ�");
	}
}
