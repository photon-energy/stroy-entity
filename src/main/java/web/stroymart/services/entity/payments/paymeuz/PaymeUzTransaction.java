package web.stroymart.services.entity.payments.paymeuz;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@Data
@RequiredArgsConstructor
@Entity
public class PaymeUzTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "paymeuz_transaction_id")
    private UUID paymeuzTransactionId;

    @Column(name = "paycom_id", nullable = false)
    private String paycomId;

    @Column(name = "paycom_time")
    private Timestamp paycomTime;

    @Column(name = "perform_time")
    private Timestamp performTime;

    @Column(name = "cancel_time")
    private Timestamp cancelTime;

    @Column(name = "order_number", nullable = false)
    private String orderNumber;

    private Integer reason;

    @Column(name = "state", nullable = false)
    private Integer state;

    @Column(name = "amount")
    private Integer amount;

    private String phone;

    @CreationTimestamp
    @Column(name = "created_time")
    private Timestamp createdTime;

}
