package Chapter12.Collection.treeset;

import java.util.TreeSet; //결과값이 정렬되어 나옴 (이진검색트리)

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> treeset = new TreeSet<>();
		
		treeset.add(123);
		treeset.add(940);
		treeset.add(563);
		treeset.add(123);
		//tree는 순서대로 정렬해 줌 
		System.out.println(treeset);
	}

}
