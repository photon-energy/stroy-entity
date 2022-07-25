package web.stroymart.services.entity.products.composition;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@Data
@RequiredArgsConstructor
@Entity
public class Composition {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "composition_id")
    private UUID compositionId;

    @Column(name = "composition_name_uz", nullable = false, unique = true)
    private String compositionNameUz;

    @Column(name = "composition_name_ru", nullable = false, unique = true)
    private String compositionNameRu;

    @Column(name = "composition_description_uz", nullable = false)
    private String compositionDescriptionUz;

    @Column(name = "composition_description_ru", nullable = false)
    private String compositionDescriptionRu;

    @CreationTimestamp
    @Column(name = "created_time")
    private Timestamp createdTime;

    private boolean status;

    @Column(name = "user_id", nullable = false)
    private UUID userId;
}
