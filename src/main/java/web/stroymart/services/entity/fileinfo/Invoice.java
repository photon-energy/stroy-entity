package web.stroymart.services.entity.fileinfo;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Data
@RequiredArgsConstructor
public class Invoice {

    private String order_number;
    private UUID order_id;

}
