package web.stroymart.services.entity.users.regions;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@Data
@RequiredArgsConstructor
@Entity
public class Regions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "region_id")
    private UUID regionId;

    @Column(name = "region_name_uz", nullable = false, unique = true)
    private String regionNameUz;

    @Column(name = "region_name_ru", nullable = false, unique = true)
    private String regionNameRu;

    @CreationTimestamp
    @Column(name = "created_time")
    private Timestamp createdTime;

    private boolean status;
}
