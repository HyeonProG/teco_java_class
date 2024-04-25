package starcraft.ver05;

public class Zergling extends Unit implements Move {

	public Zergling(String name) {
		super(name);
		super.name = name;
		super.power = 3;
		super.hp = 50;
	}

	@Override
	public void move() {
		System.out.println("저글링이 땅속을 기어다닙니다.");
		
	}


}
