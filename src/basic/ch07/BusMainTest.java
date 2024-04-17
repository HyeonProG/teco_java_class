package basic.ch07;

public class BusMainTest {

	public static void main(String[] args) {
		
		Bus bus1 = new Bus();
		bus1.busNumber = 43;
		bus1.busPrice = 1500;
		bus1.busNav = "회동동";
		bus1.number();
		bus1.price();
		bus1.nav();
		
		System.out.println("------------------------");
		
		Bus bus2 = new Bus();
		bus2.busNumber = 107;
		bus2.busPrice = 1500;
		bus2.busNav = "센텀시티";
		bus2.number();
		bus2.price();
		bus2.nav();

	}

}
