package Chapter6.traffic;

public class person {
	String name;
	int money;
	
	public person(String name, int money)
	{
		this.name = name; //�̸�
		this.money = money; //�����ִ� ��
	}
	
	public void takebus(bus bus)
	{
		bus.take(1250);
		this.money-=1250;
		
	}
	public void takesubway(subway subway)
	{
		subway.take(1000);
		this.money-=1000;
	}
	public void showInfo()
	{
		System.out.println(this.name + "���� ���� ���� " + this.money + "���Դϴ�");
	}
	
}
