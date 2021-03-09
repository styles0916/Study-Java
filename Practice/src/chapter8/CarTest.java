package chapter8;

import java.util.ArrayList;

public class CarTest {

	public static void main(String[] args) {
		
		ArrayList<Car> carList = new ArrayList<Car>();

		
//		Car sonata = new Sonata();
//		Car avante = new Avante();
//		Car grandeur = new Grandeur();
//		Car genesis = new Genesis();

//		carList.add(sonata);
//		carList.add(avante);
//		carList.add(grandeur);
//		carList.add(genesis);
		
		carList.add(new Sonata()); 
		carList.add(new Avante());
		carList.add(new Grandeur());
		carList.add(new Genesis());

		for (Car car : carList) {
			car.run();
			System.out.println("====================");
		}
		
		for(int i = 0; i < carList.size(); i++) {
			System.out.println(carList.get(i));
		}
	}

}