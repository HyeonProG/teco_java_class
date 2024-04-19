package starcraft.ver01;

public class Marine {

	private String name; // 이름
	private int power; // 공격력
	private int hp; // 생명력

	public Marine(String name) {
		this.name = name;
		power = 4;
		hp = 70;
	}

	// get, set 단축키 - alt + shift + s --> generate get set
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

	// 마린이 질럿을 공격합니다. attackZelot
	public void attackZealot(Zealot zealot) {
		System.out.println(this.name + " 이 " + zealot.getName() + " 을 공격합니다.");
		zealot.beAttacked(this.power);
	}

	// 마린이 저글링을 공격합니다. attackZergling
	public void attackZergling(Zergling zergling) {
		System.out.println(this.name + " 이 " + zergling.getName() + " 을 공격합니다.");
		zergling.beAttacked(this.power);
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
