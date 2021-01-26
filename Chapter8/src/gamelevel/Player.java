package gamelevel;

public class Player{
	
	//이 레벨 변수에 모든 레벨이 들어올 수 있다. (각각 따로 만들면 객체 지향이 아님)
	private PlayerLevel level;

	public Player() {
		level=new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}

	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
}
