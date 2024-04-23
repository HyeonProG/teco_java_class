package basic.ch17;

public class HeroTest {

	public static void main(String[] args) {
		
		Hero hero1 = new Hero("영웅", 100);
		Warrior warrior1 = new Warrior("야스오", 100);
		Archer archer1 = new Archer("애쉬", 100);
		Wizard wizard1 = new Wizard("라이즈", 100);
		
		hero1.attack();
		warrior1.attack();
		warrior1.comboAttack();
		archer1.attack();
		archer1.firArrow();
		wizard1.attack();
		wizard1.freezing();
		
	} // end of main

} // end of class
