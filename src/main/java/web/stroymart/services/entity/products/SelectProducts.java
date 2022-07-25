package web.stroymart.services.entity.products;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import web.stroymart.services.entity.users.supplier.Supplier;
import web.stroymart.services.entity.users.supplier.SupplierData;
import web.stroymart.services.entity.warehouse.Warehouse;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@Data
@RequiredArgsConstructor
@Entity
public class SelectProducts {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "select_product_id")
    private UUID selectProductId;

    @Column(name = "partner_id")
    private UUID partnerId;

    @ManyToOne(optional = false)
    private Products product;

    private Integer quantity;

    @OneToOne
    private Price price;

    @OneToOne
    private InvertizationWarehouse warehouse;

    @Transient
    private Warehouse warehouseData;

    @Transient
    private SupplierData supplierData;

    @Column(name = "supplier_id")
    private UUID supplierId;

    private boolean status;

    @CreationTimestamp
    @Column(name = "created_time")
    private Timestamp createdTime;
}
