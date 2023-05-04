package bhyt.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.List;
import java.util.Objects;
@Data
@Entity
@Table(name = "health_insurance_card",

        indexes = {
                @Index(name = "idx_bill", columnList = "id"),

        }
        )
@NoArgsConstructor
@AllArgsConstructor
public class HealthInsuranceCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column(nullable = false, unique = true)
    private String code;
    private String idCardNum;
    private String dob;
    private String gender;
    @Column
    private String phone;
    @Column
    private String district;
    @Column
    private String province;
    @Column(name = "dateStart")
    private Date dateStart;
    @Column(name = "dateEnd")
    private Date dateEnd;
    @OneToMany(mappedBy = "healthInsuranceCard", cascade = CascadeType.ALL)
    private List<HealthInsuranceBill> historyList;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HealthInsuranceCard)) return false;
        HealthInsuranceCard healthInsuranceCard = (HealthInsuranceCard) o;
        return getId().equals(healthInsuranceCard.getId()) && Objects.equals(getName(), healthInsuranceCard.getName()) && Objects.equals(getCode(), healthInsuranceCard.getCode()) && Objects.equals(getPhone(), healthInsuranceCard.getPhone())  && Objects.equals(getDistrict(), healthInsuranceCard.getDistrict()) && Objects.equals(getProvince(), healthInsuranceCard.getProvince()) && Objects.equals(getDateStart(), healthInsuranceCard.getDateStart()) && Objects.equals(getDateEnd(), healthInsuranceCard.getDateEnd()) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getCode(), getPhone(),  getDistrict(), getProvince(), getDateStart(), getDateEnd() );
    }
}
