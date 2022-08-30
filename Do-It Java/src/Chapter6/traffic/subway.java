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
		System.out.println("½Â°´ ¼ö : " + this.passenger + "  ÁöÇÏÃ¶¼öÀÔ : " + this.money);
	}
}
