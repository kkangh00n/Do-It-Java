package Chapter6.traffic;

public class subway {
	String linenumber;
	int passenger;
	int money;
	
	public subway(String number)
	{
		linenumber = number;
	}
	public void take(int money)
	{
		this.money+=money;
		this.passenger++;
	}
	public void showInfo()
	{
		System.out.println("�°� �� : " + this.passenger + "  ����ö���� : " + this.money);
	}
}
