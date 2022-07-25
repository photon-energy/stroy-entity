package web.stroymart.services.entity.payments.paymeuz.result;


import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class PerformTransactionItems {

    private String transaction;
    private Long perform_time;
    private Integer state;

}
