package basic.ch14;

public class ArrayTest4 {

	public static void main(String[] args) {

		String[] arrayStr = new String[26];

		arrayStr[0] = "A";
		arrayStr[1] = "B";
		arrayStr[2] = "C";
		arrayStr[3] = "D";
		arrayStr[3] = "E";

		// 배열안에 요소의 개수를 출력하세요.
		// 값이 있다면 콘솔창에 출력
		// 반복문 활용
		int forCount = 0;
		int elementCount = 0;
		for (int i = 0; i < arrayStr.length; i++) {
			if (arrayStr[i] != null) {
				elementCount++;
			}
			System.out.println(arrayStr[i]);
			forCount++;
		}
		System.out.println("for 동작 횟수 : " + forCount);
		System.out.println("배열 안에 요소의 개수 : " + elementCount);

	} // end of main

} // end of class
