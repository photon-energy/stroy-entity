package web.stroymart.services.entity.users.driver;


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
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "driver_id")
    private UUID driverId;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "phone_number", unique = true, nullable = false)
    private String phoneNumber;

    @Column(name = "car_number", nullable = false)
    private String carNumber;

    @Column(nullable = false)
    private boolean gender;

    private String photo;

    @OneToOne
    private Regions regions;

    private String city;

    private String address;

    private boolean status;

    @CreationTimestamp
    @Column(name = "created_time")
    private Timestamp createdTime;

}
