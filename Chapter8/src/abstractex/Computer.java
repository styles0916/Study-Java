package abstractex;

public abstract class Computer {

//	public void dispaly() {(addBody)} �̰��� �߻�Ŭ������ �ƴ�.
	public abstract void dispaly();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
	
}
