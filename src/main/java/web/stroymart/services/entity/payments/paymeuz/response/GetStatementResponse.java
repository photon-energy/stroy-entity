package web.stroymart.services.entity.payments.paymeuz.response;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import web.stroymart.services.entity.payments.paymeuz.error.ErrorResult;
import web.stroymart.services.entity.payments.paymeuz.result.GetStatementResult;

import java.util.List;


@Data
@RequiredArgsConstructor
public class GetStatementResponse {

    private ErrorResult error;
    private List<GetStatementResult> result;

}
