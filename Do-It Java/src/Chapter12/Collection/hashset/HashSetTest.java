package Chapter12.Collection.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("�谭��"));
		hashSet.add(new String("������"));
		hashSet.add(new String("�̱��"));
		hashSet.add(new String("�谭��"));
		System.out.println(hashSet);
	}

}
