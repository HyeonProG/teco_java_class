package starcraft.ver01;

public class Zealot {

	private String name; // 이름
	private int power; // 공격력
	private int hp; // 생명력

	public Zealot(String name) {
		this.name = name;
		power = 5;
		hp = 80;
	}

	// getter setter 
	public String getName() {
		return name;
	}

	public int getPower() {
		return power;
	}

	public int getHp() {
		return hp;
	}

	// 질럿이 저글링을 공격합니다.
	public void attackZergling(Zergling zergling) {
		System.out.println(this.name + " 이 " + zergling.getName() + " 을 공격합니다.");
		zergling.beAttacked(this.power);
	}

	// 질럿이 마린을 공격합니다.
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
