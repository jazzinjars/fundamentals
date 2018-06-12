package com.jazzinjars.solid.open;

import java.math.BigDecimal;

public interface Discount {

	BigDecimal apply(BigDecimal price);
}
