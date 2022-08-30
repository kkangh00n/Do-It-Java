package Chapter9.TemplateGame;

public class BeginnerLevel extends Playerlevel {
	@Override
	public void run() {
		System.out.println("천천히 달린다");
	}
	@Override
	public void jump() {
		System.out.println("점프 할 줄 모른다");
	}
	@Override
	public void turn() {
		System.out.println("구를 줄 모른다");
	}
	// public void go (int count) {}   
	// 제네릭 메소드 재정의 불가
}
