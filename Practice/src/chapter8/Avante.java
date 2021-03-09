package chapter8;

public class Avante extends Car {

	@Override
	public void start() {
		System.out.println("아반떼의 시동을 겁니다");
	}

	@Override
	public void drive() {
		System.out.println("아반떼를 운전합니다.");
	}

	@Override
	public void stop() {
		System.out.println("아반떼의 운행을 멈춥니다.");
	}

	@Override
	public void turnoff() {
		System.out.println("아반떼의 시동을 끕니다.");
		
	}

}
