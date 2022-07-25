package web.stroymart.services.entity.payments.paymeuz.response;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import web.stroymart.services.entity.payments.paymeuz.error.ErrorResult;
import web.stroymart.services.entity.payments.paymeuz.result.CheckPerformTransactionResult;

@Data
@RequiredArgsConstructor
public class CheckPerformTransactionResponse {

    private ErrorResult error;
    private CheckPerformTransactionResult result;

}
