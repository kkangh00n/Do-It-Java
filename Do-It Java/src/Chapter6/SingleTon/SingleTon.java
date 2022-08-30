package Chapter6.SingleTon;

public class SingleTon {

	private static SingleTon Company = new SingleTon(); // static������ �ν��Ͻ� ����
	
	private SingleTon() {}  // �����ڸ� private���� �����Ͽ� �Ժη� �ν��Ͻ��� ������ ����
	
	public static SingleTon getInstance() { // private�� �����ڸ� �����Ű�� �Լ�, ���� �ν��Ͻ��� ������� ���¶�� ����
		if (Company == null)
		{
			Company = new SingleTon();
		}
		return Company;
	}
}
