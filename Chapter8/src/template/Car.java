package template;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	public void washCar() {} //������ ��� �޼���. �ݵ�� ��� ���� ������ �ؾ��Ѵٸ� abstract�� �����.
	
	final public void run() { //���ϸ� �ȵǴ� �ó������� ������ �� �� ������ �ϱ����� final�� ���.
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}
	
	
	
}
