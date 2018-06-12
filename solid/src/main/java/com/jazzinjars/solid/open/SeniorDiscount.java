package com.jazzinjars.solid.open;

import java.math.BigDecimal;
import java.math.RoundingMode;

// Without applying the Open-Close Principle, it doesn't implements interface
public class SeniorDiscount implements Discount {

	@Override
	public BigDecimal apply(BigDecimal price) {
		BigDecimal percent = new BigDecimal("0.20");
		BigDecimal discount = price.multiply(percent);
		return price.subtract(discount.setScale(2, RoundingMode.HALF_UP));
	}
}
