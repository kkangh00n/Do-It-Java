package Chapter10.interfacee;
// 인터페이스를 모두 구현하지 않은 클래스는 추상클래스
public abstract class Calculator implements Calc {
	public int add(int num1, int num2)
	{
		return num1+num2;
	}
}
