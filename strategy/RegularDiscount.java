package designpatterns.strategy;

public class RegularDiscount implements Discount{

	@Override
	public double calculatePriceAfterDiscount(double amountPurchased) {
		return amountPurchased;
	}
	
}
