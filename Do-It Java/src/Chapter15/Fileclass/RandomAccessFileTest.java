package Chapter15.Fileclass;

//파일 포인터를 통해 파일의 현재 위치를 가리킴

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		RandomAccessFile rf = new RandomAccessFile("src/Chapter15/Fileclass/random.txt", "rw");
		
		rf.writeInt(100);												//4바이트
		System.out.println("파일 포인터 위치:" + rf.getFilePointer());
		rf.writeDouble(3.14);											//8바이트
		System.out.println("파일 포인터 위치:" + rf.getFilePointer());
		rf.writeUTF("안녕하세요");											//한글사용 3*5 + null문자 2 = 17바이트
		System.out.println("파일 포인터 위치:" + rf.getFilePointer());
		
		rf.seek(0);														//포인터를 0으로 위치시킴. 우리가 읽어야 할 파일은 맨 처음인 0부터이다.
		System.out.println("파일 포인터 위치:" + rf.getFilePointer());
		
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println("파일 포인터 위치:" + rf.getFilePointer());
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
	}

}
