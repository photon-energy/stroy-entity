package web.stroymart.services.entity.products;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import web.stroymart.services.entity.converter.ConverterList;
import web.stroymart.services.entity.products.brand.Brand;
import web.stroymart.services.entity.products.category.Category;
import web.stroymart.services.entity.products.color.Color;
import web.stroymart.services.entity.products.composition.Composition;
import web.stroymart.services.entity.products.density.Density;
import web.stroymart.services.entity.products.density.DensityValue;
import web.stroymart.services.entity.products.subcategory.Subcategory;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

@Data
@RequiredArgsConstructor
@Entity
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id")
    private UUID productId;

    @ManyToOne(optional = false)
    private Category category;

    @ManyToOne(optional = false)
    private Subcategory subcategory;

    @ManyToOne(optional = false)
    private Brand brand;

    @ManyToOne(optional = false)
    private Color color;

    @ManyToOne(optional = false)
    private Composition composition;

    @Convert(converter = ConverterList.class)
    @Column(name = "product_image")
    private List<String> productImage;

    @Column(name = "product_name_uz", nullable = false)
    private String productNameUz;

    @Column(name = "product_name_ru", nullable = false)
    private String productNameRu;

    @Column(name = "product_description_uz", nullable = false)
    private String productDescriptionUz;

    @Column(name = "product_description_ru", nullable = false)
    private String productDescriptionRu;

    @Column(name = "product_barcode", nullable = false)
    private String productBarcode;

    @Convert(converter = ConverterList.class)
    private List<String> tags;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="product_id")
    private List<DensityValue> densityValue;

    private boolean status;

    @Transient
    private boolean isSelect;

    @Column(name = "user_id", nullable = false)
    private UUID userId;

    @CreationTimestamp
    @Column(name = "created_time")
    private Timestamp createdTime;
}
