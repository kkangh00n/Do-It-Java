package Chapter6.traffic;

public class bus {
	String BusNumber; //���� ��ȣ
	int passenger; //�°� ��
	int money; //���ݱ��� ���� ��
	
	public bus(String number)
	{
		BusNumber = number;
	}
	
	public void take(int money)
	{
		this.money+=money;
		this.passenger++;
	}
	public void showInfo()
	{
		System.out.println("�°� �� : " + this.passenger + "  �������� : " + this.money);
	}
}
