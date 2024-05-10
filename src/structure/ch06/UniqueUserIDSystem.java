package structure.ch06;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueUserIDSystem {

	private HashSet<String> userIDs;

	public UniqueUserIDSystem() {
		this.userIDs = new HashSet<String>();

	}

	// 사용자 ID 등록 가능
	// 정상적으로 들어가면 true
	// 중복 발생하면 false
	public boolean registerUserID(String userId) {
		return userIDs.add(userId);
	}

	public void registerId() {
		Scanner sc = new Scanner(System.in);
		String input;
		input = sc.nextLine();
		boolean isRegistered = registerUserID(input);
		if (isRegistered) {
			System.out.println("아이디가 등록 되었습니다." + input);
		} else {
			System.out.println("이미 등록된 아이디 입니다. " + input);
		}
	}

	// 시스템 실행
	public void run() {
		// 동작 - 스캐너 활용
		// 실행 흐름 만들기 --> while, if
		// 결과 -> 유저 정상 등록
		// -> 이미 등록된 사용자 입니다 출력
		int choice;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println(">> 사용자 아이디 등록하기 <<");
			System.out.println("1. 아이디 등록 / 2. 종료");
			choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("아이디를 입력해 주세요.");
				registerId();
			} else if (choice == 2) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		}
		sc.close();
	}

	// 코드 테스트
	public static void main(String[] args) {
		UniqueUserIDSystem system = new UniqueUserIDSystem();
		system.run();

	} // end of main

} // end of class
