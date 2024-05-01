package useful.ch05;

// how(문법을 어떻게 쓰는가), why(왜 사용하는가)
public class Worker extends Thread {

	private String name;

	public Worker(String name) {
		this.name = name;
	}

	// 약속된 부분 --> run() 메서드를 정의 하면 된다.
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("worker : " + name + " : " + i);
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
