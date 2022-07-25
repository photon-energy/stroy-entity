package web.stroymart.services.entity.users;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import web.stroymart.services.entity.users.auth.Token;

import java.util.UUID;

@Data
@RequiredArgsConstructor
public class UserAuth {

    private UUID user_id;

    private Token token;

}
