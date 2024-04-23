package basic.ch18;

public class Computer {

	private CPU cpu;
	private String name;

	public Computer() {
		cpu = new CPU(); // composition 관계
		cpu.setName("인텔");
	}

	void start() {
		System.out.println("컴퓨터가 시작 됩니다.");
		cpu.process();
	}

	// 필요하다면 setter 메서드를 만들 수 있다.
	// 외부에서 주입 받을 수 있다.

	public void setCPU(CPU cpu) {
		this.cpu = cpu;
	}
	
	public CPU getCPU() {
		return cpu; 
	}

}
