package abstractex;

public class Desktop extends Computer { 
	
	//Computer�� ��������� Computer�� �߻�Ŭ������ ��ӹޱ� ������ ���� Ŭ������ �߻� �޼��带 �����ϴ���(�� ��� Desktop�� �Ϲ� Ŭ����), 
	//Ȥ�� �ش� Ŭ������ �߻�Ŭ������ ������� �ؾ���. (�ϳ��� �������� ���� �߻�Ŭ������ ���� ��� ���� �߻�Ŭ������ ��.) 
	
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
