package starcraft.ver01;

public class Zergling {

	private String name; // 이름
	private int power; // 공격력
	private int hp; // 생명력

	public Zergling(String name) {
		this.name = name;
		power = 3;
		hp = 50;
	}

	// get, set 단축키
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	// 저글링이 질럿을 공격합니다. attackZealot
	public void attackZealot(Zealot zealot) {
		System.out.println(this.name + " 이 " + zealot.getName() + " 을 공격합니다.");
		zealot.beAttacked(this.power);
	}

	// 저글링이 마린을 공격합니다. attackMarine
	public void attackMarine(Marine marine) {
		System.out.println(this.name + " 이 " + marine.getName() + " 을 공격합니다.");
		marine.beAttacked(this.power);
	}

	// 자신이 공격을 당합니다.
	public void beAttacked(int power) {
		// 방어적 코드 작성
		if (hp <= 0) {
			System.out.println("[" + this.name + "] 이미 사망하였습니다.");
			hp = 0;
			return;
		}
		hp -= power;
	}

	public void showInfo() {
		System.out.println("====== 상태창 ======");
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("생명력 : " + this.hp);
	}

}
