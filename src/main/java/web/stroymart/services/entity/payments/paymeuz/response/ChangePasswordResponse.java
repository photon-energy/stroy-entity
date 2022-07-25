package web.stroymart.services.entity.payments.paymeuz.response;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import web.stroymart.services.entity.payments.paymeuz.error.ErrorResult;
import web.stroymart.services.entity.payments.paymeuz.result.ChangePasswordResult;


@Data
@RequiredArgsConstructor
public class ChangePasswordResponse {

    private ErrorResult error;
    private ChangePasswordResult result;

}
