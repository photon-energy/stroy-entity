package web.stroymart.services.entity.products;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@Data
@RequiredArgsConstructor
@Entity
public class InvertizationWarehouse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "invertization_warehouse_id")
    private UUID invertizationWarehouseId;

    @Column(name = "warehouse_id")
    private UUID warehouseId;

    @Column(name = "block_id")
    private UUID blockId;

    @Column(name = "row_id")
    private UUID rowId;

    private Integer bin;

    @CreationTimestamp
    @Column(name = "created_time")
    private Timestamp createdTime;
}
