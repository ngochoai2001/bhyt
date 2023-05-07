package bhyt.service;

import bhyt.dto.HiReportBillRequest;
import bhyt.model.HealthInsuranceBill;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class ReportUndoneByMonthTest {
    @Autowired
    HealthInsuranceCardService service;

    @Test
    @DisplayName("Test report by year when all fields are valid, result return an not empty list")
    void reportCompleteFeeWhenAllFieldsValid_ResultReturnNotEmptyList() {
        HiReportBillRequest request = new HiReportBillRequest("Thành phố Hà Nội","Quận Thanh Xuân",2020, 12);
        List<HealthInsuranceBill> result = service.getReportNotCompleteFee(request);
        assertNotNull(result);
        assertEquals(result.size(),1);

        for(int i = 0;i<result.size();i++){
            assertNotNull(result.get(i));
            assertEquals(result.get(i).getHealthInsuranceCard().getProvince(),"Thành phố Hà Nội") ;
            assertEquals(result.get(i).getHealthInsuranceCard().getDistrict(),"Quận Thanh Xuân" );
            assertEquals(Utils.getYear(result.get(i).getToDate()), 2020);
            assertEquals(Utils.getMonth(result.get(i).getToDate()), 12);
        }
    }
    @Test
    @DisplayName("Test report by year when month is not valid at lower bound, result return an  empty list")
    void reportCompleteFeeWhenMonthIsNotValid_ResultReturnEmptyList() {
        HiReportBillRequest request = new HiReportBillRequest("Thành phố Hà Nội","Quận Thanh Xuân",2020, 0);
        List<HealthInsuranceBill> result = service.getReportNotCompleteFee(request);
        assertNotNull(result);
        assertEquals(result.size(),1);

        for(int i = 0;i<result.size();i++){
            assertNotNull(result.get(i));
            assertEquals(result.get(i).getHealthInsuranceCard().getProvince(),"Thành phố Hà Nội") ;
            assertEquals(result.get(i).getHealthInsuranceCard().getDistrict(),"Quận Thanh Xuân" );
            assertEquals(Utils.getYear(result.get(i).getToDate()), 2020);
            assertEquals(Utils.getMonth(result.get(i).getToDate()), 12);
        }
    }
    @Test
    @DisplayName("Test report by year when month is not valid at upper abound, result return an  empty list")
    void reportCompleteFeeWhenMonthIsNotValidAtBound_ResultReturnEmptyList() {
        HiReportBillRequest request = new HiReportBillRequest("Thành phố Hà Nội","Quận Thanh Xuân",2020, 13);
        List<HealthInsuranceBill> result = service.getReportNotCompleteFee(request);
        assertNotNull(result);
        assertEquals(result.size(),1);

        for(int i = 0;i<result.size();i++){
            assertNotNull(result.get(i));
            assertEquals(result.get(i).getHealthInsuranceCard().getProvince(),"Thành phố Hà Nội") ;
            assertEquals(result.get(i).getHealthInsuranceCard().getDistrict(),"Quận Thanh Xuân" );
            assertEquals(Utils.getYear(result.get(i).getToDate()), 2020);
            assertEquals(Utils.getMonth(result.get(i).getToDate()), 12);
        }
    }
    @Test
    @DisplayName("Test report by year when month is valid, at lower bound, result return an not empty list")
    void reportCompleteFeeWhenMonthIsValid_ResultReturnNotEmptyList() {
        HiReportBillRequest request = new HiReportBillRequest("Thành phố Hà Nội","Quận Thanh Xuân",2020,   1);
        List<HealthInsuranceBill> result = service.getReportNotCompleteFee(request);
        assertNotNull(result);
        assertEquals(result.size(),1);

        for(int i = 0;i<result.size();i++){
            assertNotNull(result.get(i));
            assertEquals(result.get(i).getHealthInsuranceCard().getProvince(),"Thành phố Hà Nội") ;
            assertEquals(result.get(i).getHealthInsuranceCard().getDistrict(),"Quận Thanh Xuân" );
            assertEquals(Utils.getYear(result.get(i).getToDate()), 2020);
            assertEquals(Utils.getMonth(result.get(i).getToDate()), 12);
        }
    }
    @Test
    @DisplayName("Test report by year when year is valid, at lower bound, result return an not empty list")
    void reportCompleteFeeWhenYearIsValid_ResultReturnNotEmptyList() {
        HiReportBillRequest request = new HiReportBillRequest("Thành phố Hà Nội","Quận Thanh Xuân",1992,   1);
        List<HealthInsuranceBill> result = service.getReportNotCompleteFee(request);
        assertNotNull(result);
        assertEquals(result.size(),1);

        for(int i = 0;i<result.size();i++){
            assertNotNull(result.get(i));
            assertEquals(result.get(i).getHealthInsuranceCard().getProvince(),"Thành phố Hà Nội") ;
            assertEquals(result.get(i).getHealthInsuranceCard().getDistrict(),"Quận Thanh Xuân" );
            assertEquals(Utils.getYear(result.get(i).getToDate()), 2020);
            assertEquals(Utils.getMonth(result.get(i).getToDate()), 12);
        }
    }
    @Test
    @DisplayName("Test report by year when year is invalid, at lower bound, result return an not empty list")
    void reportCompleteFeeWhenYearIsInValid_ResultReturnNotEmptyList() {
        HiReportBillRequest request = new HiReportBillRequest("Thành phố Hà Nội","Quận Thanh Xuân",1991,   1);
        List<HealthInsuranceBill> result = service.getReportNotCompleteFee(request);
        assertNotNull(result);
        assertEquals(result.size(),1);

        for(int i = 0;i<result.size();i++){
            assertNotNull(result.get(i));
            assertEquals(result.get(i).getHealthInsuranceCard().getProvince(),"Thành phố Hà Nội") ;
            assertEquals(result.get(i).getHealthInsuranceCard().getDistrict(),"Quận Thanh Xuân" );
            assertEquals(Utils.getYear(result.get(i).getToDate()), 2020);
            assertEquals(Utils.getMonth(result.get(i).getToDate()), 12);
        }
    }
}
