package useful.ch03;

// 사용자 정의 예외 클래스 생성
public class NickNameException extends RuntimeException {
	
	public NickNameException(String message) {
		super(message);
	}

} // end of class
