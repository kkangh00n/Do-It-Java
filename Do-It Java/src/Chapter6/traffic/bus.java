package Chapter6.traffic;

public class bus {
	String BusNumber; //¹ö½º ¹øÈ£
	int passenger; //½Â°´ ¼ö
	int money; //Áö±İ±îÁö ¹ŞÀº µ·
	
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
		System.out.println("½Â°´ ¼ö : " + this.passenger + "  ¹ö½º¼öÀÔ : " + this.money);
	}
}
