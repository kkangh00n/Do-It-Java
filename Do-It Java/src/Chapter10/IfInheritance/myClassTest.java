package Chapter10.IfInheritance;

public class myClassTest {
	public static void main(String[] args){
		
		one oneClass = new myClass(); //��ĳ����
		oneClass.One();
		//oneClass.Two(); => Ŭ������ ���� ����� �޼ҵ常 ��� ����!
		
		two twoClass = new myClass();
		twoClass.Two();
		
		myInterface iClass = new myClass();
		//��� �޼ҵ� ȣ�� ����
		iClass.myMethod();
		iClass.One();
		iClass.Two();
		
	}
	
}
