package Chapter7;
//객체의 값복사 (깊은복사)
public class ObjectCopy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥", "조정래");
		bookArray1[1] = new Book("데미안", "헤르만 헤세");
		bookArray1[2] = new Book("어떻게 살것인가", "유시민");
		
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
		
		bookArray1[0].setBookName("이기우");
		bookArray1[0].setAuthor("양희준");
		// => 값 복사이기 때문에 bookArray2는 변경되지 않음
		
		System.out.println("===== bookArray1 =====");
		for(Book book:bookArray1)
		{
			System.out.println(book.getBookName() + ", " + book.getAuthor());
		}
		System.out.println("===== 변경 한 후의 bookArray2 =====");
		for(Book book:bookArray2)
		{
			System.out.println(book.getBookName() + ", " + book.getAuthor());
		}
		
	}

}
