package bhyt.service;

import bhyt.dto.HIReportRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ReportByYearTest {
    @Autowired
    HealthInsuranceCardService service;
    @Test
    @DisplayName("Test report by year when all fields are valid, result return an not empty list")
    void reportByYearWhenAllFieldsValid_ResultReturnNotEmptyList() {
        HIReportRequest request = new HIReportRequest("Thành phố Hà Nội","Quận Thanh Xuân",1992, 2023);
        List<Object[]> result = service.getReportByYear(request);
        List<Object[]> expected = expectedResultFrom1992To2023_ThanhXuanHanoi();

        assertNotNull(result);
        assertEquals(result.size(),2);

        for(int i = 0;i<result.size();i++){
            assertNotNull(result.get(i));
            assertEquals((Integer) result.get(i)[0], expected.get(i)[0]);
            assertEquals((Double) result.get(i)[1], expected.get(i)[1]);
        }
    }
    @Test
    @DisplayName("Test report by year when only province is valid, should return an empty list")
    void reportByYearWhenProvinceFieldValid_ReturnEmptyList() {
        HIReportRequest request = new HIReportRequest("Thành phố Hà Nội","",null, null);
        List<Object[]> result = service.getReportByYear(request);
        assertNotNull(result);
        assertEquals(result.size(),0);
    }
    @Test
    @DisplayName("Test report by year when only province and district is valid, should return an empty list")
    void reportByYearWhenProvinceDistrictFieldValid_ReturnEmptyList() {
        HIReportRequest request = new HIReportRequest("Thành phố Hà Nội","Quận Thanh Xuân",null, null);
        List<Object[]> result = service.getReportByYear(request);
        assertNotNull(result);
        assertEquals(result.size(),0);

    }
    @Test
    @DisplayName("Test report by year when only  district is valid, should return an empty list")
    void reportByYearWhenDistrictFieldValid_ReturnEmptyList() {
        HIReportRequest request = new HIReportRequest("","Quận Thanh Xuân",null, null);
        List<Object[]> result = service.getReportByYear(request);
        assertNotNull(result);
        assertEquals(result.size(),0);
    }
    @Test
    @DisplayName("Test report by year when only  start year is valid, should return an empty list")
    void reportByYearWhenStartYearFieldValid_ReturnEmptyList() {
        HIReportRequest request = new HIReportRequest("","",1992, null);
        List<Object[]> result = service.getReportByYear(request);
        assertNotNull(result);
        assertEquals(result.size(),0);
    }
    @Test
    @DisplayName("Test report by year when only  end year is valid, should return an empty list")
    void reportByYearWhenEndYearFieldValid_ReturnEmptyList() {
        HIReportRequest request = new HIReportRequest("","",null, 2023);
        List<Object[]> result = service.getReportByYear(request);
        assertNotNull(result);
        assertEquals(result.size(),0);
    }
    @Test
    @DisplayName("Test report by year when  start year > end year, should return an empty list")
    void reportByYearWhenStartYearGreaterEndYear_ReturnEmptyList() {
        HIReportRequest request = new HIReportRequest("Thành phố Hà Nội","Quận Thanh Xuân",2023, 2000);
        List<Object[]> result = service.getReportByYear(request);
        assertNotNull(result);
        assertEquals(result.size(),0);

    }
    //data set
    public List<Object[]>expectedResultFrom1992To2023_ThanhXuanHanoi (){
        List<Object[]> result = new ArrayList<>();
        Object[] o1 = new Object[2];
        o1[0] = 2000;
        o1[1] = 2400000.0d;
        result.add(o1);
        Object[] o2 = new Object[2];
        o2[0] = 2001;
        o2[1] = 800000.0;
        result.add(o2);
        return result;
    }
}
