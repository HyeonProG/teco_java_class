package basic.ch10;

public class HeroTest {

	public static void main(String[] args) {

		Hero hero1 = new Hero();
		hero1.setName("히어로");
		hero1.setHp(200);
		hero1.setDefense(50);
		hero1.setPower(20);
		hero1.showInfo();
		System.out.println(hero1.getName());
		System.out.println(hero1.getHp());
		System.out.println(hero1.getDefense());
		System.out.println(hero1.getPower());

	}

}
