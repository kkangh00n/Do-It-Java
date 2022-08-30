package Chapter9.TemplateGame;

public class Player {
	private Playerlevel level;
	
	public Player(){
		level = new BeginnerLevel();
	}
	public void upgradeLevel(Playerlevel level) {
		this.level = level;
	}
	public void play(int count) {
		level.go(count);
	}
}
