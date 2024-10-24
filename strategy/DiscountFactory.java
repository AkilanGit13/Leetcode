package designpatterns.strategy;

public class DiscountFactory {
	public static Discount getDiscount(DiscountType discountType) {
		switch(discountType) {
			case SEASONAL: return new SeasonalDiscount();
			case LOYALTY: return new LoyaltyDiscount();
			case REGULAR: return new RegularDiscount();
		}
		return null;
	}
}
