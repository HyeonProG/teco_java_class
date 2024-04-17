package basic.ch09;

public class Warrior { // 전사 클래스 설계
	String name; // 이름
	int power; // 공격력
	int defense; // 방어력
	int hp; // 체력

	public Warrior(String myName, int myPower) {
		name = myName;
		power = myPower;
		hp = 200;

	}

	public void attackArchor(Archor archor) { // 궁수 공격 명령
		System.out.println("궁수를 공격( " + this.power + " ) 합니다.");
		archor.beAttacked(this.power);
	}

	public void beAttacked(int power) { // 전사 사망 명령
		if (hp <= 0) {
			System.out.println("전사가 사망하였습니다.");
			return;
		}
		hp = hp - power;
	}

}
