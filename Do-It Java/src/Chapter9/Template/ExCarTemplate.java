package Chapter9.Template;

public abstract class ExCarTemplate {

	public abstract void drive(); 
	public abstract void stop();
	
	public void startCar() {
		System.out.println("�õ��� �Ҵ�.");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ����.");
	}
	
	//���ø� �޼ҵ� : �޼ҵ� �������(�ó�����) ����, ���� Ŭ�������� ������ ���� ���� (final)
	final public void run() {  
		startCar();
		drive();
		stop();
		turnOff();
	}
	
	//final �����
	// final ���� : ����� �ǹ�
	// final �޼ҵ� : ������ �Ұ���
	// final Ŭ���� : ��� �Ұ���
	
	
}
