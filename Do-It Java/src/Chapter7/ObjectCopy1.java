package Chapter7;
// ��ü�� �ּҺ��� (��������)
public class ObjectCopy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("�¹���", "������");
		bookArray1[1] = new Book("���̾�", "�츣�� �켼");
		bookArray1[2] = new Book("��� ����ΰ�", "���ù�");
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3); // -> bookArray2�� �ν��Ͻ��� ������ �ʾƵ� ����
		
		System.out.println("===== bookArray1 =====");
		for(Book book:bookArray1)
		{
			System.out.println(book.getBookName() + ", " + book.getAuthor());
		}
		System.out.println("===== bookArray2 =====");
		for(Book book:bookArray2)
		{
			System.out.println(book.getBookName() + ", " + book.getAuthor());
		}
		
		bookArray1[0].setBookName("�̱��");
		bookArray1[0].setAuthor("������");
		// => �ּҺ����̱� ������ bookArray2�� ����
		
		System.out.println("===== ���� ���� bookArray1 =====");
		for(Book book:bookArray1)
		{
			System.out.println(book.getBookName() + ", " + book.getAuthor());
		}
		System.out.println("===== ���� �� ���� bookArray2 =====");
		for(Book book:bookArray2)
		{
			System.out.println(book.getBookName() + ", " + book.getAuthor());
		}
		
	}

}
