package web.stroymart.services.entity.users.customers;


import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@Data
@RequiredArgsConstructor
public class CustomerStore {

    private UUID customerId;

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private String username;

    private String email;

    private String address;

    private String region;

    private boolean status;

    private Timestamp createdTime;

}
