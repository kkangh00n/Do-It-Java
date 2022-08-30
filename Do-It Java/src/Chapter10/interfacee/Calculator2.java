package Chapter10.interfacee;

public class Calculator2 extends Calculator{ //모두 구현하였으므로 추상 클래스가 아님.
	public int substract(int num1, int num2)
	{
		return num1-num2;
	}
	public int times(int num1, int num2)
	{
		return num1*num2;
	}
	public int divide(int num1, int num2)
	{
		if (num2==0)
		{
			return Error;
		}
		else
			return num1/num2;
	}
	
	public int square(int num)
	{
		return num*num;
	}
	
	public void showInfo()
	{
		System.out.println("Calc 인터페이스를 구현");
	}
}
