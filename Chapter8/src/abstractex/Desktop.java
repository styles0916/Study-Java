package abstractex;

public class Desktop extends Computer { 
	
	//Computer를 상속함으로 Computer의 추상클래스를 상속받기 때문에 상위 클래스의 추상 메서드를 구현하던지(이 경우 Desktop은 일반 클래스), 
	//혹은 해당 클래스를 추상클래스로 만들던지 해야함. (하나라도 구현하지 않은 추상클래스가 있을 경우 역시 추상클래스가 됨.) 
	
	@Override
	public void dispaly() {
		System.out.println("Desktop Display");
	}

	@Override
	public void typing() {
		System.out.println("Desktop Typing");
	}

	@Override
	public void turnOff() {
		System.out.println("Desktop TurnOff");
	}

	
}
