package basic.ch09;

import java.util.Scanner;

public class WarriorMainTest {

	public static void main(String[] args) {

		Warrior warrior1 = new Warrior("전사", 20); // 전사 클래스 불러오기

		Archor archor1 = new Archor("궁수", 15); // 궁수 클래스 불러오기

		Scanner sc = new Scanner(System.in); // 스캐너 불러오기
		int choice;

		boolean flag = true;
		int inputData1 = -1;
		while (flag) { // 반복문 설계
			System.out.println("어떤 캐릭터를 공격하시겠습니까? 1. 전사 2. 궁수 0. 종료");
			choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("전사를 몇번 공격하시겠습니까?");
				inputData1 = sc.nextInt();
				for (int i = 0; i < inputData1; i++) { // 몇번 공격할지 설계
					if (warrior1.hp >= 0) {
						archor1.attackWarrior(warrior1);
					} else {
						System.out.println("이미 사망 했습니다.");
						break;
					}

				}

			} else if (choice == 2) {
				System.out.println("궁수를 몇번 공격하시겠습니까?");
				inputData1 = sc.nextInt();
				warrior1.attackArchor(archor1);
				for (int i = 0; i < inputData1; i++) { // 몇번 공격할지 설계
					if (archor1.hp >= 0) {
						warrior1.attackArchor(archor1);
					} else {
						System.out.println("이미 사망 했습니다.");
						break;
					}
				}

			} else if (choice == 0) {
				System.out.println("프로그램 종료 ");
				flag = false;
			} else {
				System.out.println("다시 선택해주세요.");
			}
		}

	}

}
