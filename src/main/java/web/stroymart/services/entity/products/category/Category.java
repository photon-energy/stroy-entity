package web.stroymart.services.entity.products.category;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import web.stroymart.services.entity.users.Users;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@Data
@RequiredArgsConstructor
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "category_id")
    private UUID categoryId;

    @Column(name = "category_name_uz", nullable = false, unique = true)
    private String categoryNameUz;

    @Column(name = "category_name_ru", nullable = false, unique = true)
    private String categoryNameRu;

    @Column(name = "category_description_uz", nullable = false)
    private String categoryDescriptionUz;

    @Column(name = "category_description_ru", nullable = false)
    private String categoryDescriptionRu;

    @Column(name = "category_image", nullable = false)
    private String categoryImage;

    @CreationTimestamp
    @Column(name = "created_time")
    private Timestamp createdTime;

    private boolean status;

    @Column(name = "user_id", nullable = false)
    private UUID userId;

}
