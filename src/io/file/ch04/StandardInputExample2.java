package io.file.ch04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// 문자 기반 스트림 + 보조 문자 기반 스트림 확인
// 한 줄 입력하면 종료 됨
// 여러 줄 반복적으로 동작할 수 있도록 기능을 추가해 주세요.
public class StandardInputExample2 {

	public static void main(String[] args) {

		// 문자 기반 스트림 + 보조 문자 기반 스트림을 사용한다.
		// 데이터를 통으로 관리 하고 싶다면 --> 자료 구조 --> 적절한 자료 구조를 선택
		List<String> input = new ArrayList<String>();

		try (InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(isr)) {

			// isr -> 한 문자씩 읽는 기능 read()을 가지고 있었다.
			// br -> 한번에 한 라인씩 읽을 수 있는 기능을 가지고 있다.
			System.out.println("더 많은 텍스트를 입력 하세요 (한줄 단위) -> 엔터");
			System.out.println("입력을 종료하려면 빈 줄에서 엔터를 누르세요");
			// isr.read(); --> 기능의 확장

			String inputUserData;
			// "" --> 엔터 --> inputUserData.isEmpty() -- ! --> False --> 실행이 종료된다.
			while ((inputUserData = br.readLine()) != null && !inputUserData.isEmpty()) {
				input.add(inputUserData); // 한줄의 데이터를 자료 구조에 저장
//				System.out.println("입력 확인 : " + inputUserData);
			}
			for (String data : input) {
				System.out.println(data);
			}
			System.out.println("프로그램 종료");
		} catch (Exception e) {
			e.printStackTrace();
		}

	} // end of main

} // end of class
