package Chapter13.stream;

//Collection 인터페이스에 대한 스트림 활용

import java.util.ArrayList;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> sList = new ArrayList<>();
		sList.add("이무성");
		sList.add("양희준");
		sList.add("이기우");
		
		
		Stream<String> stream = sList.stream(); //배열에 대한 스트림 생성 -> Collection 프레임워크는 stream에 대한 메소드 선언되어있음
		stream.forEach(s -> System.out.println(s)); //최종 연산으로 인해 자료 모두 소모
		System.out.println();
		
		sList.stream().sorted().forEach(System.out::println); //스트림 새로 생성. 중간 연산(정렬). 최종 연산(출력)!!!
		
	}
}
