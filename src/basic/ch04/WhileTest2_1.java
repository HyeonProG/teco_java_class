package basic.ch04;

public class WhileTest2_1 {

	// 코드의 시작점(메인 함수)
	public static void main(String[] args) {

		// 1부터 5까지 덧셈 연산을 해라.
		// 1 + 2 + 3 + 4 + 5

		int start = 1; // 시작값
		int end = 5; // 5번
		int sum = 0;

		// 첫번째 반복
		// 여섯번째 -> start : 6 <= 5 false --> while 반복문 종료
		// 무한반복을 방지하기 위해
		// 특정 조건식을 만들어 반복문을 멈추게 해야한다.
		// 만약 start 값이 10일 때 종료해라.
		boolean flag = true;
		while (flag) {
			if (start == 10) {
				// 실행의 제어권을 반납한다.
				flag = false;
			
			}
			// 1: 0 = 0 + 1 -- > sum : 1
			// 2: 1 = 1 + 2 -- > sum : 3
			// 3: 3 = 3 + 3 -- > sum : 6
			// 4: 6 = 6 + 4 -- > sum : 10
			// 5: 10 = 10 + 5 --> sum : 15
			sum = sum + start;
			System.out.println("sum(" + start + ") : " + sum);
			start++; // 1씩 증가

		} // end of while

	} // end of main

} // end of class
