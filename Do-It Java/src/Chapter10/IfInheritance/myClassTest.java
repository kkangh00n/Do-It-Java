package Chapter10.IfInheritance;

public class myClassTest {
	public static void main(String[] args){
		
		one oneClass = new myClass(); //업캐스팅
		oneClass.One();
		//oneClass.Two(); => 클래스형 내의 선언된 메소드만 사용 가능!
		
		two twoClass = new myClass();
		twoClass.Two();
		
		myInterface iClass = new myClass();
		//모든 메소드 호출 가능
		iClass.myMethod();
		iClass.One();
		iClass.Two();
		
	}
	
}
