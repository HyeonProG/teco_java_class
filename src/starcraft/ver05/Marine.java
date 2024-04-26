package starcraft.ver05;

public class Marine extends Unit implements Move {

	public Marine(String name) {
		super(name);
		super.name = name;
		super.power = 4;
		super.hp = 70;
	}

	@Override
	public void move() {
		System.out.println(this.name + " 이 날아 다닙니다.");
		
	}


}
