package Chapter13.stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{ //�������� reduce�� �������� �ۼ�

	@Override
	public String apply(String s1, String s2) { //reduce�� ȣ��� �� �Ҹ��� �޼ҵ�
		if(s1.getBytes().length >= s2.getBytes().length)
			return s1;
		else
			return s2;
	}
	
}

public class ReduceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] members = {"�̱�� �鿣��", "������ ����Ʈ����", "�谭�� �ƹ��ų�"};
		System.out.println(Arrays.stream(members).reduce(new CompareString()).get());
		//���1. reduce�� ���� ����Ǵ� �κп� CompareString�� ������ apply�޼ҵ� �ڵ� ȣ��
		
		System.out.println(Arrays.stream(members).reduce(" ", (a, b) -> {if (a.length() >= b.length()) return a; else return b;}));
		//���2. ����Ǵ� �κп� ���� ���ٽ��� ����Ͽ� ���� (�ʱⰪ, (���޵Ǵ� ���) -> ������)
		
		
	}

}
