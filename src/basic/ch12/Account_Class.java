package basic.ch12;

public class Account_Class {

	public static void main(String[] args) {

		Account accountNumber1 = new Account(1);
		Account accountNumber2 = new Account(2);

		accountNumber1.createIdAccount();
		accountNumber1.createIdAccount();
		accountNumber2.createIdAccount();
		System.out.println(Account.idAccount);

	}

}
