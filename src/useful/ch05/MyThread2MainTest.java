package useful.ch05;

public class MyThread2MainTest {

	// 메인 작업자
	public static void main(String[] args) {
		
		System.out.println("main start");
		
		// 문제 - MyThread2 를 메모리에 올리고
		// 그 안에 정의된 run() 메서드를 호출 하세요.
		// Thread 문서를 반드시 확인 하세요.
		
		// 새로운 작업자를 생성해서 위임 시킬때는
		// Thread 안에 있는 start() 메서드를 호출 해야 한다.
		MyThread2 myThread2 = new MyThread2();
		// myThread2.run(); 일반 메서드 호출
		Thread thread = new Thread(myThread2);
		thread.start();
		// 결국 다른 작업자에게 일을 위임 하려면 Thread 에 start() 를 호출 해야 한다.
		
		System.out.println("main end");
		
		

	} // end of main

} // end of class
