package web.stroymart.services.entity.orders;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import java.util.List;



@Data
@RequiredArgsConstructor
public class OrderList {

    private List<Orders> current_orders;
    private List<Orders> orders_history;
    private Integer total;
}
