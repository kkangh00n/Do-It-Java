package Chapter13.lambda;

public class MaxNumber implements MyNumber{
	@Override
	public int getMax(int num1, int num2) {
		if (num1>num2) {
			return num1;
		}
		return num2;
	}
}
