package io.file.ch03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedFileCopy {

	public static void main(String[] args) {
		// (바이트 기반 스트림을 활용)
		// 기반 스트림 + 보조 스트림을 활용해서 파일 복사 기능을 만들고
		// 소요 시간을 측정하세요.

		// 파일 경로
		String sourceFilePath = "D:\\tools\\a.zip";
		// 목적지 파일
		String destinationFilePath = "copy2.zip";

		// 소요시간 확인
		long startTime = System.nanoTime();

		try (FileInputStream in = new FileInputStream(sourceFilePath);
				BufferedInputStream bis = new BufferedInputStream(in);
				FileOutputStream out = new FileOutputStream(destinationFilePath);
				BufferedOutputStream bos = new BufferedOutputStream(out)) {

			int data;
			while ((data = bis.read()) != -1) {
				bos.write(data);
			}
			System.out.println("버퍼 스트림 입출력 반복 완료");

		} catch (Exception e) {
			e.printStackTrace();
		}

		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.println("복사의 소요 시간 : " + duration);

		// 소요 시간을 초 단위로 변환
		double seconds = duration / 1_000_000_000.0;

		String resultFormat = String.format("소요 시간은 : %.6f초 입니다.", seconds);
		System.out.println(resultFormat);

	} // end of main

} // end of class
