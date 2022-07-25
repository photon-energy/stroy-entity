package web.stroymart.services.entity.warehouse;


import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class WarehouseList {

    private String warehouse_id;
    private String warehouse_name;
    private String address;
    private String phone;
    private Integer block_count;
    private Integer row_count;
    private Integer bin_count;
    private Integer status;

}
