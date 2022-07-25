package web.stroymart.services.entity.payments.paymeuz.response;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import web.stroymart.services.entity.payments.paymeuz.error.ErrorResult;
import web.stroymart.services.entity.payments.paymeuz.result.CheckTransactionResult;

@Data
@RequiredArgsConstructor
public class CheckTransactionResponse {

    private ErrorResult error;
    private CheckTransactionResult result;

}
