package web.stroymart.services.entity.products;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import java.util.UUID;

@Data
@RequiredArgsConstructor
public class Invertization {

    private Integer quantity;

    private InvertizationWarehouse warehouse;

    private UUID supplierId;

    private boolean status;

}
