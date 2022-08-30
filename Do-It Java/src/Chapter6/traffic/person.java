package Chapter6.traffic;

public class person {
	String name;
	int money;
	
	public person(String name, int money)
	{
		this.name = name; //이름
		this.money = money; //갖고있는 돈
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
		System.out.println(this.name + "님의 남은 돈은 " + this.money + "원입니다");
	}
	
}
