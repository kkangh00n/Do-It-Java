package Chapter10.extendsandimplements;
import java.util.ArrayList;
//������ ������ ����ϱ� ���� Ŭ����
public class Shelf {
	protected ArrayList<String> shelf; //���� �迭 
	
	public Shelf() { //������
		shelf = new ArrayList<String>();
	}
	public ArrayList<String> getShelf(){ //
		return shelf;
	}
	public int getCount() {
		return shelf.size();
	}
}
