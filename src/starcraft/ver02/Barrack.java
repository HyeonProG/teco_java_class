package starcraft.ver02;

public class Barrack {

	private int barrackNumber;
	private int count;

	public Barrack(int barrackNumber) {
		this.barrackNumber = barrackNumber;
		count = 0;
	}

	public int getBarrackNumber() {
		return barrackNumber;
	}

	public int getCount() {
		return count;
	}

	public Marine createBarrack(String name) {
		count++;
		return new Marine(name);
	}

}
