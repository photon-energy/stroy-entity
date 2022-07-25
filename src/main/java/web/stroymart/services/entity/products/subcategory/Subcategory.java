package web.stroymart.services.entity.products.subcategory;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import web.stroymart.services.entity.products.category.Category;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@Data
@RequiredArgsConstructor
@Entity
public class Subcategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "subcategory_id")
    private UUID subcategoryId;

    @Column(name = "subcategory_name_uz", nullable = false, unique = true)
    private String subcategoryNameUz;

    @Column(name = "subcategory_name_ru", nullable = false, unique = true)
    private String subcategoryNameRu;

    @Column(name = "subcategory_description_uz", nullable = false)
    private String subcategoryDescriptionUz;

    @Column(name = "subcategory_description_ru", nullable = false)
    private String subcategoryDescriptionRu;

    @CreationTimestamp
    @Column(name = "created_time")
    private Timestamp createdTime;

    private boolean status;

    @ManyToOne(optional = false)
    private Category category;

    @Column(name = "user_id", nullable = false)
    private UUID userId;
}
