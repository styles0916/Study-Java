package template.templatetest;

public class LowLevelPlayer extends PlayerLevel  {

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("I can't Jump!");
	}

	@Override
	public void turn() {
		System.out.println("I can't Turn!");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("==========초급 레벨입니다.==========");
	}

	
	
}
