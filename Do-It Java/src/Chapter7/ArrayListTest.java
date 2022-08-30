package Chapter7;
import java.util.ArrayList; //ArrayList ��� ���Ͽ� ����Ʈ

//ArrayList => �߰������� �ȵǴ� �����Ͱ��� ����

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> Library= new ArrayList<Book>(10); // <���׸���>
		
		//add�� ����Ͽ� ArrayList�� ��� �߰�
		Library.add(new Book("�¹���", "������")); // => ArrayList�� ��� �߰�, new�� �ν��Ͻ��� ������� �߰�
		Library.add(new Book("���̾�", "�츣�� �켼"));
		Library.add(new Book("��� �� ���ΰ�", "���ù�"));

		for (int i=0; i<Library.size(); i++) {  //size�� �̿��Ͽ� ArrayList�� ũ�� ����
			Book book = Library.get(i);  //get�� ����Ͽ� ArrayList�� ��� ����
			System.out.println(book.getBookName() + ", " + Library.get(i).getAuthor());
		}
		
		Library.remove(2); //remove�� �̿��Ͽ� ArrayList�� 2���� �ε��� ����
		
		System.out.println();
		Library.add(new Book("�����", "�������丮"));
		
		for (int i=0; i<Library.size(); i++) {  //size�� �̿��Ͽ� ArrayList�� ũ�� ����
			Book book = Library.get(i);  //get�� ����Ͽ� ArrayList�� ��� ����
			System.out.println(book.getBookName() + ", " + book.getAuthor());
		}
		
	}

}
