package Chapter10.interfaceePolymorphism;
import java.io.IOException;
// �������̽��� ������!!
public class Test {

	public static void main(String[] args) throws IOException{ //����� ���� �ȹ�� ����
		// TODO Auto-generated method stub
		System.out.println("���� ����� ����");
		System.out.println("R : �������� ���������� ����");
		System.out.println("L : ��Ⱑ ���� ������ ����");
		System.out.println("P : �켱������ ���� ������ �Ҵ�");
		
		int ch = System.in.read();
		Scheduler sc = null; //��ü�� ����
		
		if (ch == 'R' || ch == 'r') {
			sc = new RoundRobin(); //��ĳ����
			sc.getNextCall();
			sc.sendCallToAgent(); //sc�� Scheduler�������̽��� ��ü, ������ �������̵� �� �޼ҵ� ���
		}
		else if (ch == 'L' || ch == 'l') {
			sc = new LeastJob(); //��ĳ����
			sc.getNextCall();
			sc.sendCallToAgent();
		}
		else if (ch == 'P' || ch == 'p') {
			sc = new Priority(); //��ĳ����
			sc.getNextCall();
			sc.sendCallToAgent();
		}
		else {
			System.out.println("�������� �ʴ� ���");
		}
	}

}
