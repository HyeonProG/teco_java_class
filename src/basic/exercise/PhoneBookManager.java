package basic.exercise;

import java.util.Scanner;

public class PhoneBookManager {

	static int last_index_number = 0;

	public static void main(String[] args) {

		// 스캐너 사용
		// 배열 선언 100개
		// while문 활용

		Scanner sc = new Scanner(System.in);
		PhoneBook[] phoneBook = new PhoneBook[100];

		final String SAVE = "1";
		final String SEARCH_ALL = "2";
		final String SEARCH = "3";
		final String UPDATE = "4";
		final String DELETE_ALL = "5";
		final String DELETE = "6";
		final String END = "0";

		phoneBook[0] = new PhoneBook("홍길동", "010-1111-1111");
		phoneBook[1] = new PhoneBook("이순신", "010-2222-2222");
		phoneBook[2] = new PhoneBook("강감찬", "010-3333-3333");

		boolean flag = true;
		while (flag) {
			System.out.println("전화번호부");
			System.out.println("1.저장 2.조회 3.선택조회 4.수정 5.삭제 6.선택삭제 0.종료");
			String selectedNumber = sc.nextLine();

			if (selectedNumber.equals(SAVE)) {
				System.out.println(">> 저장하기 <<");
				save(sc, phoneBook);
			} else if (selectedNumber.equals(SEARCH_ALL)) {
				System.out.println(">> 조회 <<");
				searchAll(phoneBook);
			} else if (selectedNumber.equals(SEARCH)) {
				System.out.println(">> 선택 조회 <<");
				search(sc, phoneBook);
			} else if (selectedNumber.equals(UPDATE)) {
				System.out.println(">> 수정 <<");
				update(sc, phoneBook);
			} else if (selectedNumber.equals(DELETE_ALL)) {
				System.out.println(">> 삭제 <<");
				deleteAll(phoneBook);
			} else if (selectedNumber.equals(DELETE)) {
				delete(sc, phoneBook);
			} else if (selectedNumber.equals(END)) {
				System.out.println(">> 종료 <<");
				flag = false;
			} else {
				System.out.println(">> 잘못된 선택입니다. <<");
			}
		}

	} // end of main

	// 저장하기
	public static void save(Scanner sc, PhoneBook[] phoneBooks) {
		System.out.println("---- 저장하기 ----");
		System.out.println("이름을 입력 하세요");
		String name = sc.nextLine();
		System.out.println("전화번호를 입력 하세요");
		String phoneNumber = sc.nextLine();
		PhoneBook phoneBook = new PhoneBook(name, phoneNumber);

		if (last_index_number >= phoneBooks.length) {
			System.out.println("저장할 공간이 없습니다.");
			return;
		}

		for (int i = 0; i < phoneBooks.length; i++) {
			if (phoneBooks[i] == null) {
				phoneBooks[i] = phoneBook;
				last_index_number++;
				break;
			}
		}
		System.out.println("전화번호가 저장되었습니다.");

	}

	// 조회
	public static void searchAll(PhoneBook[] phoneBooks) {
		System.out.println("---- 조회 ----");
		for (int i = 0; i < phoneBooks.length; i++) {
			if (phoneBooks[i] != null) {
				System.out.println(phoneBooks[i].getName());
				System.out.println(phoneBooks[i].getPhoneNumber());
			}
		}
	}

	// 선택 조회
	public static void search(Scanner sc, PhoneBook[] phoneBooks) {
		System.out.println("---- 선택 조회 ----");
		System.out.println("이름을 입력해 주세요");
		String name = sc.nextLine();
		boolean isFind = false;

		for (int i = 0; i < phoneBooks.length; i++) {
			if (phoneBooks[i] != null) {
				if (phoneBooks[i].getName().equals(name)) {
					System.out.println(phoneBooks[i].getName());
					System.out.println(phoneBooks[i].getPhoneNumber());
					isFind = true;
					break;
				}
			}
		}
		if (isFind == false) {
			System.out.println("존재하지 않는 이름입니다.");
		}
	}

	// 삭제
	public static void deleteAll(PhoneBook[] phoneBooks) {
		for (int i = 0; i < phoneBooks.length; i++) {
			phoneBooks[i] = null;
		}
	}

	// 선택삭제
	public static void delete(Scanner sc, PhoneBook[] phoneBooks) {
		System.out.println("---- 선택삭제 ----");
		System.out.println("삭제하실 이름을 입력 하세요");
		String name = sc.nextLine();
		boolean isOk = true;
		while (isOk) {
			for (int i = 0; i < phoneBooks.length; i++) {
				if (phoneBooks[i] != null) {
					if (phoneBooks[i].getName().equals(name)) {
						phoneBooks[i] = null;
						isOk = false;
						break;
					}
				} 
		}
			if (isOk) {
				System.out.println("다시 입력해 주세요");
			}
		}
	}

	// 수정
	public static void update(Scanner sc, PhoneBook[] phoneBooks) {
		System.out.println("---- 수정 ----");
		System.out.println("이름을 입력 하세요");
		String name = sc.nextLine();
		boolean isOk = true;
		for (int i = 0; i < phoneBooks.length; i++) {
			if (phoneBooks[i] != null) {
				if (phoneBooks[i].getName().equals(name)) {
					System.out.println("수정하실 이름을 입력 하세요");
					String newName = sc.nextLine();
					System.out.println("수정하실 전화번호를 입력 하세요");
					String newPhoneNumber = sc.nextLine();
					phoneBooks[i].setName(newName);
					phoneBooks[i].setPhoneNumber(newPhoneNumber);
					break;
				}
			} else {
				System.out.println("다시 입력해 주세요.");
				isOk = false;
				break;
			}
		}

	}

} // end of class
