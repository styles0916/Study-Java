package chapter5.coffeshop;

public class CoffeeShopTest {

	public static void main(String[] args) {
		
		Person kim = new Person("±Ë¡π∑¡",20000);
		Person lee = new Person("¿Ã««∞Ô",30000);
		
		StarCafe starcafe = new StarCafe();
		BeanCafe beancafe = new BeanCafe();
		
		
		kim.takeStarCoffee(starcafe, Menu.starAmericano);
		lee.takeBeanCoffee(beancafe, Menu.beanlatte);
		
		kim.personInfo();
		lee.personInfo();
	
		starcafe.sCafeInfo();
		beancafe.bCafeInfo();
			
		kim.takeBeanCoffee(beancafe, Menu.beanAmericano);
		lee.takeStarCoffee(starcafe, Menu.starlatte);
		
		
		kim.personInfo();
		lee.personInfo();
		
		starcafe.sCafeInfo();
		beancafe.bCafeInfo();
		
		
		
	}
	
}
