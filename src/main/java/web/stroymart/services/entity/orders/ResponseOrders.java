package web.stroymart.services.entity.orders;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
public class ResponseOrders {

    private boolean success;
    private String message;
    private Integer total;
    private List<Orders> data;

}
