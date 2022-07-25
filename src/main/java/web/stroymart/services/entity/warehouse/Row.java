package web.stroymart.services.entity.warehouse;


import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Data
@RequiredArgsConstructor
@Entity
public class Row {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "row_id")
    private UUID rowId;

    @Column(name = "row_number")
    private Integer rowNumber;

    private boolean status;

    @Column(name = "bin_count")
    private Integer binCount;


}
