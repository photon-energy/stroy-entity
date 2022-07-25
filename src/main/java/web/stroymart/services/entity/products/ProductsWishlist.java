package web.stroymart.services.entity.products;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import web.stroymart.services.entity.converter.ConverterList;
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
public class ProductsWishlist {

    private UUID productId;

    private List<String> productImage;

    private String productNameUz;

    private String productNameRu;

    private String productDescriptionUz;

    private String productDescriptionRu;

    private boolean status;
}
