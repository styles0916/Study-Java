package chapter8;

public class Genesis extends Car {

	@Override
	public void start() {
		System.out.println("제네시스의 시동을 겁니다");
	}

	@Override
	public void drive() {
		System.out.println("제네시스를 운전합니다.");
	}

	@Override
	public void stop() {
		System.out.println("제네시스의 운행을 멈춥니다.");
	}

	@Override
	public void turnoff() {
		System.out.println("제네시스의 시동을 끕니다.");
		
	}

	@Override
	public void washCar() {
		System.out.println("제네시스를 세차합니다.");
	}
	
	
	
}
