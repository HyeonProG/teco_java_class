package basic.ch05;

public class UserMainTest {

	public static void main(String[] args) {

		User userBox1 = new User();

		userBox1.userName = "홍길동";
		userBox1.userOld = 99;
		userBox1.userId = "hgd01";

		System.out.println(userBox1.userName);
		System.out.println(userBox1.userOld);
		System.out.println(userBox1.userId);

	}

}
