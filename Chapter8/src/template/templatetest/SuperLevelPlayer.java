package template.templatetest;

public class SuperLevelPlayer extends PlayerLevel{

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
	public void flying() {
		System.out.println("������ ����� Ȱ��ȭ �˴ϴ�.");
		System.out.println("�÷��̾ ���� �ֽ��ϴ�.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("==========�ְ�� �����Դϴ�.==========");
	}

}
