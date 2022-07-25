package web.stroymart.services.entity.payments.paymeuz.result;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import web.stroymart.services.entity.payments.paymeuz.Account;


@Data
@RequiredArgsConstructor
public class GetStatementItems {

    private String id;
    private Long time;
    private Integer amount;
    private Account account;
    private Long create_time;
    private Long perform_time;
    private Long cancel_time;
    private String transaction;
    private Integer state;
    private Integer reason;

}
