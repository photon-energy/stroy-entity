package web.stroymart.services.entity.products;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import java.util.UUID;

@Data
@RequiredArgsConstructor
public class SelectProduct {

    private UUID selectProductId;

    private UUID partnerId;

    private UUID product;
}
