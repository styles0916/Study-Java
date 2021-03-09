package chapter8;

public class Sonata extends Car {

	@Override
	public void start() {
		System.out.println("소나타의 시동을 겁니다");
	}

	@Override
	public void drive() {
		System.out.println("소나타를 운전합니다.");
	}

	@Override
	public void stop() {
		System.out.println("소나타의 운행을 멈춥니다.");
	}

	@Override
	public void turnoff() {
		System.out.println("소나타의 시동을 끕니다.");
		
	}
	
}
