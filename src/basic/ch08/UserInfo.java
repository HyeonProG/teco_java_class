package basic.ch08;

public class UserInfo {

	public String userId;
	public String userName;
	public String userPassword;
	public String userAddress;
	public String phoneNumber;

	// 생성자 오버로딩이란?
	// 생성자의 개수가 여러개 있다.

	// 기본 생성자 형태 만들어 보기
	// 1.
	public UserInfo() {
	}

	// 2.
	public UserInfo(String id) {
		userId = id;
	}

	// 3.
	public UserInfo(String id, String name) {
		userId = id;
		userName = name;
	}

	// 연습 문제
	// 1. 매개변수 3개를 받는 생성자를 만들어 보세요.
	public UserInfo(String id, String name, String password) {
		userId = id;
		userName = name;
		userPassword = password;
	}

	// 2. 매개변수 4개를 받는 생성자를 만들어 보세요.
	public UserInfo(String id, String name, String password, String address) {
		userId = id;
		userName = name;
		userPassword = password;
		userAddress = address;
	}

	// 3. 매개변수 5개를 받는 생성자를 만들어 보세요.
	public UserInfo(String id, String name, String password, String address, String phone) {
		userId = id;
		userName = name;
		userPassword = password;
		userAddress = address;
		phoneNumber = phone;
	}

} // end of class
