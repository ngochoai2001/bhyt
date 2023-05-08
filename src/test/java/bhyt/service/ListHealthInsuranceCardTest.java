package bhyt.service;

import bhyt.dto.HICardRequest;
import bhyt.model.HealthInsuranceCard;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class ListHealthInsuranceCardTest {
    @Autowired
    HealthInsuranceCardService service;
    @Test
    @DisplayName("Test All field input are valid, expected return not empty list, standard case")
    void getAllHiCardWhenAllFieldsValid_ReturnNotEmptyList() throws ParseException {
        //create request
        //time 02-02-2000 -> hiện tại
        Date currentDate = new Date(new java.util.Date().getTime());
        Date dateEnd = new Date(new SimpleDateFormat("dd-MM-yyyy").parse("02-02-2000").getTime()) ;
        HICardRequest request = new HICardRequest(dateEnd,currentDate,"Thành phố Hà Nội",
                "Quận Ba Đình");
        List<HealthInsuranceCard> result = service.getAllHiCard(request);
        assertEquals(10,result.size());
        for(int i = 0; i< result.size();i++){
            assertEquals(request.getProvince(),result.get(i).getProvince()) ;
            assertEquals(request.getDistrict(),result.get(i).getDistrict() );
            Assertions.assertThat(result.get(i).getDateStart())
                    .isAfterOrEqualTo(request.getDateStart())
            ;
            Assertions.assertThat(result.get(i).getDateEnd())
                    .isBeforeOrEqualTo(request.getDateEnd())
            ;

        }
    }
    @Test
    @DisplayName("Test All field data start are invalid at lowerbound, should return not empty list")
    void getAllHiCardWhenDateStartLowerBoundNotValid_ReturnNotEmptyList() throws ParseException {
        //create request
        //time 02-02-2000 -> hiện tại
        Date currentDate = new Date(new java.util.Date().getTime());
        Date dateEnd = new Date(new SimpleDateFormat("dd-MM-yyyy").parse("31-12-1991").getTime()) ;
        HICardRequest request = new HICardRequest(dateEnd,currentDate,"Thành phố Hà Nội",
                "Quận Ba Đình");
        List<HealthInsuranceCard> result = service.getAllHiCard(request);
        assertEquals(10,result.size());
        for(int i = 0; i< result.size();i++){
            assertEquals(result.get(i).getProvince(),request.getProvince()) ;
            assertEquals(result.get(i).getDistrict(),request.getDistrict() );
            Assertions.assertThat(result.get(i).getDateStart())
                    .isAfterOrEqualTo(request.getDateStart())
            ;
            Assertions.assertThat(result.get(i).getDateEnd())
                    .isBeforeOrEqualTo(request.getDateEnd())
            ;

        }
    }
    @Test
    @DisplayName("Test All field data start are invalid at lowerbound, should thown exception")
    void getAllHiCardWhenDateStartLowerBoundValid_ReturnNotEmptyList() throws ParseException {
        //create request
        //time 02-02-2000 -> hiện tại
        Date currentDate = new Date(new java.util.Date().getTime());
        Date dateEnd = new Date(new SimpleDateFormat("dd-MM-yyyy").parse("31-12-1991").getTime()) ;
        HICardRequest request = new HICardRequest(dateEnd,currentDate,"Thành phố Hà Nội",
                "Quận Ba Đình");
        assertThrows(Exception.class, ()->service.getAllHiCard(request));


    }
    @Test
    @DisplayName("Test All field data Province are empty, should return empty list")
    void getAllHiCardWhenProvinceEmpty_ReturnEmptyList() throws ParseException {
        //create request
        //time 02-02-2000 -> hiện tại
        Date currentDate = new Date(new java.util.Date().getTime());
        Date dateEnd = new Date(new SimpleDateFormat("dd-MM-yyyy").parse("31-12-1991").getTime()) ;
        HICardRequest request = new HICardRequest(dateEnd,currentDate,"",
                "Quận Ba Đình");
        List<HealthInsuranceCard> result = service.getAllHiCard(request);
        assertEquals(0,result.size());

    }
    @Test
    @DisplayName("Test All field data Province are extra spaces , should return  empty list")
    void getAllHiCardWhenProvinceExtraSpaces_ReturnEmptyList() throws ParseException {
        //create request
        //time 02-02-2000 -> hiện tại
        Date currentDate = new Date(new java.util.Date().getTime());
        Date dateEnd = new Date(new SimpleDateFormat("dd-MM-yyyy").parse("31-12-1991").getTime()) ;
        HICardRequest request = new HICardRequest(dateEnd,currentDate,"  Thành phố Hà Nội  ",
                "Quận Ba Đình");
        List<HealthInsuranceCard> result = service.getAllHiCard(request);
        assertEquals(0,result.size());

    }
    @Test
    @DisplayName("Test All field data Distric are empty, should return  empty list")
    void getAllHiCardWhenDistrictEmpty_ReturnEmptyList() throws ParseException {
        //create request
        //time 02-02-2000 -> hiện tại
        Date currentDate = new Date(new java.util.Date().getTime());
        Date dateEnd = new Date(new SimpleDateFormat("dd-MM-yyyy").parse("31-12-1991").getTime()) ;
        HICardRequest request = new HICardRequest(dateEnd,currentDate,"Thành phố Hà Nội",
                "");
        List<HealthInsuranceCard> result = service.getAllHiCard(request);
        assertEquals(0,result.size());
    }
}
