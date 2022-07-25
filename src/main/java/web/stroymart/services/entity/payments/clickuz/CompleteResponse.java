package web.stroymart.services.entity.payments.clickuz;


import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class CompleteResponse {

    private Integer click_trans_id;
    private String merchant_trans_id;
    private Integer merchant_confirm_id;
    private Integer error;
    private String error_note;

}
