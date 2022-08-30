package Chapter9.TemplateGame;

public abstract class Playerlevel {
	abstract void run();
	abstract void jump();
	abstract void turn();
	
	final public void go(int count) { //템플릿 메소드
		run();
		for (int i=0; i<count; i++)
		{
			jump();
		}
		turn();
	}
	
}
