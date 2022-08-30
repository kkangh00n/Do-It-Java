package Chapter9.TemplateGame;

public class Superlevel extends Playerlevel {
	@Override
	public void run() {
		System.out.println("엄청 빨리 달린다");
	}
	@Override
	public void jump() {
		System.out.println("완전 높이 점프한다");
	}
	@Override
	public void turn() {
		System.out.println("구른다");
	}
}
