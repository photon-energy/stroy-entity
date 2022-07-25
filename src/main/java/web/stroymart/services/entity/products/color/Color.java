package web.stroymart.services.entity.products.color;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@Data
@RequiredArgsConstructor
@Entity
public class Color {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "color_id")
    private UUID colorId;

    @Column(name = "color_name_uz", nullable = false)
    private String colorNameUz;

    @Column(name = "color_name_ru", nullable = false)
    private String colorNameRu;

    @Column(name = "color_code", nullable = false, unique = true)
    private String colorCode;

    @CreationTimestamp
    @Column(name = "created_time")
    private Timestamp createdTime;

    private boolean status;

    @Column(name = "user_id", nullable = false)
    private UUID userId;

}
