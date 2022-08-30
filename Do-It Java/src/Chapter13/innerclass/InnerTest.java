package Chapter13.innerclass;

//�ܺ�Ŭ���� -> �ν��Ͻ� ���� Ŭ���� - �ν��Ͻ� ���� Ŭ���������� static ��� �Ұ��� (16��)
//�ܺ�Ŭ���� -> ���� ���� Ŭ���� - static ��� ���� (25��)

class OutClass{ //�ܺ�Ŭ����
	private int num = 10; //�ܺ� �ν��Ͻ�����
	private static int sNum = 20; //�ܺ� ��������
	
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}

	
	
	class InClass{ //�ν��Ͻ� ����Ŭ���� : �ܺ�Ŭ������ �����ؾ� ����Ŭ���� ����(12�� �����ڸ� ���� ����) -> static ������ �޼ҵ� ���� �Ұ�
		int inNum = 100; //���� �ν��Ͻ�����
						//�������� ���� �Ұ�
		void inTest() {
			System.out.println("OutClass num = " + num + "(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ���� ����)");
		}
	}
	
	
	
	static class InStaticClass{ //���� ����Ŭ���� : �ܺ�Ŭ���� �������� �ʾƵ� ��� ���� -> static ���� ����
		int inNum = 100; 		 //���� �ν��Ͻ�����
		static int sInNum = 200; //���� ��������
		
		void inTest() { //���� �ν��Ͻ��޼ҵ�
			System.out.println("InStaticClass num = " + inNum + "(���� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(���� Ŭ������ ���� ����)");
			System.out.println("OutClass sNum = " + sInNum + "(�ܺ� Ŭ������ ���� ����)");
		}
		//�ܺ� �ν��Ͻ����� ȣ��x
		//�ܺ� �������� ȣ��o
		//���� �ν��Ͻ����� ȣ��o
		//���� �������� ȣ��o
		
		
		static void sTest() { //���� �����޼ҵ�
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ���� ���� ���)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(���� Ŭ������ ���� ���� ���)");
		}
		//�ܺ� �ν��Ͻ����� ȣ��x
		//�ܺ� �������� ȣ��o
		//���� �ν��Ͻ����� ȣ��x
		//���� �������� ȣ��o
	}
	
	
	
	public void usingClass() {
		inClass.inTest(); //�ܺ� Ŭ�������� ���� Ŭ������ �޼ҵ�� ����
	}
}

public class InnerTest {

	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("�ܺ� Ŭ���� �̿��Ͽ� ���� Ŭ���� ��� ȣ��");
		outClass.usingClass(); 
		//OutClass.InClass inClass = outClass.new InClass();
		//�̷��� ����ϸ� ����Ŭ������ �ٸ� Ŭ�������� ���� ����� �� ���� -> ������ ����Ŭ���� ��� ������ ���� ���� -> ���� ����Ŭ���� private���� ����

		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		System.out.println("\n���� ���� Ŭ���� �Ϲ� �޼ҵ� ȣ��");
		sInClass.inTest(); 
		
		System.out.println("\n���� ���� Ŭ���� ���� �޼ҵ� ȣ��");
		OutClass.InStaticClass.sTest();
		
		
	}
}
