package Chapter9.TemplateGame;

public class Superlevel extends Playerlevel {
	@Override
	public void run() {
		System.out.println("��û ���� �޸���");
	}
	@Override
	public void jump() {
		System.out.println("���� ���� �����Ѵ�");
	}
	@Override
	public void turn() {
		System.out.println("������");
	}
}
