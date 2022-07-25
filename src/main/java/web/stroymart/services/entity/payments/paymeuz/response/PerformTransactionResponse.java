package web.stroymart.services.entity.payments.paymeuz.response;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import web.stroymart.services.entity.payments.paymeuz.error.ErrorResult;
import web.stroymart.services.entity.payments.paymeuz.result.PerformTransactionResult;


@Data
@RequiredArgsConstructor
public class PerformTransactionResponse {

    private ErrorResult error;
    private PerformTransactionResult result;

}
