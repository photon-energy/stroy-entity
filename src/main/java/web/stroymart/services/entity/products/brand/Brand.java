package web.stroymart.services.entity.products.brand;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@Data
@RequiredArgsConstructor
@Entity
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "brand_id")
    private UUID brandId;

    @Column(name = "brand_title", nullable = false)
    private String brandTitle;

    @Column(name = "brand_description", nullable = false)
    private String brandDescription;

    @Column(name = "brand_image", nullable = false)
    private String brandImage;

    @CreationTimestamp
    @Column(name = "created_time")
    private Timestamp createdTime;

    private boolean status;

    @Column(name = "user_id", nullable = false)
    private UUID userId;
}
