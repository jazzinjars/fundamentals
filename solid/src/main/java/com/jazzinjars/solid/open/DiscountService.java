package com.jazzinjars.solid.open;

import java.math.BigDecimal;

public class DiscountService {

	// Without applying the Open-Close Principle, it has two methods for same functionality that is not extended
	// ------>
	public BigDecimal applyDiscounts(BigDecimal price, Discount discount) {
		BigDecimal discountPrice = price.add(BigDecimal.ZERO);
		discountPrice = discount.apply(discountPrice);
		return discountPrice;
	}

	public BigDecimal applySeniorDiscount(BigDecimal price, SeniorDiscount discount) {
		return discount.apply(price);
	}
	// ------>

	public BigDecimal applyDiscounts(BigDecimal price, Discount[] discounts) {
		BigDecimal discountPrice = price.add(BigDecimal.ZERO);
		for (Discount discount : discounts) {
			discountPrice = discount.apply(discountPrice);
		}
		return discountPrice;
	}
}
