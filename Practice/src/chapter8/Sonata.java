package chapter8;

public class Sonata extends Car {

	@Override
	public void start() {
		System.out.println("�ҳ�Ÿ�� �õ��� �̴ϴ�");
	}

	@Override
	public void drive() {
		System.out.println("�ҳ�Ÿ�� �����մϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("�ҳ�Ÿ�� ������ ����ϴ�.");
	}

	@Override
	public void turnoff() {
		System.out.println("�ҳ�Ÿ�� �õ��� ���ϴ�.");
		
	}
	
}
