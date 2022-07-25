package web.stroymart.services.entity.users.partners;

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
public class Partners {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "partner_id")
    private UUID partnerId;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "company_name", nullable = false)
    private String companyName;

    @Column(name = "identification_number", nullable = false, unique = true)
    private String identificationNumber;

    @Column(nullable = false)
    private String district;

    @Column(nullable = false)
    private String address;

    @Column(name = "partner_photo", nullable = false)
    private String partnerPhoto;

    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    private String password;

    @OneToOne
    private Regions regions;

    @CreationTimestamp
    @Column(name = "created_time")
    private Timestamp createdTime;

    private boolean status;

}
