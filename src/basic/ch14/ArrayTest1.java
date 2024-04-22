package basic.ch14;

public class ArrayTest1 {

	public static void main(String[] args) {

		// 배열이란?
		// 연관된 데이터를 모아서 통으로 관리하기 위한 데이터 타입

		// 배열의 특징
		// 배열은 사용하기 전에 반드시 몇 개의 데이터가 들어갈지
		// 크기를 지정해야 사용할 수 있다.

		// 배열 메모리 공간 만들기
		int[] numbers = new int[3];
		int intBoxes[] = new int[5];

		// 값 넣기(초기화)
		// 배열의 길이 -> 3
		// 인덱스의 길이 -> 2
		numbers[0] = 1000;
		numbers[1] = 1001;
		numbers[2] = 1002;

		// numbers[3] = 1003; --> 인덱스의 길이를 벗어남, 오류 발생
		// 모든 프로그래밍에 인덱스 번호의 시작은 0부터 시작한다.

		// 배열의 선언과 동시에 초기화
		int[] grades = new int[] { 5, 3, 1 };
		int[] grades2 = { 5, 3, 1 }; // new int[] 생략 가능하다.

		// 문제 1
		// 5개의 크기를 가지는 double 타입의 배열을 선언 하세요.
		// 단, 배열의 이름은 마음대로 작성하세요.
		double[] doubleBox = new double[5]; // --> [][][][][]

		// 문제 2
		// 위에서 선언한 배열의 값을 인덱스 0 ~ 2 까지 초기화 하세요.
		// 값은 아무거나 상관 없음
		doubleBox[0] = 1.1;
		doubleBox[1] = 1.2;
		doubleBox[2] = 1.3;
		// doubleBox[3] = 0.0;
		// doubleBox[4] = 0.0; --> 값을 안넣으면 초기값으로 설정됨

		// 문제 3
		// String 타입의 배열을 선언, 배열의 크기는 3개
		// 선언과 동시에 초기화 하세요.
		String[] stringBox = new String[] { "a", "b", "c" };
		// String[] stringBox = {"a", "b", "c"};

	} // end of main

} // end of class
