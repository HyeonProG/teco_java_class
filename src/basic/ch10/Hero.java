package basic.ch10;

public class Hero {

	private String name;
	private int hp;
	private int power;
	private double defense;
	private boolean isDie;

	// getter, setter 메서드를 만들어 주세요.

	public String getName() {
		return name;
	}

	public void setName(String myName) {
		this.name = myName;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int myHp) {
		if (myHp <= 0) {
			System.out.println("사망하였습니다.");
		} else {
			this.hp = myHp;
		}
		this.hp = myHp;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int myPower) {
		this.power = myPower;
	}

	public double getDefense() {
		return defense;
	}

	public void setDefense(double myDefense) {
		if (myDefense <= 0) {
			System.out.println("방어력이 부족합니다.");
		} else {
			this.defense = myDefense;
		}
		this.defense = myDefense;
	}

	public boolean checkIsDie() { // Getter
		return isDie;
	}

	public void setIsDie(boolean checkIsDie) { // Setter
		this.isDie = checkIsDie;
	}

	public void showInfo() {
		System.out.println("-----정보창-----");
	}

}
