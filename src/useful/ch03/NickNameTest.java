package useful.ch03;

import java.util.Scanner;

public class NickNameTest {

	public static void main(String[] args) {
		
		NickName nickName = new NickName();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("닉네임을 정해주세요");
		
		String inputName;
		inputName = sc.next();
		
		try {
			nickName.setNick(inputName);
		} catch (NickNameException e) {
			nickName.setNick(inputName);
		} catch(Exception e) {
			System.out.println("예외 발생 : " + e.getMessage());
		}
		
		System.out.println("닉네임 : " + nickName.getNick());

		
	} // end of main

} // end of class
