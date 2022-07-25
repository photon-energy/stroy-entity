package web.stroymart.services.entity.users.auth;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import java.util.Map;

@Data
@RequiredArgsConstructor
public class NewUser {

    private String username;
    private boolean enabled;
    private boolean emailVerified;
    private String firstName;
    private String lastName;
    private Map<String, String> attributes;
    private UserCredentials[] credentials;
    private String[] groups;

}
