package basic.ch05;

public class OrderMainTest {

	public static void main(String[] args) {

		Order orderBox1 = new Order();

		orderBox1.orderMenu = "김밥";
		orderBox1.price = 3000;
		orderBox1.table = 1;

		System.out.println(orderBox1.orderMenu);
		System.out.println(orderBox1.price);
		System.out.println(orderBox1.table);

	}

}
