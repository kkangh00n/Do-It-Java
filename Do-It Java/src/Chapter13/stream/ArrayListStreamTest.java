package Chapter13.stream;

//Collection �������̽��� ���� ��Ʈ�� Ȱ��

import java.util.ArrayList;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> sList = new ArrayList<>();
		sList.add("�̹���");
		sList.add("������");
		sList.add("�̱��");
		
		
		Stream<String> stream = sList.stream(); //�迭�� ���� ��Ʈ�� ���� -> Collection �����ӿ�ũ�� stream�� ���� �޼ҵ� ����Ǿ�����
		stream.forEach(s -> System.out.println(s)); //���� �������� ���� �ڷ� ��� �Ҹ�
		System.out.println();
		
		sList.stream().sorted().forEach(System.out::println); //��Ʈ�� ���� ����. �߰� ����(����). ���� ����(���)!!!
		
	}
}
