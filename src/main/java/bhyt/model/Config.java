package bhyt.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "config")
public class Config {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private double salary;
    @Column
    private double worker;
    @Column
    private double retirement;
    @Column
    private double maternity;
    @Column
    private double unemployment;
    @Column
    private double other;
    @Column
    private double familyOne;
    @Column
    private double familyTwo;
    @Column
    private double familyThree;
    @Column
    private double familyFour;
    @Column
    private double familyFive;
    @Column
    private double poor;
    @Column
    private double nearPoor;
    @Column
    private double student;
    @Column
    private double farmer;


}