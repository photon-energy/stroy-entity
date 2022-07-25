package web.stroymart.services.entity.payments.clickuz;


import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class PrepareRequest {

    private Integer click_trans_id;
    private Integer service_id;
    private Integer click_paydoc_id;
    private String merchant_trans_id;
    private Float amount;
    private Integer action;
    private Integer error;
    private String error_note;
    private String sign_time;
    private String sign_string;


}
