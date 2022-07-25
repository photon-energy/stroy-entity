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
public class DensityValue {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "density_value_id")
    private UUID densityValueId;

    @OneToOne(cascade = CascadeType.ALL)
    private Density density;

    @Column(nullable = false)
    private String value;

    @CreationTimestamp
    @Column(name = "created_time")
    private Timestamp createdTime;

    @Column(name = "user_id", nullable = false)
    private UUID userId;

}
