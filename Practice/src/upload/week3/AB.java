package upload.week3;

//	class A extends B {
//		
//	}
//	
//	class B extends A {
//		
//	}


	class A {
		B b;
	}
	
	class B {
		A a;
	}

// IS=A 관계로는 상하관계가 성립하지 않고, 자기자신의 클래스를 상속할 수도 없기때문에 오류가나지만, HAS-A 관계로는 서로의 타입을 사용할 수는 있음.

public class AB {

}