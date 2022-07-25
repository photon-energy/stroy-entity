package web.stroymart.services.entity.users.customers;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@Data
@RequiredArgsConstructor
@Entity
public class WishList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "wish_list_id")
    private UUID wishListId;

    @Column(name = "customer_id", nullable = false)
    private UUID customerId;

    @Column(name = "select_product_id", nullable = false)
    private UUID selectProductId;

    @CreationTimestamp
    @Column(name = "created_time")
    private Timestamp createdTime;
}
