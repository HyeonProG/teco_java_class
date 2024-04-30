package basic.arrayexercise;

public class ArrayExercise {

	public static void main(String[] args) {
		// 배열 선언
		int[] array = { 10, 55, 23, 2, 79, 101, 16, 82, 30, 45 };
		// 배열의 가장 큰 값과 가장 작은 값 선언 및 초기화
		int max = array[0];
		int min = array[0];
		// 배열의 위치 선언 및 초기화
		int maxPos = 0;
		int minPos = 0;

		// i 가 배열의 길이보다 작을 때 i ++
		for (int i = 0; i < array.length; i++) {
			// 가장 큰 값이라고 선언한 max 가 i 보다 작을 때
			if (max < array[i]) {
				// max 는 i 이다.
				max = array[i];
				// 배열의 위치인 maxPos 는 (i 번째 위치 + 1) 이다.
				maxPos = i + 1;
			}
			// 가장 작은 값이라고 선언한 min 이 i 보다 클 때
			if (min > array[i]) {
				// min 은 i 이다.
				min = array[i];
				// 배열의 위치인 minPos 는 (i 번째 위치 + 1) 이다.
				minPos = i + 1;
			}
		}

		System.out.println("가장 큰 값은 " + max + " 이고, 위치는 " + maxPos + " 번째 입니다.");
		System.out.println("가장 작은 값은 " + min + " 이고, 위치는 " + minPos + " 번째 입니다.");

	} // end of main

} // end of class
