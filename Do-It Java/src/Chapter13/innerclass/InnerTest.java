package Chapter13.innerclass;

//외부클래스 -> 인스턴스 내부 클래스 - 인스턴스 내부 클래스에서는 static 사용 불가능 (16행)
//외부클래스 -> 정적 내부 클래스 - static 사용 가능 (25행)

class OutClass{ //외부클래스
	private int num = 10; //외부 인스턴스변수
	private static int sNum = 20; //외부 정적변수
	
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}

	
	
	class InClass{ //인스턴스 내부클래스 : 외부클래스를 생성해야 내부클래스 생성(12행 생성자를 통해 생성) -> static 변수와 메소드 선언 불가
		int inNum = 100; //내부 인스턴스변수
						//정적변수 선언 불가
		void inTest() {
			System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수)");
		}
	}
	
	
	
	static class InStaticClass{ //정적 내부클래스 : 외부클래스 생성하지 않아도 사용 가능 -> static 선언 가능
		int inNum = 100; 		 //내부 인스턴스변수
		static int sInNum = 200; //내부 정적변수
		
		void inTest() { //내부 인스턴스메소드
			System.out.println("InStaticClass num = " + inNum + "(내부 클래스의 인스턴스 변수)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 정적 변수)");
			System.out.println("OutClass sNum = " + sInNum + "(외부 클래스의 정적 변수)");
		}
		//외부 인스턴스변수 호출x
		//외부 정적변수 호출o
		//내부 인스턴스변수 호출o
		//내부 정적변수 호출o
		
		
		static void sTest() { //내부 정적메소드
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수 사용)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용)");
		}
		//외부 인스턴스변수 호출x
		//외부 정적변수 호출o
		//내부 인스턴스변수 호출x
		//내부 정적변수 호출o
	}
	
	
	
	public void usingClass() {
		inClass.inTest(); //외부 클래스에서 내부 클래스의 메소드로 접근
	}
}

public class InnerTest {

	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
		outClass.usingClass(); 
		//OutClass.InClass inClass = outClass.new InClass();
		//이렇게 사용하면 내부클래스를 다른 클래스에서 직접 사용할 수 있음 -> 하지만 내부클래스 사용 목적과 맞지 않음 -> 따라서 내부클래스 private으로 설정

		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		System.out.println("\n정적 내부 클래스 일반 메소드 호출");
		sInClass.inTest(); 
		
		System.out.println("\n정적 내부 클래스 정적 메소드 호출");
		OutClass.InStaticClass.sTest();
		
		
	}
}
