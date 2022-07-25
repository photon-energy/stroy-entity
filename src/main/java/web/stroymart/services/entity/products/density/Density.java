package web.stroymart.services.entity.products.density;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@Data
@RequiredArgsConstructor
@Entity
public class Density {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "density_id")
    private UUID densityId;

    @Column(name = "density_abbreviation", nullable = false)
    private String densityAbbreviation;

    @Column(name = "density_name_uz", nullable = false, unique = true)
    private String densityNameUz;

    @Column(name = "density_name_ru", nullable = false, unique = true)
    private String densityNameRu;

    @CreationTimestamp
    @Column(name = "created_time")
    private Timestamp createdTime;

    private boolean status;

    @Column(name = "user_id", nullable = false)
    private UUID userId;

}
