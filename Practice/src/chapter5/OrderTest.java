package chapter5;

public class OrderTest {

	public static void main(String[] args) {
		
		Order hong = new Order();
		hong.orderNumber = "201907210001";
		hong.orderID = "abc123";
		hong.orderDate = "2019�� 07�� 21��";
		hong.orderName = "ȫ���";
		hong.productNumber = "PD0345-12";
		hong.deliveryAddress = "����� �������� ���ǵ��� 20����";
		
		hong.orderInfo();
				
	}
	
}
