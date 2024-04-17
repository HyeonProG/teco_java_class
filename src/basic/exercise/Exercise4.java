package basic.exercise;

import java.util.Scanner;

public class Exercise4 {

	// 코드의 시작점
	public static void main(String[] args) {

		// 사용자 한테 값을 입력 받기
		Scanner sc = new Scanner(System.in);
		int choice;
		
		// 특정 조건을 만날때 반복문을 종료 해야 된다면
		// 깃발
		boolean flag = true;
		while (flag) {
			// \n --> 한줄 내림
			System.out.println("\n메뉴 선택");
			System.out.println("1.등록 2.조회 3.수정 4.삭제 0.종료");
			System.out.print("선택 : ");
			choice = sc.nextInt();
			char number = 'x';
			String message = "";

			if (choice == 1) {
				number = 1;
				message = "등록을 선택했습니다.";
				System.out.println(message);
			} else if (choice == 2) {
				number = 2;
				message = "조회를 선택했습니다.";
				System.out.println(message);
			} else if (choice == 3) {
				number = 3;
				message = "수정을 선택했습니다.";
				System.out.println(message);
			} else if (choice == 4) {
				number = 4;
				message = "삭제를 선택했습니다.";
				System.out.println(message);
			} else if (choice == 0) {
				number = 0;
				message = "프로그램을 종료합니다.";
				System.out.println(message);
				break; // while 반복문을 빠져나와 프로그램 종료
			} else {
				System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
			}

		}

	} // end of main

} // end of class
