package template.templatetest;

public class LowLevelPlayer extends PlayerLevel  {

	@Override
	public void run() {
		System.out.println("õõ�� �޸��ϴ�.");
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
		System.out.println("==========�ʱ� �����Դϴ�.==========");
	}

	
	
}
