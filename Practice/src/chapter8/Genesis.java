package chapter8;

public class Genesis extends Car {

	@Override
	public void start() {
		System.out.println("���׽ý��� �õ��� �̴ϴ�");
	}

	@Override
	public void drive() {
		System.out.println("���׽ý��� �����մϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("���׽ý��� ������ ����ϴ�.");
	}

	@Override
	public void turnoff() {
		System.out.println("���׽ý��� �õ��� ���ϴ�.");
		
	}

	@Override
	public void washCar() {
		System.out.println("���׽ý��� �����մϴ�.");
	}
	
	
	
}
