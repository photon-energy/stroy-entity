package web.stroymart.services.entity.orders;


import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Data
@RequiredArgsConstructor
@Entity
public class TopSelling {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "top_selling_id")
    private UUID topSellingId;

    @Column(name = "partner_id")
    private UUID partnerId;

    @Column(name = "select_product_id")
    private UUID selectProductId;
    private Integer quantity;

}
