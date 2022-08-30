package Chapter10.extendsandimplements;
import java.util.ArrayList;
//선반의 종류를 상속하기 위한 클래스
public class Shelf {
	protected ArrayList<String> shelf; //선반 배열 
	
	public Shelf() { //생성자
		shelf = new ArrayList<String>();
	}
	public ArrayList<String> getShelf(){ //
		return shelf;
	}
	public int getCount() {
		return shelf.size();
	}
}
