package basic.ch09;

import java.util.Scanner;

public class GoingToSchool2 {

	// 코드의 시작점 (메인 함수)
	public static void main(String[] args) {

		// 설계된 클래스를 가지고 본인이 의도한 대로 실행의 흐름을 만들어 보자.

		// 스캐너를 활용
		// 1번을 누르면 버스를 태워서 실행의 흐름을 만들기
		// 2번을 누르면 지하철을 태워서 실행의 흐름을 만들기
		Bus bus1 = new Bus(100);
		Bus bus2 = new Bus(200);
		Subway subway1 = new Subway(1);
		Subway subway2 = new Subway(2);
		Student s1 = new Student("티모", 100_000);
		Student s2 = new Student("야스오", 200_000);

		Scanner sc = new Scanner(System.in);
		System.out.println("버스는 1번 지하철은 2번을 누르세요.");
		int ride = sc.nextInt();

		if (ride == 1) {
			s1.takeBus(bus1);
			bus1.showInfo();
			System.out.println("------------");
			s1.showInfo();
		} else if (ride == 2) {
			s2.takeSubway(subway1);
			subway1.showInfo();
			System.out.println("------------");
			s2.showInfo();
		} else {
			System.out.println("다시 선택하세요.");
		}

	} // end of main

} // end of class
