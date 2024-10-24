package designpatterns.strategy;

public class SeasonalDiscount implements Discount {
	
	@Override
	public double calculatePriceAfterDiscount(double amountPurchased) {
		double discount = 0.8*amountPurchased;
		return discount;
	}
}
