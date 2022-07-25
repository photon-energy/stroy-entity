package web.stroymart.services.entity.users.confirmation;


import lombok.Data;
import lombok.RequiredArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@Data
@RequiredArgsConstructor
@Entity
public class UserConfirmation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID confirmation_id;
    private String phone;
    private String code;
    private String expire_time;
    private String created_time;
}
