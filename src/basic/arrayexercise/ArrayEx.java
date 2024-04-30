package basic.arrayexercise;

public class ArrayEx {

	public static void main(String[] args) {

		int[] array = RandomNumber.randomNumber();
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}

		int max = array[0];
		int min = array[0];

		int maxPos = 0;
		int minPos = 0;

		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
				maxPos = i + 1;
			}
			if (min > array[i]) {
				min = array[i];
				minPos = i + 1;
			}
		}

		System.out.println();
		System.out.println("가장 큰 값 : " + max);
		System.out.println("가장 큰 값의 위치 : " + maxPos + " 번 째");
		System.out.println("가장 작은 값 : " + min);
		System.out.println("가장 작은 값의 위치 : " + minPos + " 번 째");

	}

}
