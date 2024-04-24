package basic.exercise.toy;

// 클래스 - 인형 뽑기
// 상품들이 존재 가능
// 사자인형, 곰인형, 에어팟
// 조건 - 배열을 활용해서 객체들을 담아 주세요.
public class ToyMachine {

	String name;
	int price;

	Product[] products;
	public ToyMachine() {
		products = new Product[20];
	}
	
	public void showInfo() {
		System.out.println("상품명 : " + name);
		System.out.println("가격 : " + price);
	}

}
