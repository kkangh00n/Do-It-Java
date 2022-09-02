package Chapter15.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(FileInputStream fis = new FileInputStream("src/Chapter15/input2.txt");	){	
			//바이트 단위로 파일을 읽어드리는 스트림 선언
			byte[] bs = new byte[10];		//바이트 배열 선언
			int i;
			while((i = fis.read(bs)) != -1) {		//스트림으로부터 bs의 크기만큼 bs에 읽는다.(i는 파일을 읽은 자료의 byte 수) -> 파일이 끝날 때까지 반복
				for (int k=0; k<i; k++) {					//바이트 배열을 반복하여 읽어드린 수 만큼(i만큼) 반복하여
					System.out.print((char)bs[k]);		//출력한다.
				}
				System.out.println(":" + i + "바이트 읽음");	
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
