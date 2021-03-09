package abstractex;

public class ComputerTest {

	public static void main(String[] args) {

//		Computer com = new Computer(); 추상클래스는 인스턴스화 할 수 없음.
		Computer com = new Desktop();
		com.dispaly();
		com.turnOff();
		com.turnOn();
		
		Notebook myNote = new MyNotebook();
		myNote.dispaly();
		myNote.turnOn();
		myNote.turnOff();
		myNote.typing();
	}

}
