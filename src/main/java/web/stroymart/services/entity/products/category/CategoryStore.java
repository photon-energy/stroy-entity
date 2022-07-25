package web.stroymart.services.entity.products.category;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import web.stroymart.services.entity.products.subcategory.Subcategory;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

@Data
@RequiredArgsConstructor
public class CategoryStore {

    private UUID categoryId;

    private String categoryNameUz;

    private String categoryNameRu;

    private String categoryDescriptionUz;

    private String categoryDescriptionRu;

    private String categoryImage;

    private boolean status;

    private List<Subcategory> subcategories;

}
