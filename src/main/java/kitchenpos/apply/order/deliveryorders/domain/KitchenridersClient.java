package kitchenpos.apply.order.deliveryorders.domain;

import java.math.BigDecimal;
import java.util.UUID;

public interface KitchenridersClient {
    void requestDelivery(UUID orderId, BigDecimal amount, String deliveryAddress);
}
