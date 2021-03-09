package chapter5.coffeshop;

public class Person {
	
	public String name;
	public int money;

	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeStarCoffee(StarCafe sCafe, int money){
		String message = sCafe.takeCoffee(money);
		if(message != null) {
			this.money -= money;
			System.out.println(name + "���� " + money + "������ " + message);
		}
	}
	
	public void takeBeanCoffee(BeanCafe bCafe, int money) {
		String message = bCafe.takeCoffee(money);
		if(message != null) {
			this.money -= money;
			System.out.println(name + "���� " + money + "������ " + message);
		}
	}
	
	public void personInfo() {
		System.out.println(name + "���� �ܾ��� " + money + "�� �Դϴ�.");
	}
}
