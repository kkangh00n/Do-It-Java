package Chapter13.lambda;

//함수형 인터페이스

@FunctionalInterface //메소드 하나만 선언 가능
public interface MyNumber {
	int getMax(int num1, int num2);
}
