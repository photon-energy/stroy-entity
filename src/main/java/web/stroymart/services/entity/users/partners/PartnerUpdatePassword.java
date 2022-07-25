package web.stroymart.services.entity.users.partners;


import lombok.Data;
import lombok.RequiredArgsConstructor;


@Data
@RequiredArgsConstructor
public class PartnerUpdatePassword {

    private String phoneNumber;

    private String password;
}
