package Chapter13.stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{ //최종연산 reduce의 수행기능을 작성

	@Override
	public String apply(String s1, String s2) { //reduce가 호출될 때 불리는 메소드
		if(s1.getBytes().length >= s2.getBytes().length)
			return s1;
		else
			return s2;
	}
	
}

public class ReduceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] members = {"이기우 백엔드", "양희준 프론트엔드", "김강훈 아무거나"};
		System.out.println(Arrays.stream(members).reduce(new CompareString()).get());
		//방법1. reduce를 통해 수행되는 부분에 CompareString에 구현된 apply메소드 자동 호출
		
		System.out.println(Arrays.stream(members).reduce(" ", (a, b) -> {if (a.length() >= b.length()) return a; else return b;}));
		//방법2. 수행되는 부분에 직접 람다식을 사용하여 구현 (초기값, (전달되는 요소) -> 수행기능)
		
		
	}

}
