package AirbnbClone.AirbnbClone.strategy;

import AirbnbClone.AirbnbClone.entity.Inventory;

import java.math.BigDecimal;
public interface PricingStrategy {

    BigDecimal calculatePrice(Inventory inventory);
}
