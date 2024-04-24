package basic.exercise.toy;

import java.util.Scanner;

public class ToyMachineTest {

	public static void main(String[] args) {

		ToyMachine lion = new LionToy();
		ToyMachine bear = new BearToy();
		ToyMachine airpods = new Airpods();

		ToyMachine[] toymachine = new ToyMachine[3];
		toymachine[0] = lion;
		toymachine[1] = bear;
		toymachine[2] = airpods;

		Scanner sc = new Scanner(System.in);
		int randomNumber = RandomNumber.makeNumber();
		int choice1;
		int choice2;
		System.out.println("어느 기계를 고르시겠습니까?");
		System.out.println("1번기계 / 2번기계");
		choice1 = sc.nextInt();
		if (choice1 == 1) {
			System.out.println("몇번 버튼을 눌러 인형을 뽑으시겠습니까?");
			System.out.println("1번 / 2번 / 3번 / 0. 종료");
		} else if (choice1 == 2) {
			System.out.println("몇번 버튼을 눌러 인형을 뽑으시겠습니까?");
			System.out.println("1번 / 2번 / 3번 / 0. 종료");
		} else {
			System.out.println("다시 선택해주세요.");
		}

		choice2 = sc.nextInt();
		if (choice2 == 0) {
			System.out.println("종료합니다..");
		} else if (choice2 <= 3) {
			System.out.println("인형을 뽑습니다...");
			System.out.println(randomNumber);
			System.out.println(">> 뽑은 상품 <<");
			if (randomNumber <= 5) {
				((LionToy) toymachine[0]).takeProduct();
				System.out.println("-------------------");
				toymachine[0].showInfo();
			} else if (randomNumber <= 10) {
				((BearToy) toymachine[1]).takeProduct();
				System.out.println("-------------------");
				toymachine[1].showInfo();
			} else if (randomNumber <= 15) {
				((Airpods) toymachine[2]).takeProduct();
				System.out.println("-------------------");
				toymachine[2].showInfo();
			} else {
				System.out.println("꽝!! 다음기회에...");
			}
		} else {
			System.out.println("다시 선택해 주세요.");
		}

	}

}
