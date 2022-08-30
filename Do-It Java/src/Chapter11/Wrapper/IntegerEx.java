package Chapter11.Wrapper;

public class IntegerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer iValue1 = new Integer(100);
		Integer iValue2 = new Integer("100");
		// 자바 9부터는 이 방법을 권장하지 않음
		Integer iValue3 = Integer.valueOf(100);
		// 이 방법을 권장
		
		int myValue1 = iValue3.intValue(); //Integer형의 값을 int형으로 변환
		System.out.println(myValue1);
		
		int myValue2 = Integer.parseInt("100");
		System.out.println(myValue2);
		//문자형 100을 정수로 변환
		String str = iValue3.toString();
		System.out.println(str);
		//Integer형 정수를 문자로 변환
		
		
		int sum1 = iValue3 + myValue2; //Integer형 + int형 => iValue3 언박싱
		System.out.println(sum1);
		Integer sum2 = sum1; //sum1 오토박싱
		System.out.println(sum2);
	}
}
