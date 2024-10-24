package designpatterns.strategy;

public class Client {

	public static void main(String[] args) {
		EcommercePlatform ecommercePlatform = new EcommercePlatform();
		double pricePurchased = 10000;
		Discount discount = ecommercePlatform.getDiscount(DiscountType.SEASONAL);
		double ans = discount.calculatePriceAfterDiscount(pricePurchased);
		System.out.println("seasonal discount : "+ ans);
		discount = ecommercePlatform.getDiscount(DiscountType.LOYALTY);
		ans = discount.calculatePriceAfterDiscount(pricePurchased);
		System.out.println("loyalty discount : "+ans);
		discount = ecommercePlatform.getDiscount(DiscountType.REGULAR);
		ans = discount.calculatePriceAfterDiscount(pricePurchased);
		System.out.println("regular discount : "+ans);
	}

}
