package useful.ch04;

public class AICar extends Car {

	@Override
	void drive() {
		System.out.println("AICar가 자율주행을 합니다.");

	}

	@Override
	void stop() {
		System.out.println("AICar가 자동으로 자동차를 멈춥니다.");

	}

}
