package game;

public class MainBoardPlay {

	public static void main(String[] args) {
		
		Player player = new Player();
		player.play(1);
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
	}

}



//다형성에 의해 인스턴스가 불림 개이득임 if 안써도된다. 
//레벨을 추가하려면 클래스 추가해서 상속받으면 된다~~
