package basic.ch04;

public class ContinueTest2 {

	// 코드의 시작점
	public static void main(String[] args) {

		// for 문 대신 while 문으로 변경해서 결과를 출력해 보세요.
		// 1 부터 100까지 숫자 중에 3의 배수를 출력하세요.
		int i = 1;
		// 풀이 1
		while (i < 101) {
			i++;
			if (i % 3 != 0) {
				continue;
			} // end if
			System.out.println("i 의 값 : " + i);
		} // end of while
		// 풀이 2
//		while (i < 101) {
//			if (i % 3 == 0) {
//				System.out.println("i 의 값 : " + i);
//			} // end of if
//			i++; // 증감식 사용하기(무한 반복 예방)
//		} // end of while
		
		// 풀이 3 : 특정 조건이 되었을 때 반복문을 멈추어라.
//		boolean flag = true;
//		while(flag) {
//			if(i % 3 == 0) {
//				System.out.println("3의 배수 : " + i);				
//			}
//			// 특정 조건으로 멈추기
//			if(i == 100) {
//				flag = false;
//				// i == 100
//			} // end of if
//				i++; // i == 101
//		} // end of while

	} // end of main

} // end of class
