package useful;

public class StringBufferTest {
	
	// 코드의 시작점 - (메인 작업자)
	public static void main(String[] args) {
		
		String str1 = new String("Hello");
		String str2 = new String("World");
		
		StringBuffer bufferStr = new StringBuffer("Hello");
		System.out.println(bufferStr);
		// 1.
		System.out.println(System.identityHashCode(bufferStr)); // 원시 주소 값
		bufferStr.append(str2); // append : 더하는 기능
		System.out.println(bufferStr);
		// 2.
		System.out.println(System.identityHashCode(bufferStr)); // 원시 주소 값
		
		// 1번과 2번의 결과에 주소값이 같다는 의미는
		// 새로운 메모리를 할당 한 것이 아닌 기존 메모리를 변경한 것이다.
		
		//활용
		String newStr = bufferStr.toString(); // StringBuffer 에서 String 으로 형 변환 할 시
											  // .toString() 호출
		
	} // end of main

} // end of class
