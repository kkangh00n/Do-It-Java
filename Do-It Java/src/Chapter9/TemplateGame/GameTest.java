package Chapter9.TemplateGame;

public class GameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player player = new Player();
		player.play(1);
		
		Advancedlevel advanced = new Advancedlevel();
		player.upgradeLevel(advanced);
		player.play(1);
		
		Superlevel Super = new Superlevel();
		player.upgradeLevel(Super);
		player.play(1);
	}

}
