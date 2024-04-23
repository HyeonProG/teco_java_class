package starcraft.ver02;

import java.util.Scanner;

public class StarcraftTest2 {

	public static void main(String[] args) {

		final int ZEALOT = 1;
		final int MARINE = 2;
		final int ZERGLING = 3;
		final int GAME_END = 0;

		GateWay gateway1 = new GateWay(1);
		GateWay gateway2 = new GateWay(2);

		Zealot zealot1 = gateway1.createZealot("질럿1");
		Zealot zealot2 = gateway1.createZealot("질럿2");
		System.out.println("게이트웨이 " + gateway1.getGateWayNumber() + " : 질럿 " + gateway1.getCount());
		System.out.println("게이트웨이 " + gateway2.getGateWayNumber() + " : 질럿 " + gateway2.getCount());
		System.out.println("-----------------------------");

		Barrack barrack1 = new Barrack(1);
		Barrack barrack2 = new Barrack(2);

		Marine marine1 = barrack1.createBarrack("마린1");
		Marine marine2 = barrack2.createBarrack("마린2");
		Marine marine3 = barrack2.createBarrack("마린3");
		System.out.println("배럭 " + barrack1.getBarrackNumber() + " : 마린 " + barrack1.getCount());
		System.out.println("배럭 " + barrack2.getBarrackNumber() + " : 마린 " + barrack2.getCount());
		System.out.println("-----------------------------");

		Hatchery hatchery1 = new Hatchery(1);
		Hatchery hatchery2 = new Hatchery(2);

		Zergling zergling1 = hatchery1.createZergling("저글링1");
		Zergling zergling2 = hatchery2.createZergling("저글링2");
		Zergling zergling3 = hatchery2.createZergling("저글링3");
		Zergling zergling4 = hatchery2.createZergling("저글링4");
		System.out.println("해처리 " + hatchery1.getHatcheryNumber() + " : 저글링 " + hatchery1.getCount());
		System.out.println("해처리 " + hatchery2.getHatcheryNumber() + " : 저글링 " + hatchery2.getCount());
		System.out.println("-----------------------------");

		Scanner sc = new Scanner(System.in);
		int unitChoice = -1;

		do {

			System.out.println("유닛을 선택하세요.");
			System.out.println("1.질럿\t 2.마린\t 3.저글링\t 0.게임종료");
			unitChoice = sc.nextInt();

			if (unitChoice == ZEALOT) {

			} else if (unitChoice == MARINE) {

			} else if (unitChoice == ZERGLING) {

			} else {
				System.out.println("프로그램을 종료 합니다.");
				unitChoice = GAME_END;
			}

		} while (unitChoice != GAME_END);

	} // end of main

} // end of class
