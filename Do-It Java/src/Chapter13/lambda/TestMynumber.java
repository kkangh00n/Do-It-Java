package Chapter13.lambda;

//1. ���ٽ����� ����

public class TestMynumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNumber max = (x,y) -> (x>y)?x:y; //���ٽ� ����Ͽ� �߻�޼ҵ� ����!!
		System.out.println(max.getMax(10,20));
		
		//=>
		/* ����� �͸� ���� Ŭ������ �͸� ��ü �����Ǵ� ��!!
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
