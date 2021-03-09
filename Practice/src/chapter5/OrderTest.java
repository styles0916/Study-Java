package chapter5;

public class OrderTest {

	public static void main(String[] args) {
		
		Order hong = new Order();
		hong.orderNumber = "201907210001";
		hong.orderID = "abc123";
		hong.orderDate = "2019년 07월 21일";
		hong.orderName = "홍길순";
		hong.productNumber = "PD0345-12";
		hong.deliveryAddress = "서울시 영등포구 여의도동 20번지";
		
		hong.orderInfo();
				
	}
	
}
