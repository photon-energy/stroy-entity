package web.stroymart.services.entity.products;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import web.stroymart.services.entity.products.brand.Brand;
import web.stroymart.services.entity.products.category.Category;
import web.stroymart.services.entity.products.color.Color;
import web.stroymart.services.entity.products.composition.Composition;
import web.stroymart.services.entity.products.density.DensityValue;
import web.stroymart.services.entity.products.subcategory.Subcategory;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

@Data
@RequiredArgsConstructor
@Entity
public class FeaturedProducts {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "featured_product_id")
    private UUID featuredProductId;

    @OneToOne(cascade = CascadeType.ALL)
    private SelectProducts selectProducts;

    private Integer count;

    private boolean status;

    @CreationTimestamp
    @Column(name = "created_time")
    private Timestamp createdTime;

}
