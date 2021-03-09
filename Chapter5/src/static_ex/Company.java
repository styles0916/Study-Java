package static_ex;

public class Company {

	private static Company instance = new Company();
	
	private Company() {}
	
	public static Company getInstance() { //�ν��Ͻ��� �������� �ʰ� �ܺο��� ȣ���ϱ����ؼ� static ���.
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
	
	
	
}
