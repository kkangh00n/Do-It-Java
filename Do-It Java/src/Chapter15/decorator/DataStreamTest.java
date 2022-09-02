package Chapter15.decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileOutputStream fos = new FileOutputStream("src/Chapter15/data.txt"); DataOutputStream dos = new DataOutputStream(fos)){
			
			//파일을 바이트단위로 출력하는 스트림 생성 후, 그 스트림을 데이터의 자료형의 크기를 그대로 보존하는 보조 스트림으로 감쌈!!
			
			//각자 자료형에 알맞게 자료를 씀
			dos.writeByte(100);
			dos.writeChar('A');
			dos.writeInt(10);
			dos.writeFloat(3.14f);
			dos.writeUTF("Test");
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		try(FileInputStream fis = new FileInputStream("src/Chapter15/data.txt"); DataInputStream dis = new DataInputStream(fis)){
			
			//자료형에 맞게 자료를 읽어 출력, 순서도 같아야 함
			
			System.out.println(dis.readByte());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readUTF());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
