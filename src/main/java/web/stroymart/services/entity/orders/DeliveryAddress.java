package web.stroymart.services.entity.orders;


import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Data
@RequiredArgsConstructor
@Entity
public class DeliveryAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "delivery_address_id")
    private UUID deliveryAddressId;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    private String address;
    private String city;

    @Column(name = "postal_code")
    private String postalCode;

    @Column(name = "phone_number", nullable = false)
    private String phoneNumer;
    private String email;

}
