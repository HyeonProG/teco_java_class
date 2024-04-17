package basic.ch07;

public class Bus {
	
	int busNumber;
	int busPrice;
	String busNav;
	
	void number() {
		System.out.println("이 버스는 " + busNumber + " 번 버스 입니다.");
	}
	
	void price() { 
		System.out.println("버스의 탑승권 가격은 " + busPrice + " 원 입니다.");
	}
	
	void nav() {
		System.out.println("이 버스의 종점은 " + busNav + " 입니다.");
	}

}
