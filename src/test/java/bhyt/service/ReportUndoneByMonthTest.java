package bhyt.service;

import bhyt.dto.HiReportBillRequest;
import bhyt.model.HealthInsuranceBill;
import bhyt.model.PaymentStatus;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ReportUndoneByMonthTest {
    @Autowired
    HealthInsuranceCardService service;

    @Test
    @DisplayName("Test report by year when all fields are valid, month is at upper bound, result return an not empty list")
    void reportCompleteFeeWhenAllFieldsValid_ResultReturnNotEmptyList() {
        HiReportBillRequest request = new HiReportBillRequest("Thành phố Hà Nội","Quận Thanh Xuân",2020, 12);
        List<HealthInsuranceBill> result = service.getReportNotCompleteFee(request);
        assertNotNull(result);
        assertEquals(3,result.size());

        for(int i = 0;i<result.size();i++){
            assertNotNull(result.get(i));
            assertEquals(request.getProvince(),result.get(i).getHealthInsuranceCard().getProvince()) ;
            assertEquals(request.getDistrict() ,result.get(i).getHealthInsuranceCard().getDistrict());
            assertEquals( request.getYear(),Utils.getYear(result.get(i).getToDate()));
            assertEquals( request.getMonth(),Utils.getMonth(result.get(i).getToDate()));
            assertNotEquals(PaymentStatus.DONE.getPaymentStatus(),result.get(i).getPaymentStatus() );

        }
    }
    @Test
    @DisplayName("Test report by year when month is not valid at lower bound,expected result return an  empty list")
    void reportCompleteFeeWhenMonthIsNotValid_ResultReturnEmptyList() {
        HiReportBillRequest request = new HiReportBillRequest("Thành phố Hà Nội","Quận Thanh Xuân",2020, 0);
        List<HealthInsuranceBill> result = service.getReportNotCompleteFee(request);
        assertNotNull(result);
        assertEquals(0,result.size());


    }
    @Test
    @DisplayName("Test report by year when month is not valid at upper abound,expected result return an  empty list")
    void reportCompleteFeeWhenMonthIsNotValidAtBound_ResultReturnEmptyList() {
        HiReportBillRequest request = new HiReportBillRequest("Thành phố Hà Nội","Quận Thanh Xuân",2020, 13);
        List<HealthInsuranceBill> result = service.getReportNotCompleteFee(request);
        assertNotNull(result);
        assertEquals(0,result.size());
    }

    @Test
    @DisplayName("Test report by year when year is valid,month is valid, at lower bound,expected result return an not empty list")
    void reportCompleteFeeWhenYearIsValid_ResultReturnNotEmptyList() {
        HiReportBillRequest request = new HiReportBillRequest("Thành phố Hà Nội","Quận Thanh Xuân",1992,   1);
        List<HealthInsuranceBill> result = service.getReportNotCompleteFee(request);
        assertNotNull(result);
        assertEquals(3,result.size());

        for(int i = 0;i<result.size();i++){
            assertNotNull(result.get(i));
            assertEquals(request.getProvince(),result.get(i).getHealthInsuranceCard().getProvince()) ;
            assertEquals(request.getDistrict() ,result.get(i).getHealthInsuranceCard().getDistrict());
            assertEquals( request.getYear(),Utils.getYear(result.get(i).getToDate()));
            assertEquals( request.getMonth(),Utils.getMonth(result.get(i).getToDate()));
            assertNotEquals(PaymentStatus.DONE.getPaymentStatus(),result.get(i).getPaymentStatus() );

        }
    }
    @Test
    @DisplayName("Test report by year when year is invalid, at lower bound,expected result return an  empty list")
    void reportCompleteFeeWhenYearIsInValid_ResultReturnEmptyList() {
        HiReportBillRequest request = new HiReportBillRequest("Thành phố Hà Nội","Quận Thanh Xuân",1991,   1);
        List<HealthInsuranceBill> result = service.getReportNotCompleteFee(request);
        assertNotNull(result);
        assertEquals(0,result.size());

        for(int i = 0;i<result.size();i++){
            assertNotNull(result.get(i));
            assertEquals(request.getProvince(),result.get(i).getHealthInsuranceCard().getProvince()) ;
            assertEquals(request.getDistrict() ,result.get(i).getHealthInsuranceCard().getDistrict());
            assertEquals( request.getYear(),Utils.getYear(result.get(i).getToDate()));
            assertEquals( request.getMonth(),Utils.getMonth(result.get(i).getToDate()));
            assertNotEquals(PaymentStatus.DONE.getPaymentStatus(),result.get(i).getPaymentStatus() );

        }
    }
}
