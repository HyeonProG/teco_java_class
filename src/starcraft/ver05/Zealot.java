package starcraft.ver05;

public class Zealot extends Unit implements Move {

	public Zealot(String name) {
		super(name);
		super.name = name;
		super.power = 5;
		super.hp = 80;
	}

	@Override
	public void move() {
		System.out.println(this.name + " 이 뛰어 다닙니다.");
		
	}

}
