package Chapter12.Collection.treeset;

import java.util.TreeSet; //������� ���ĵǾ� ���� (�����˻�Ʈ��)

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> treeset = new TreeSet<>();
		
		treeset.add(123);
		treeset.add(940);
		treeset.add(563);
		treeset.add(123);
		//tree�� ������� ������ �� 
		System.out.println(treeset);
	}

}
