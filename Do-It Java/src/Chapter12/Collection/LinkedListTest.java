package Chapter12.Collection;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> myList = new LinkedList<>();
		
		myList.addFirst("A"); //���� ó���� �߰�
		myList.add("B");
		myList.addLast("C"); //���� ����
		
		System.out.println(myList);
		
		myList.add(2,"D"); //2��° ��ġ�� �߰�
		System.out.println(myList);
		
		myList.removeLast();
		System.out.println(myList);		
	}

}
