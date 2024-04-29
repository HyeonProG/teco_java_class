package useful.ch03;

public class NickName {

	private String nick;

	// getter
	public String getNick() {
		return nick;
	}

	// setter
	public void setNick(String nick) throws NickNameException {

		if (nick == null) {
			throw new NickNameException("닉네임은 null 값일 수 없습니다.");
		}

		if (nick.length() < 3) {
			throw new NickNameException("닉네임은 3자리 이상이어야 합니다.");
		}

		if (nick.matches("[0-9]+")) {
			throw new NickNameException("닉네임은 숫자로만 정할 수 없습니다.");
		}
		
		if (!nick.matches("[0-9a-zA-zㄱ-ㅎ가-힣]+")) {
			throw new NickNameException("닉네임은 특수문자로 정할 수 없습니다.");
		}

		this.nick = nick;

	}

}
