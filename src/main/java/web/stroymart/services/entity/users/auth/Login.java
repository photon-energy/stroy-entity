package web.stroymart.services.entity.users.auth;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Login {

    private String phone;

    private String password;

}
