package Chapter9.abstractt;
//�߻� Ŭ������ ��
public abstract class ExComputer { //�߻� �޼ҵ带 �����ϱ� ������ �߻� Ŭ����

	public abstract void display();  //�߻� �޼ҵ�
	public abstract void typing();  //�߻� �޼ҵ�
	
	public void turnOn() {
		System.out.println("������ ����");
	}
	public void turnOff() {
		System.out.println("������ ����");
	}
	
}