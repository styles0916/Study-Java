package chapter8;

public class Grandeur extends Car {

	@Override
	public void start() {
		System.out.println("�׷����� �õ��� �̴ϴ�");
	}

	@Override
	public void drive() {
		System.out.println("�׷����� �����մϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("�׷����� ������ ����ϴ�.");
	}

	@Override
	public void turnoff() {
		System.out.println("�׷����� �õ��� ���ϴ�.");
		
	}
	
}
