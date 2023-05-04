package bhyt.repository;

import bhyt.model.HealthInsuranceBill;
import bhyt.model.HealthInsuranceCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface HealthInsuranceCardRepository extends JpaRepository<HealthInsuranceCard,Long> {
    @Query(" SELECT YEAR(e.toDate ) AS year, SUM(e.fee) AS sum FROM HealthInsuranceBill e join " +
            " HealthInsuranceCard card on e.healthInsuranceCard.id = card.id " +
            " WHERE (''=:city OR card.province = :city) AND (''=:district OR card.district = :district) " +
            " and e.paymentStatus = 'DONE' and YEAR(e.toDate) >= :startYear and YEAR(e.toDate) <= :endYear " +
            " GROUP BY YEAR(e.toDate) ")
    List<Object[]> reportByYear(String city, String district, int startYear, int endYear);

//
    @Query("SELECT e FROM HealthInsuranceBill e join " +
            " HealthInsuranceCard card on e.healthInsuranceCard.id = card.id " +
            " WHERE (''=:province OR card.province = :province) AND (''=:district OR card.district = :district) " +
            " and e.paymentStatus = 'DONE' and MONTH(e.toDate) = :month and YEAR(e.toDate) = :year " +
            "")
    List<HealthInsuranceBill > reportCompleteByMonth(String province, String district, int month, int year);

//
@Query("SELECT e FROM HealthInsuranceBill e join " +
        " HealthInsuranceCard card on e.healthInsuranceCard.id = card.id " +
        " WHERE (''=:province OR card.province = :province) AND (''=:district OR card.district = :district) " +
        " and e.paymentStatus <> 'DONE' and MONTH(e.toDate) = :month and YEAR(e.toDate) = :year " +
        " ")
List<HealthInsuranceBill > reportNotCompleteByMonth(String province, String district, int month, int year);


    @Query(" SELECT e FROM HealthInsuranceCard e WHERE  (e.province = :province AND e.district = :district AND e.dateStart >= :dateStart AND e.dateEnd <= :dateEnd) ")
    List<HealthInsuranceCard> getAll(String province, String district, Date dateStart, Date dateEnd);

}

