package designpatterns.strategy;

public class LoyaltyDiscount implements Discount {

	@Override
	public double calculatePriceAfterDiscount(double amountPurchased) {
		double discount = 0.9*amountPurchased;
		return discount;
	}

}
