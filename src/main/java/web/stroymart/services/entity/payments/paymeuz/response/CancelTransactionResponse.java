package web.stroymart.services.entity.payments.paymeuz.response;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import web.stroymart.services.entity.payments.paymeuz.error.ErrorResult;
import web.stroymart.services.entity.payments.paymeuz.result.CancelTransactionResult;

@Data
@RequiredArgsConstructor
public class CancelTransactionResponse {

    private ErrorResult error;
    private CancelTransactionResult result;

}
