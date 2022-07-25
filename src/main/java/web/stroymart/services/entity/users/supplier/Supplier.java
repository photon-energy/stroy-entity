package web.stroymart.services.entity.users.supplier;


import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import web.stroymart.services.entity.users.regions.Regions;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@Data
@RequiredArgsConstructor
@Entity
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "supplier_id")
    private UUID supplierId;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "company_name", nullable = false)
    private String companyName;

    @Column(name = "phone_number", unique = true, nullable = false)
    private String phoneNumber;

    private String email;

    @Column(nullable = false)
    private boolean gender;

    private String country;

    @OneToOne
    private Regions regions;

    private String zipcode;

    private String address;

    private boolean status;

    @CreationTimestamp
    @Column(name = "created_time")
    private Timestamp createdTime;

}
