package Chapter10.interfaceePlus;

public interface Calc { //인터페이스 : 기존에는 상수와 추상메소드로만 구성
	double PI = 3.14; 
	int Error = -99999999;
	
	int add(int num, int num2); 
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	int square(int num);
	
	default void description() {  //plus : 디폴트 메소드 구현 => 자바 8부터
		System.out.println("정수 계산기 구현"); 
		myMethod();
	}
	
	 static int total(int[] arr) { //plus : 정적 메소드 구현 : 클래스로 구현하지 않아도 사용 가능
		 int total = 0;
		 
		 for(int i:arr){
			 total+=i;
		 }
		 myStaticMethod();
		 return total;
	 }
	 
	 private void myMethod() { //private 메소드 구현 => 자바 9부터
		 System.out.println("private 메소드이다.");
	 }
	 private static void myStaticMethod() {
		 System.out.println("private static 메소드이다.");
	 }
	
}
