package web.stroymart.services.entity.orders;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import web.stroymart.services.entity.products.ProductsWishlist;
import web.stroymart.services.entity.products.SelectProducts;
import java.sql.Timestamp;
import java.util.UUID;

@Data
@RequiredArgsConstructor
public class CartList {

    private UUID cart_id;
    private ProductsWishlist productsWishlist;
    private UUID customer_id;
    private Integer price;
    private Integer quantity;
    private Timestamp created_time;

}
