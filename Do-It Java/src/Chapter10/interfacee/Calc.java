package Chapter10.interfacee;
//인터페이스 : 추상메소드와 상수로만 이루어짐

public interface Calc { 
	double PI = 3.14; //컴파일 과정에서 상수로 변환
	int Error = -99999999;
	
	int add(int num, int num2); //컴파일 과정에서 추상메소드로 변환
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	int square(int num);
}
