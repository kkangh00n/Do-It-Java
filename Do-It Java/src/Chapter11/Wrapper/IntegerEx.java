package Chapter11.Wrapper;

public class IntegerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer iValue1 = new Integer(100);
		Integer iValue2 = new Integer("100");
		// �ڹ� 9���ʹ� �� ����� �������� ����
		Integer iValue3 = Integer.valueOf(100);
		// �� ����� ����
		
		int myValue1 = iValue3.intValue(); //Integer���� ���� int������ ��ȯ
		System.out.println(myValue1);
		
		int myValue2 = Integer.parseInt("100");
		System.out.println(myValue2);
		//������ 100�� ������ ��ȯ
		String str = iValue3.toString();
		System.out.println(str);
		//Integer�� ������ ���ڷ� ��ȯ
		
		
		int sum1 = iValue3 + myValue2; //Integer�� + int�� => iValue3 ��ڽ�
		System.out.println(sum1);
		Integer sum2 = sum1; //sum1 ����ڽ�
		System.out.println(sum2);
	}
}
