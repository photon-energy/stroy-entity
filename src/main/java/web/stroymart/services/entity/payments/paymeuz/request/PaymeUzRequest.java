package web.stroymart.services.entity.payments.paymeuz.request;


import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class PaymeUzRequest {

    private Integer id;
    private String method;
    private Params params;

}
