package web.stroymart.services.entity.products;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@Data
@RequiredArgsConstructor
public class PriceWishlist {

    private UUID priceId;

    private Integer originalPrice;

    private Integer salesPrice;

    private Integer promotionPrice;

    private Integer promotion;

    private String promotionExpireStart;

    private String promotionExpireEnd;

    private boolean status;

    private boolean isPromotion;
}
