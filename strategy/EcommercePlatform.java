package designpatterns.strategy;

public class EcommercePlatform {
	private Discount discount;
	
	Discount getDiscount(DiscountType discountType) {
		this.discount = DiscountFactory.getDiscount(discountType);
		return discount;
	}
}
