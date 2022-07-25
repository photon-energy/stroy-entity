package web.stroymart.services.entity.warehouse;


import lombok.Data;
import lombok.RequiredArgsConstructor;
import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Data
@RequiredArgsConstructor
@Entity
public class Block {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "block_id")
    private UUID blockId;

    @Column(name = "block_name", nullable = false)
    private String blockName;
    private boolean status;

    @ElementCollection(fetch = FetchType.EAGER)
    private List<Row> row;

}
