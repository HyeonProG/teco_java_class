package basic.ch13;

import java.util.Arrays;
import java.util.Random;

public class LottoNumberMaker {

	// 멤버 변수
	private String version = "1.0.0";

	// 메인 함수
	public static void main(String[] args) {

//		System.out.print(makeNumber() + "\t");
//		System.out.print(makeNumber() + "\t");
//		System.out.print(makeNumber() + "\t");
//		System.out.print(makeNumber() + "\t");
//		System.out.print(makeNumber() + "\t");
//		System.out.print(makeNumber() + "\t");

		int[] lottos = makeNumbers();
		Arrays.sort(lottos); // 자동으로 오름차순으로 배열을 해주는 유틸
		for (int i = 0; i < lottos.length; i++) {
			System.out.print(lottos[i] + "\t");
		}

	} // end of main

	// 인스턴스에 속하지 않는 함수 만들기
	public static int makeNumber() {
		// static 함수 안에 멤버 변수를 사용할 수 없다.
		// 메모리 가 뜨는 순서 !!
		// System.out.println("ver : " + version);

		// 자바 도구 --> 표준 API
		// 난수 발생기 --> 랜덤값 생성
		Random random = new Random();
		// int resultNumber = random.nextInt(45); // 0 ~ 44 까지 번호를 만들어준다.
		int resultNumber = random.nextInt(45) + 1; // 1 ~ 45 까지 번호를 만들어준다.

		return resultNumber;
	}

	// 인스턴스에 속하지 않는 함수 만들기
	public static int[] makeNumbers() {
		int[] numbers = new int[6];
		Random random = new Random();
		// 중복된 랜덤 1~ 45 숫자가 나온다면
		// 다시 반복문을 돌려서 중복되지 않게 만들어야 한다.
		for (int i = 0; i < 6; i++) {
			int num = random.nextInt(45) + 1;
			// 이중 for문을 이용해서 중복된 숫자가 없도록 코드를 만들어 보세요.
			for (int j = 0; j < i; j++) {
				if (numbers[i] == numbers[j]) {
					i--;
					break;
				}
			}

			numbers[i] = num;
		}
		return numbers;
	}

}
