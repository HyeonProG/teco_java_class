package basic.ch02;

public class DiscountCalculator {

	public static void main(String[] args) {

		// 상수 선언 - 원가, 할인율
		final double COST = 59.99;
		final double DISCOUNT_RATE = 0.3; // 30% 할인

		// 할인된 가격 계산 하기(비지니스 로직)
		// 할인된 가격 = 원가 * (1 - 할인율)
		double discountPrice = COST * (1 - DISCOUNT_RATE);

		// 최종 가격을 정수형으로 형 변환 처리
		int finalPrice = (int) discountPrice;

		// 결과 출력
		System.out.println("최종 가격 : " + finalPrice);
		System.out.println("최종 가격(소수점) : " + discountPrice);

	}

}
