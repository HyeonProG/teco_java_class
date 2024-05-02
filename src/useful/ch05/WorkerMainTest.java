package useful.ch05;

public class WorkerMainTest {

	// 메인 작업자
	public static void main(String[] args) {

		System.out.println("---------- main 쓰레드 시작 ---------");
		System.out.println(Thread.currentThread());

		// 작업자 하나 만들어 내기
		Worker worker1 = new Worker("워커"); // 생성은 메인 쓰레드가 했다.
		// 명령어를 통해서 worker1 에게 "너가 위임 받은 일을 시작해"
		worker1.start(); // 메인 쓰레드가 명령을 내림

		System.out.println("---------- main 쓰레드 종료 ---------");

		
		
		
	} // end of main

} // end of class
