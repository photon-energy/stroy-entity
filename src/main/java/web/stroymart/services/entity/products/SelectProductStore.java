package web.stroymart.services.entity.products;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import web.stroymart.services.entity.users.supplier.Supplier;
import web.stroymart.services.entity.warehouse.Warehouse;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@Data
@RequiredArgsConstructor
public class SelectProductStore {

    private UUID selectProductId;

    private UUID partnerId;

    private Products product;

    private Price price;

    private boolean status;

    private Timestamp createdTime;
}
