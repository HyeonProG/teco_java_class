package basic.ch09;

public class Archor { // 궁수 클래스 설계
	String name; // 이름
	int power; // 공격력
	int defense; // 방어력
	int hp; // 체력

	public Archor(String myName, int myPower) {
		name = myName;
		power = myPower;
		hp = 150;
	}

	public void attackWarrior(Warrior warrior) { // 전사 공격 명령
		System.out.println("전사를 공격( " + this.power + " )합니다.");
		warrior.beAttacked(this.power);
	}

	public void beAttacked(int power) { // 궁수 사망 명령

		if (hp <= 0) {
			System.out.println("궁수가 사망하였습니다.");
			return;
		}
		hp = hp - power;
	}

}
