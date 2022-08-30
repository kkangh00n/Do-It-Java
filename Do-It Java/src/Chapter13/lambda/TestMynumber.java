package Chapter13.lambda;

//1. 람다식으로 구현

public class TestMynumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNumber max = (x,y) -> (x>y)?x:y; //람다식 사용하여 추상메소드 구현!!
		System.out.println(max.getMax(10,20));
		
		//=>
		/* 사실은 익명 내부 클래스로 익명 객체 생성되는 것!!
		MyNumber max = new MyNumber() {
			@Override
			int getMax(int num1, int num2) {
				if (num1>num2) {
					return num1;
				}
				return num2;
			}
		}
		*/
		
	}
}
