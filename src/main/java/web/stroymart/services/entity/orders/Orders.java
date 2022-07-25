package web.stroymart.services.entity.orders;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import web.stroymart.services.entity.users.customers.Customers;

import javax.persistence.*;
import java.sql.Driver;
import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

@Data
@RequiredArgsConstructor
@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_id")
    private UUID orderId;

    @Column(name = "order_number", nullable = false)
    private String orderNumber;

    @Column(name = "customer_id", nullable = false)
    private UUID customerId;

    @Transient
    private Customers customerData;

    @ElementCollection(fetch = FetchType.EAGER)
    private List<Carts> carts;

    @Transient
    @ElementCollection(fetch = FetchType.EAGER)
    private List<CartList> cartsList;

    private Integer amount;
    private Integer state;
    private String payment;

    @Column(name = "transaction_id")
    private String transactionId;

    private Integer delivery;

    private UUID driver;

    @OneToOne
    private DeliveryAddress deliveryAddress;

    @Column(name = "delivery_option")
    private String deliveryOption;

    @Column(name = "delivery_price")
    private Integer deliveryPrice;

    @Column(name = "delivery_time")
    private String deliveryTime;

    @Column(name = "cancelled_order")
    private Integer cancelledOrder;

    @CreationTimestamp
    @Column(name = "created_time")
    private Timestamp createdTime;

}
