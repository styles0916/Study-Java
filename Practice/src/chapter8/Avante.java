package chapter8;

public class Avante extends Car {

	@Override
	public void start() {
		System.out.println("�ƹݶ��� �õ��� �̴ϴ�");
	}

	@Override
	public void drive() {
		System.out.println("�ƹݶ��� �����մϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("�ƹݶ��� ������ ����ϴ�.");
	}

	@Override
	public void turnoff() {
		System.out.println("�ƹݶ��� �õ��� ���ϴ�.");
		
	}

}
