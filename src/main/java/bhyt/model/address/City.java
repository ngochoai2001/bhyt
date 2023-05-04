package bhyt.model.address;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL)
    private List<HealthInsuranceCompany> companyList;

}
