package template;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public void washCar() {} //선택적 사용 메서드. 반드시 모든 차가 세차를 해야한다면 abstract를 써야함.
	
	final public void run() { //변하면 안되는 시나리오를 재정의 할 수 없도록 하기위해 final을 사용.
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}
	
	
	
}
