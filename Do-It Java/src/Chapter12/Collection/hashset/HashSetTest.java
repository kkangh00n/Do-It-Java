package Chapter12.Collection.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("±Ë∞≠»∆"));
		hashSet.add(new String("æÁ»Ò¡ÿ"));
		hashSet.add(new String("¿Ã±‚øÏ"));
		hashSet.add(new String("±Ë∞≠»∆"));
		System.out.println(hashSet);
	}

}
