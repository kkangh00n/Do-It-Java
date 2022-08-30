package Chapter9.TemplateGame;

public class Advancedlevel extends Playerlevel {
	@Override
	public void run() {
		System.out.println("빨리 달린다");
	}
	@Override
	public void jump() {
		System.out.println("높이 점프한다");
	}
	@Override
	public void turn() {
		System.out.println("구를 줄 모른다");
	}
}
