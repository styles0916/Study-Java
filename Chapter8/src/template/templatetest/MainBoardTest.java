package template.templatetest;

public class MainBoardTest {

	public static void main(String[] args) {
		
		Player player = new Player();
		player.play(1);
		
		PlayerLevel mLevel = new MiddleLevelPlayer();
		player.upgradeLevel(mLevel);
		player.play(2);
		
		PlayerLevel hLevel = new HighLevelPlayer();
		player.upgradeLevel(hLevel);
		player.play(3);
//		System.out.println(player.getLevel());
		
		PlayerLevel sLevel = new SuperLevelPlayer();
		player.upgradeLevel(sLevel);
		player.play(3);
		
//		System.out.println(player.getLevel());
	}

}
