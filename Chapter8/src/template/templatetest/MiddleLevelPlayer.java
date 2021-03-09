package template.templatetest;

public class MiddleLevelPlayer extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("빠르게 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("높이 점프 합니다.");
	}

	@Override
	public void turn() {
		System.out.println("I can't Turn!");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("==========중급 레벨입니다.==========");
	}
	
}
