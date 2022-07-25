package web.stroymart.services.entity.orders;


import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@Data
@RequiredArgsConstructor
@Entity
public class Carts {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cart_id")
    private UUID cartId;

    @Column(name = "select_product_id", nullable = false)
    private UUID selectProductId;

    @Column(name = "customer_id")
    private UUID customerId;

    private Integer price;
    private Integer quantity;

    @CreationTimestamp
    @Column(name = "created_time")
    private Timestamp createdTime;

}
