package useful.ch04;

public class Warrior {

	// static 변수 활용 데이터 타입 선언
	private static Warrior warrior;

	// 생성자 - 외부에서 호출이 불가능하도록 private 사용
	private Warrior() {

	}

	// 외부에서 접근이 가능하도록 메서드 생성
	public static Warrior getInstance() {

		if (warrior == null) {
			warrior = new Warrior();
		}
		return warrior;
	}

}
