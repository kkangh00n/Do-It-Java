package Chapter10.extendsandimplements;

public class BookShelfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookShelf shelf = new BookShelf();
		
		shelf.enQueue("�����");
		shelf.enQueue("�ҳ���");
		shelf.enQueue("����");
		
		System.out.println(shelf.deQueue());
		System.out.println(shelf.deQueue());
		System.out.println(shelf.deQueue());
	}

}
