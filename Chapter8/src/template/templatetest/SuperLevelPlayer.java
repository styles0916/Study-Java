package template.templatetest;

public class SuperLevelPlayer extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("매우 빠르게 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("매우 높이 점프합니다.");
	}

	@Override
	public void turn() {
		System.out.println("회전 합니다.");
	}
	
	@Override
	public void flying() {
		System.out.println("숨겨진 기능이 활성화 됩니다.");
		System.out.println("플레이어가 날수 있습니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("==========최고급 레벨입니다.==========");
	}

}
