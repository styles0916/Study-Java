package abstractex;

public class ComputerTest {

	public static void main(String[] args) {

//		Computer com = new Computer(); �߻�Ŭ������ �ν��Ͻ�ȭ �� �� ����.
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
