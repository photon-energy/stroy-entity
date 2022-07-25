package web.stroymart.services.entity.payments.paymeuz;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Account {

    private String order;
    private String phone;
}
