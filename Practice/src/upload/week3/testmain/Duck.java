package upload.week3.testmain;

public interface Duck {

	final String quack = "�� ��!";
	public default void quack() {
		System.out.println(quack);
	}
	public void walking();
	public void flying();
	
	
}
