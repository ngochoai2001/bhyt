package bhyt.model.address;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class HealthInsuranceCompany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "city_id")
    @JsonIgnore
    private City city;

}
