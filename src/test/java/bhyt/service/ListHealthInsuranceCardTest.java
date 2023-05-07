package bhyt.service;

import bhyt.dto.HICardRequest;
import bhyt.model.HealthInsuranceCard;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@SpringBootTest
public class ListHealthInsuranceCardTest {
    @Autowired
    HealthInsuranceCardService service;
    @Test
    @DisplayName("Test get all list, return a list")
    void getAll3() throws ParseException {
        //create request
        Date currentDate = new Date(new java.util.Date().getTime());
        Date dateEnd = new Date(new SimpleDateFormat("dd-MM-yyyy").parse("23-05-2005").getTime()) ;
        HICardRequest request = new HICardRequest(dateEnd,currentDate,"Thành phố Hà Nội",
                "Quận Thanh Xuân");
        List<HealthInsuranceCard> result = service.getAllHiCard(request);

//        List<HealthInsuranceCard> expected =  ListCustomer.getComplete1();
//
//        ass(result.size(), ListCustomer.getComplete1().size());
//        for(int i = 0; i< result.size();i++){
//            assertNotNull(expected.get(i));
//            assertEquals(result.get(i), expected.get(i));
//        }
    }
}
