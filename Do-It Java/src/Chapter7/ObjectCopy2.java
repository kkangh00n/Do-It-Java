package Chapter7;
//��ü�� ������ (��������)
public class ObjectCopy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("�¹���", "������");
		bookArray1[1] = new Book("���̾�", "�츣�� �켼");
		bookArray1[2] = new Book("��� ����ΰ�", "���ù�");
		
		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		for (int i=0; i<bookArray1.length; i++)
		{
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		
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
		// => �� �����̱� ������ bookArray2�� ������� ����
		
		System.out.println("===== bookArray1 =====");
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
