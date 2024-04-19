package basic.ch12;

public class Account {

	private int id;

	public static int idAccount ;

	public Account(int id) {
		this.id = id;
		idAccount = 1;
	}

	public void createIdAccount() {
		System.out.println(id + " 사원 번호 : " + idAccount);
		idAccount++;
//		id++;
	}

}
