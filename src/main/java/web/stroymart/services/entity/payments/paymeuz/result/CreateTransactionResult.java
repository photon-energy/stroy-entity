package web.stroymart.services.entity.payments.paymeuz.result;


import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class CreateTransactionResult {

    private String jsonrpc = "2.0";
    private Integer id;
    private CreateTransactionItems result;

}
