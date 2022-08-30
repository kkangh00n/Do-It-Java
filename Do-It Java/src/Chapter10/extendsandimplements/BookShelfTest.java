package Chapter10.extendsandimplements;

public class BookShelfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookShelf shelf = new BookShelf();
		
		shelf.enQueue("어린왕자");
		shelf.enQueue("소나기");
		shelf.enQueue("감자");
		
		System.out.println(shelf.deQueue());
		System.out.println(shelf.deQueue());
		System.out.println(shelf.deQueue());
	}

}
