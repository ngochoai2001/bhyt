package bhyt.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(indexes = {
        @Index(name = "idx_bill", columnList = "id"),

})
public class HealthInsuranceBill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date fromDate;
    private Date toDate;
    private double baseSalary;
    private double pensionSalary;
    @Enumerated(EnumType.STRING)
    private InsuranceType insuranceType;
    private double fee;
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;
    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;
    @ManyToOne
    @JoinColumn(name = "insurance_card_id", referencedColumnName = "id")
    private HealthInsuranceCard healthInsuranceCard;

    public String getPaymentStatus() {
        return paymentStatus.getPaymentStatus();
    }
    public String getPaymentMethod() {
        return paymentMethod.getPaymentMethod();
    }
}
