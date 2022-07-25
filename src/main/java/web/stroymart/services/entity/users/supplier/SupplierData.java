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
public class SupplierData {

    private UUID supplierId;

    private String firstName;

    private String lastName;

    private String companyName;

    private String phoneNumber;

    private String email;

    private boolean gender;

    private String country;

    private String zipcode;

    private String address;

    private boolean status;

}
