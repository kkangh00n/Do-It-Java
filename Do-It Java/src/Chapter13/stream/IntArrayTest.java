package Chapter13.stream;

// ���� �迭�� ���� ��Ʈ�� Ȱ��

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class IntArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {5,7,3,1,4,2,8,0}; //���� �迭
		IntStream stream = Arrays.stream(arr); //���� ��Ʈ�� ��ü ����
		stream.sorted().forEach(x -> System.out.println(x)); //��Ʈ�� �����Ͽ� ���
		System.out.println(arr[0]);
		
		String[] arr2 = {"�̹���", "�谭��", "������", "�̱��"}; //���ڿ� �迭
		Stream<String> stream2 = Arrays.stream(arr2); //���ڿ� ��Ʈ�� ��ü ����
		stream2.forEach(x -> System.out.println(x));  //��Ʈ�� ���
		
		
		int sumVal = Arrays.stream(arr).sum(); //��Ʈ�� ���� ����.��Ʈ���� ��
		int count = (int)Arrays.stream(arr).count(); //��Ʈ�� ���� ����.�迭�� ��
		
		System.out.println(sumVal);
		System.out.println(count);
	}

}
