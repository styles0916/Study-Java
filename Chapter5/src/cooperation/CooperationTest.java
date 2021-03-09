package cooperation;

public class CooperationTest {

	public static void main(String[] args) {
		
		Student lee = new Student("¿Ã∞≠¿Œ", 50000);
		Student son = new Student("º’»ÔπŒ", 100000);
		Student ed = new Student("Edward", 30000);
		
		Bus bus100 = new Bus(100);
		Subway subwayGreen = new Subway(2);
		Taxi taxi = new Taxi();
		
		lee.takeBus(bus100);
		son.takeSubway(subwayGreen);
		ed.takeTaxi(taxi);
		
		bus100.showInfo();
		subwayGreen.showInfo();
		taxi.showInfo();
		
		lee.takeSubway(subwayGreen);
		son.takeTaxi(taxi);
		
		subwayGreen.showInfo();
		taxi.showInfo();
		
		lee.showInfo();
		son.showInfo();
		ed.showInfo();
	}
	
}
