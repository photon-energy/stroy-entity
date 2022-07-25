package web.stroymart.services.entity.products;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.sql.Timestamp;
import java.util.UUID;

@Data
@RequiredArgsConstructor
public class SelectProductWishlist {

    private UUID selectProductId;

    private UUID partnerId;

    private ProductsWishlist product;

    private PriceWishlist price;

    private boolean status;
}
