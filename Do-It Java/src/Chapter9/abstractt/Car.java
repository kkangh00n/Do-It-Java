package Chapter9.abstractt;

public abstract class Car {

	public abstract void run(); 
	public abstract void refuel();

	//run�� refuel�� ������ ��ӵǾ����� ������(�޼ҵ� �������̵�) �� ���̱� ������, ������ �� ���´�!!!
	// => �߻� Ŭ������ ����ϴ� ����
	
	public void stop() {
		System.out.println("���� ����ϴ�.");
	}
	
}
