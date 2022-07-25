package web.stroymart.services.entity.payments.paymeuz.response;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import web.stroymart.services.entity.payments.paymeuz.error.ErrorResult;

@Data
@RequiredArgsConstructor
public class AuthResponse {

    private ErrorResult error;

}
