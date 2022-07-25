package web.stroymart.services.entity.users.auth;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class UserCredentials {

    private String type;
    private String value;
    private boolean temporary;

}
