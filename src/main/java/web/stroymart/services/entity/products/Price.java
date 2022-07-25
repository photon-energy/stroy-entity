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
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "price_id")
    private UUID priceId;

    @Column(name = "original_price")
    private Integer originalPrice;

    @Column(name = "sales_price")
    private Integer salesPrice;

    @Column(name = "promotion_price")
    private Integer promotionPrice;

    private Integer promotion;

    @Column(name = "promotion_expire_start")
    private String promotionExpireStart;

    @Column(name = "promotion_expire_end")
    private String promotionExpireEnd;

    private boolean status;

    @Transient
    private boolean isPromotion;

    @CreationTimestamp
    @Column(name = "created_time")
    private Timestamp createdTime;
}
