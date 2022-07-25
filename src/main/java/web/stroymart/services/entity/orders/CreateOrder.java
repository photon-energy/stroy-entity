package web.stroymart.services.entity.orders;


import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Data
@RequiredArgsConstructor
public class CreateOrder {

    private UUID customer_id;
    private String payment_type;
    private DeliveryAddress delivery_address;
    private String delivery_option;
    private Integer delivery_price;

}
