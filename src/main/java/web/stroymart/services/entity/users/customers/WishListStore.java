package web.stroymart.services.entity.users.customers;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import web.stroymart.services.entity.products.SelectProductStore;
import web.stroymart.services.entity.products.SelectProductWishlist;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@Data
@RequiredArgsConstructor
public class WishListStore {

    private UUID wishListId;

    private SelectProductWishlist selectProductStore;

    private Timestamp createdTime;
}
