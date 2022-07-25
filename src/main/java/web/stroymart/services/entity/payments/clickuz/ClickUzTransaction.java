package web.stroymart.services.entity.payments.clickuz;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@Data
@RequiredArgsConstructor
@Entity
public class ClickUzTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "click_transaction_id")
    private UUID clickTransactionId;

    @Column(name = "click_trans_id", nullable = false)
    private Integer clickTransId;

    @Column(name = "service_id", nullable = false)
    private Integer serviceId;

    @Column(name = "click_paydoc_id", nullable = false)
    private Integer clickPaydocId;

    @Column(name = "merchant_trans_id", nullable = false)
    private String merchantTransId;

    private Integer amount;

    private Integer action;

    private Integer error;

    @Column(name = "error_note")
    private String errorNote;

    @Column(name = "sign_time")
    private String signTime;

    @Column(name = "sign_string")
    private String signString;

    private Integer state;

    @CreationTimestamp
    @Column(name = "created_time")
    private Timestamp createdTime;

}
