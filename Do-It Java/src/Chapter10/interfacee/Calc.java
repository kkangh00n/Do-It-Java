package Chapter10.interfacee;
//�������̽� : �߻�޼ҵ�� ����θ� �̷����

public interface Calc { 
	double PI = 3.14; //������ �������� ����� ��ȯ
	int Error = -99999999;
	
	int add(int num, int num2); //������ �������� �߻�޼ҵ�� ��ȯ
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	int square(int num);
}
