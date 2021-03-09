package abstractex;

public abstract class Computer {

//	public void dispaly() {(addBody)} 이것은 추상클래스가 아님.
	public abstract void dispaly();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
}
