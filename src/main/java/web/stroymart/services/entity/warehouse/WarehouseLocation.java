package web.stroymart.services.entity.warehouse;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class WarehouseLocation {

    private String warehouse_id;
    private Integer block_id;
    private Integer row_number;
    private Integer bin;

}
