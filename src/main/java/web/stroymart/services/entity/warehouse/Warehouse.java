package web.stroymart.services.entity.warehouse;


import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

@Data
@RequiredArgsConstructor
@Entity
public class Warehouse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "warehouse_id")
    private UUID warehouseId;

    @Column(name = "warehouse_name_uz", nullable = false, unique = true)
    private String warehouseNameUz;

    @Column(name = "warehouse_name_ru", nullable = false, unique = true)
    private String warehouseNameRu;

    private String address;

    @OneToOne
    private Location location;

    private String phone;

    @ElementCollection(fetch = FetchType.EAGER)
    private List<Block> block;

    private boolean status;

    @CreationTimestamp
    @Column(name = "created_time")
    private Timestamp createdTime;

    @Column(name = "user_id", nullable = false)
    private UUID userId;

}
