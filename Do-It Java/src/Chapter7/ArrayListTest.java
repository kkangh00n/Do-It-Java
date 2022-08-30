package Chapter7;
import java.util.ArrayList; //ArrayList 사용 위하여 임포트

//ArrayList => 중간삽입이 안되는 포인터같은 느낌

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> Library= new ArrayList<Book>(10); // <제네릭형>
		
		//add를 사용하여 ArrayList의 요소 추가
		Library.add(new Book("태백산맥", "조정래")); // => ArrayList의 요소 추가, new로 인스턴스를 만들고나서 추가
		Library.add(new Book("데미안", "헤르만 헤세"));
		Library.add(new Book("어떻게 살 것인가", "유시민"));

		for (int i=0; i<Library.size(); i++) {  //size를 이용하여 ArrayList의 크기 추출
			Book book = Library.get(i);  //get을 사용하여 ArrayList의 요소 추출
			System.out.println(book.getBookName() + ", " + Library.get(i).getAuthor());
		}
		
		Library.remove(2); //remove를 이용하여 ArrayList의 2번쨰 인덱스 삭제
		
		System.out.println();
		Library.add(new Book("어린왕자", "생텍쥐페리"));
		
		for (int i=0; i<Library.size(); i++) {  //size를 이용하여 ArrayList의 크기 추출
			Book book = Library.get(i);  //get을 사용하여 ArrayList의 요소 추출
			System.out.println(book.getBookName() + ", " + book.getAuthor());
		}
		
	}

}
