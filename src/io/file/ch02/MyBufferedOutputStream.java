package io.file.ch02;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class MyBufferedOutputStream {

	public static void main(String[] args) {
		// 2.
		// 시간 측정을 해보고 싶다
		// 현재 시간(시작)
		long start = System.nanoTime(); // 더 정밀한 현재 시간을 출력

		// 1.
		String data = "기반 스트림 + 보조 스트림을 활용해 보자";

		// try-catch-resource 활용
		try (FileOutputStream fos = new FileOutputStream("output2.txt");
				BufferedOutputStream bos = new BufferedOutputStream(fos)) {
			// 코드 수행 부분
			byte[] bytes = data.getBytes();

			// 보조 스트림
			bos.write(bytes);
			// 간혹 버퍼에 데이터가 남아 있다면 중복된 데이터를 쓸 수 있다.
			// 한번 사용한 다음
			bos.flush(); // flush --> 물을 내리다.
			System.out.println("보조 스트림을 활용한 파일 출력 완료");
							
			// 현재 시간(종료)
			long end = System.nanoTime();
			// 종료 - 시작 -> 소요 시간
			long duration = end - start;
			System.out.println("소요 시간 : " + duration);
			// 나노초는 10억분의 1

		} catch (Exception e) {
			e.printStackTrace();
		}

	} // end of main

} // end of class
