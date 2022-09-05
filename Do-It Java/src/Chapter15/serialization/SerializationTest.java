package Chapter15.serialization;

//직렬화 : 인스턴스 변수값을 스트림으로 만듦

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{ 									//1. Serializble : 클래스를 직렬화하겠다는 의도를 표시

	
	private static final long serialVersionUID = -6968352997181711430L;	//2. serialVersionUID : 직렬화, 역직렬화 할 때 버전을 비교하기 위함 
	String name;
	transient String job; 												//3. transient : 이 변수는 직렬화하지 않음
	
	public Person() {}
	
	public Person(String name, String job) {
		this.name= name;
		this.job = job;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + "," + job;
	}
}

class Dog implements Externalizable{									//4. Externalizable : 인터페이스 직접 구현하여 객체의 직렬화를 세밀히 제어

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}

	String name;
	
	public Dog() {}
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {	//Externalizable의 메소드
		// TODO Auto-generated method stub
		out.writeUTF(name);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {	//Externalizable의 메소드
		// TODO Auto-generated method stub
		name = in.readUTF();
	}
}




public class SerializationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person personAhn = new Person("안재용", "대표이사");
		Person personKim = new Person("김철수", "상무이사");
		
		try(FileOutputStream fos1 = new FileOutputStream("src/Chapter15/serial.out"); ObjectOutputStream oos1 = new ObjectOutputStream(fos1)){
			//FileOutputStream으로 저장할 파일 스트림을 생성 후, 보조스트림 ObjectOutputStream으로 감쌈
			oos1.writeObject(personAhn); 		//보조스트림을 통해 Person객체 파일에 씀
			oos1.writeObject(personKim);		//보조스트림을 통해 Person객체 파일에 씀
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try(FileInputStream fis1 = new FileInputStream("src/Chapter15/serial.out"); ObjectInputStream ois1 = new ObjectInputStream(fis1)){
			//FileInputStream으로 읽어드릴 파일 스트림을 생성 후, 보조스트림 ObjectInputStream으로 감쌈
			Person p1 = (Person)ois1.readObject();		//보조스트림을 통해 객체를 읽어드리고, Person변수에 저장
			Person p2 = (Person)ois1.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		Dog myDog = new Dog();
		myDog.name = "멍멍이";
		
		try(FileOutputStream fos = new FileOutputStream("src/Chapter15/external.out"); ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(myDog);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try(FileInputStream fis = new FileInputStream("src/Chapter15/external.out"); ObjectInputStream ois = new ObjectInputStream(fis)){
			Dog dog = (Dog)ois.readObject();
			System.out.println(dog);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
