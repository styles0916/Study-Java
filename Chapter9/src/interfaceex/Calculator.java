package interfaceex;

public abstract class Calculator implements Calc { //Ŭ������ ����ϴ°� �ƴϱ⶧���� extends�� �ƴ϶� implements
	//�޼��� 4�� �� 2���� ������ ������, 2���� �������� �ʾұ� ������ abstract class�� ��.

	@Override
	public int addition(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substraction(int num1, int num2) {
		return num1 - num2;
	}
}
