package template.templatetest;

public class HighLevelPlayer extends PlayerLevel  {

	@Override
	public void run() {
		System.out.println("�ſ� ������ �޸��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("�ſ� ���� �����մϴ�.");
	}

	@Override
	public void turn() {
		System.out.println("ȸ�� �մϴ�.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("==========��� �����Դϴ�.==========");
	}

	
}
