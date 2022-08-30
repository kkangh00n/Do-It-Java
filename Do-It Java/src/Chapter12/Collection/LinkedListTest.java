package Chapter12.Collection;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> myList = new LinkedList<>();
		
		myList.addFirst("A"); //제일 처음에 추가
		myList.add("B");
		myList.addLast("C"); //제일 끝에
		
		System.out.println(myList);
		
		myList.add(2,"D"); //2번째 위치에 추가
		System.out.println(myList);
		
		myList.removeLast();
		System.out.println(myList);		
	}

}
