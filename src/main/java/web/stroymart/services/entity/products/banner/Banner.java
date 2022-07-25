package web.stroymart.services.entity.products.banner;


import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@Data
@RequiredArgsConstructor
@Entity
public class Banner {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "banner_id")
    private UUID bannerId;

    @Column(name = "banner_title", nullable = false)
    private String bannerTitle;

    @Column(name = "banner_description", nullable = false)
    private String bannerDescription;

    @Column(name = "banner_image", nullable = false)
    private String bannerImage;

    @CreationTimestamp
    @Column(name = "created_time")
    private Timestamp createdTime;

    private boolean status;

    @Column(name = "user_id", nullable = false)
    private UUID userId;

}
