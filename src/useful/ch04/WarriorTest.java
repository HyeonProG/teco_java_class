package useful.ch04;

public class WarriorTest {

	public static void main(String[] args) {
		Warrior warrior = Warrior.getInstance();
		System.out.println(warrior);
		
		Warrior warrior2 = Warrior.getInstance();
		System.out.println(warrior2);

	} // end of main

} // end of class
