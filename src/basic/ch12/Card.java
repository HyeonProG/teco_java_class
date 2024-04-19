package basic.ch12;

public class Card {
	
	// 멤버 변수, static 변수
	private String name;
	static int cardNumber = 1;
	private int createCard;

	// 생성자
	
	public Card(String name) {
		this.name = name;
		this.createCard = cardNumber;
		cardNumber++;
	}
	
	// 멤버 함수
	public void showInfo() {
		System.out.println("카드 번호는 : " + cardNumber);
	}
	
	// get, set 작성
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public static int getCardNumber() {
		return cardNumber;
	}
	
	public static void setCardNumber(int cardNumber) {
		Card.cardNumber = cardNumber;
	}
	
	public int getCreateCard() {
		return createCard;
	}
	
	public void setCreateCard(int createCard) {
		this.createCard = createCard;
	}
	
	
	// 코드 테스트 (메인 함수)
	public static void main(String[] args) {
		Card Number1 = new Card("카드1");
		Card Number2 = new Card("카드2");
		Card Number3 = new Card("카드3");
		
		System.out.println(Number1.createCard);
		System.out.println(Number2.createCard);
		System.out.println(Number3.createCard);

		
	} // end of main



} // end of class
