package web.stroymart.services.entity.payments.paymeuz.result;


import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class CreateTransactionItems {

    private Long create_time;
    private String transaction;
    private Integer state;

}
