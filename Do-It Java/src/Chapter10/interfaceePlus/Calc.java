package Chapter10.interfaceePlus;

public interface Calc { //�������̽� : �������� ����� �߻�޼ҵ�θ� ����
	double PI = 3.14; 
	int Error = -99999999;
	
	int add(int num, int num2); 
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	int square(int num);
	
	default void description() {  //plus : ����Ʈ �޼ҵ� ���� => �ڹ� 8����
		System.out.println("���� ���� ����"); 
		myMethod();
	}
	
	 static int total(int[] arr) { //plus : ���� �޼ҵ� ���� : Ŭ������ �������� �ʾƵ� ��� ����
		 int total = 0;
		 
		 for(int i:arr){
			 total+=i;
		 }
		 myStaticMethod();
		 return total;
	 }
	 
	 private void myMethod() { //private �޼ҵ� ���� => �ڹ� 9����
		 System.out.println("private �޼ҵ��̴�.");
	 }
	 private static void myStaticMethod() {
		 System.out.println("private static �޼ҵ��̴�.");
	 }
	
}
