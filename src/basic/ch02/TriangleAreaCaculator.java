package basic.ch02;

public class TriangleAreaCaculator {

	public static void main(String[] args) {

		// 삼각형의 면적을 계산하는 코드를 작성해 보자. ( 밑변 * 높이 ) / 2

		// 삼각형의 밑변 BASE, 단 상수로 선언
		final double BASE = 5.0;

		// 삼각형의 높이 HEIGHT, 단 상수로 선언
		final double HEIGHT = 5.0;

		// 결과 값을 area 변수에 저장
		double area = (BASE * HEIGHT) / 2;

		// 결과 출력하기
		System.out.println(" 삼각형의 면적 : " + area);

	}

}
