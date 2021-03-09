package static_ex;

public class Company {

	private static Company instance = new Company();
	
	private Company() {}
	
	public static Company getInstance() { //인스턴스를 생성하지 않고 외부에서 호출하기위해서 static 사용.
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
	
	
	
}
