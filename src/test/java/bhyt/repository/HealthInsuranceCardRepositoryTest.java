package bhyt.repository;

import bhyt.datatest.ListCustomer;
import bhyt.model.HealthInsuranceCard;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class HealthInsuranceCardRepositoryTest {
    @Autowired
    HealthInsuranceCardRepository healthInsuranceCardRepository;
    /*
    @Test
    @DisplayName("Test report by year when all fields are empty")
    void reportByYear() {
//        List<Object[]> result = healthInsuranceCardRepository.reportByYear("","","");
//        List<Object[]> expected1 = expected1();
//
//        assertNotNull(result);
//        assertEquals(result.size(),3);
//
//        for(int i = 0;i<result.size();i++){
//            assertNotNull(expected1.get(i));
//            assertEquals((Integer) result.get(i)[0], expected1.get(i)[0]);
//            assertEquals((Double) result.get(i)[1], expected1.get(i)[1]);
//        }
    }

    @Test
    @DisplayName("Test report by year when district and ward fields are empty")
    void reportByYear1() {
//        List<Object[]> result = healthInsuranceCardRepository.reportByYear("Thành phố Hà Nội","","");
//        List<Object[]> expected1 = expected2();
//
//        assertNotNull(result);
//        assertEquals(result.size(),3);
//
//        for(int i = 0;i<result.size();i++){
//            assertNotNull(expected1.get(i));
//            assertEquals((Integer) result.get(i)[0], expected1.get(i)[0]);
//            assertEquals((Double) result.get(i)[1], expected1.get(i)[1]);
//        }
    }
    @Test
    @DisplayName("Test report by year when ward fields are empty")
    void reportByYear2() {
        List<Object[]> result = healthInsuranceCardRepository.reportByYear("Thành phố Hà Nội","Quận Hà Đông","");
        List<Object[]> expected1 = expected3();

        assertNotNull(result);
        assertEquals(result.size(),3);

        for(int i = 0;i<result.size();i++){
            assertNotNull(expected1.get(i));
            assertEquals((Integer) result.get(i)[0], expected1.get(i)[0]);
            assertEquals((Double) result.get(i)[1], expected1.get(i)[1]);
        }
    }
    */
    @Test
    @DisplayName("Test report by year when no fields are empty")
    void reportByYear() {
        List<Object[]> result = healthInsuranceCardRepository.reportByYear("Thành phố Hà Nội","Quận Thanh Xuân",2020, 2023);
        List<Object[]> expected1 = expected1();

        assertNotNull(result);
        assertEquals(result.size(),1);

        for(int i = 0;i<result.size();i++){
            assertNotNull(expected1.get(i));
            assertEquals((Integer) result.get(i)[0], expected1.get(i)[0]);
            assertEquals((Double) result.get(i)[1], expected1.get(i)[1]);
        }
    }
    public List<Object[]> expected1(){
        List<Object[]> result = new ArrayList<>();
        Object[] o1 = new Object[2];
        o1[0] = 2023;
        o1[1] = 540000.0d;
        result.add(o1);
//        Object[] o2 = new Object[2];
//        o2[0] = 2021;
//        o2[1] = 450000.0d;
//        result.add(o2);
//        Object[] o3 = new Object[2];
//        o3[0] = 2022;
//        o3[1] = 450000.0d;
//        result.add(o3);
        return result;
    }
    public List<Object[]> expected2(){
        List<Object[]> result = new ArrayList<>();
        Object[] o1 = new Object[2];
        o1[0] = 2023;
        o1[1] = 700000.0d;
        result.add(o1);
        Object[] o2 = new Object[2];
        o2[0] = 2021;
        o2[1] = 450000.0d;
        result.add(o2);
        Object[] o3 = new Object[2];
        o3[0] = 2022;
        o3[1] = 450000.0d;
        result.add(o3);
        return result;
    }
    public List<Object[]> expected3(){
        List<Object[]> result = new ArrayList<>();
        Object[] o1 = new Object[2];
        o1[0] = 2023;
        o1[1] = 600000.0d;
        result.add(o1);
        Object[] o2 = new Object[2];
        o2[0] = 2021;
        o2[1] = 450000.0d;
        result.add(o2);
        Object[] o3 = new Object[2];
        o3[0] = 2022;
        o3[1] = 400000.0d;
        result.add(o3);
        return result;
    }
    public List<Object[]> expected4(){
        List<Object[]> result = new ArrayList<>();

        Object[] o2 = new Object[2];
        o2[0] = 2021;
        o2[1] = 450000.0d;
        result.add(o2);
        Object[] o3 = new Object[2];
        o3[0] = 2022;
        o3[1] = 400000.0d;
        result.add(o3);
        return result;
    }
/*
    @Test
    @DisplayName("Report Complete search by date only")
    void reportComplete0() throws ParseException {
        Date currentDate = new Date(new java.util.Date().getTime());
        Date dateEnd = new Date(new SimpleDateFormat("dd-MM-yyyy").parse("23-05-2006").getTime()) ;
        List<HealthInsuranceCard> result = healthInsuranceCardRepository.reportComplete0(dateEnd,currentDate);
        List<HealthInsuranceCard> expected =  ListCustomer.getComplete0();

        assertEquals(result.size(), ListCustomer.getComplete0().size());
        for(int i = 0; i< result.size();i++){
            assertNotNull(expected.get(i));
            assertEquals(result.get(i), expected.get(i));
        }
    }

    @Test
    void reportComplete1() throws ParseException{
        Date currentDate = new Date(new java.util.Date().getTime());
        Date dateEnd = new Date(new SimpleDateFormat("dd-MM-yyyy").parse("23-05-2005").getTime()) ;
        List<HealthInsuranceCard> result = healthInsuranceCardRepository.reportComplete1("Thành phố Hà Nội",dateEnd,currentDate);
        List<HealthInsuranceCard> expected =  ListCustomer.getComplete1();

        assertEquals(result.size(), ListCustomer.getComplete1().size());
        for(int i = 0; i< result.size();i++){
            assertNotNull(expected.get(i));
            assertEquals(result.get(i), expected.get(i));
        }
    }

    @Test
    void reportComplete2() throws ParseException {
        Date currentDate = new Date(new java.util.Date().getTime());
        Date dateEnd = new Date(new SimpleDateFormat("dd-MM-yyyy").parse("23-05-2005").getTime()) ;
        List<HealthInsuranceCard> result = healthInsuranceCardRepository.reportComplete2("Thành phố Hà Nội",
                "Quận Đống Đa",
                dateEnd,currentDate);
        List<HealthInsuranceCard> expected =  ListCustomer.getComplete1();

        assertEquals(result.size(), ListCustomer.getComplete1().size());
        for(int i = 0; i< result.size();i++){
            assertNotNull(expected.get(i));
            assertEquals(result.get(i), expected.get(i));
        }
    }

    @Test
    void reportComplete3() throws ParseException {
        Date currentDate = new Date(new java.util.Date().getTime());
        Date dateEnd = new Date(new SimpleDateFormat("dd-MM-yyyy").parse("23-05-2005").getTime()) ;
        List<HealthInsuranceCard> result = healthInsuranceCardRepository.reportComplete3("Thành phố Hà Nội",
                "Quận Đống Đa", "Phường Thái Thịnh",
                dateEnd,currentDate);
        List<HealthInsuranceCard> expected =  ListCustomer.getComplete1();

        assertEquals(result.size(), ListCustomer.getComplete1().size());
        for(int i = 0; i< result.size();i++){
            assertNotNull(expected.get(i));
            assertEquals(result.get(i), expected.get(i));
        }
    }

    @Test
    void reportNotComplete0() throws ParseException {
        Date currentDate = new Date(new java.util.Date().getTime());
        Date dateEnd = new Date(new SimpleDateFormat("dd-MM-yyyy").parse("23-05-2006").getTime()) ;
        List<HealthInsuranceCard> result = healthInsuranceCardRepository.reportNotComplete0(dateEnd,currentDate);
        List<HealthInsuranceCard> expected =  ListCustomer.getComplete0();

        assertEquals(result.size(), ListCustomer.getComplete0().size());
        for(int i = 0; i< result.size();i++){
            assertNotNull(expected.get(i));
            assertEquals(result.get(i), expected.get(i));
        }
    }

    @Test
    void reportNotComplete1() throws ParseException {
        Date currentDate = new Date(new java.util.Date().getTime());
        Date dateEnd = new Date(new SimpleDateFormat("dd-MM-yyyy").parse("23-05-2006").getTime()) ;
        List<HealthInsuranceCard> result = healthInsuranceCardRepository.reportNotComplete1("Thành phố Hà Nội",dateEnd,currentDate);
        List<HealthInsuranceCard> expected =  ListCustomer.getComplete0();

        assertEquals(result.size(), ListCustomer.getComplete0().size());
        for(int i = 0; i< result.size();i++){
            assertNotNull(expected.get(i));
            assertEquals(result.get(i), expected.get(i));
        }
    }

    @Test
    void reportNotComplete2() throws ParseException{
        Date currentDate = new Date(new java.util.Date().getTime());
        Date dateEnd = new Date(new SimpleDateFormat("dd-MM-yyyy").parse("23-05-2005").getTime()) ;
        List<HealthInsuranceCard> result = healthInsuranceCardRepository.reportNotComplete2("Thành phố Hà Nội",
                "Quận Đống Đa",
                dateEnd,currentDate);
        List<HealthInsuranceCard> expected =  ListCustomer.getComplete1();

        assertEquals(result.size(), ListCustomer.getComplete1().size());
        for(int i = 0; i< result.size();i++){
            assertNotNull(expected.get(i));
            assertEquals(result.get(i), expected.get(i));
        }
    }

    @Test
    void reportNotComplete3() throws ParseException {
        Date currentDate = new Date(new java.util.Date().getTime());
        Date dateEnd = new Date(new SimpleDateFormat("dd-MM-yyyy").parse("23-05-2005").getTime()) ;
        List<HealthInsuranceCard> result = healthInsuranceCardRepository.reportNotComplete3("Thành phố Hà Nội",
                "Quận Đống Đa", "Phường Thái Thịnh",
                dateEnd,currentDate);
        List<HealthInsuranceCard> expected =  ListCustomer.getComplete1();

        assertEquals(result.size(), ListCustomer.getComplete1().size());
        for(int i = 0; i< result.size();i++){
            assertNotNull(expected.get(i));
            assertEquals(result.get(i), expected.get(i));
        }
    }

    @Test
    void getAll0() throws ParseException {
        Date currentDate = new Date(new java.util.Date().getTime());
        Date dateEnd = new Date(new SimpleDateFormat("dd-MM-yyyy").parse("23-05-2006").getTime()) ;
        List<HealthInsuranceCard> result = healthInsuranceCardRepository.getAll0(dateEnd,currentDate);
        List<HealthInsuranceCard> expected =  ListCustomer.getComplete0();

        assertEquals(result.size(), ListCustomer.getComplete0().size());
        for(int i = 0; i< result.size();i++){
            assertNotNull(expected.get(i));
            assertEquals(result.get(i), expected.get(i));
        }
    }

    @Test
    void getAll1() throws ParseException {
        Date currentDate = new Date(new java.util.Date().getTime());
        Date dateEnd = new Date(new SimpleDateFormat("dd-MM-yyyy").parse("23-05-2006").getTime()) ;
        List<HealthInsuranceCard> result = healthInsuranceCardRepository.getAll1("Thành phố Hà Nội",dateEnd,currentDate);
        List<HealthInsuranceCard> expected =  ListCustomer.getComplete0();

        assertEquals(result.size(), ListCustomer.getComplete0().size());
        for(int i = 0; i< result.size();i++){
            assertNotNull(expected.get(i));
            assertEquals(result.get(i), expected.get(i));
        }
    }

    @Test
    void getAll2() throws ParseException {
        Date currentDate = new Date(new java.util.Date().getTime());
        Date dateEnd = new Date(new SimpleDateFormat("dd-MM-yyyy").parse("23-05-2005").getTime()) ;
        List<HealthInsuranceCard> result = healthInsuranceCardRepository.getAll2("Thành phố Hà Nội",
                "Quận Đống Đa",
                dateEnd,currentDate);
        List<HealthInsuranceCard> expected =  ListCustomer.getComplete1();

        assertEquals(result.size(), ListCustomer.getComplete1().size());
        for(int i = 0; i< result.size();i++){
            assertNotNull(expected.get(i));
            assertEquals(result.get(i), expected.get(i));
        }
    }

    @Test
    void getAll3() throws ParseException {
        Date currentDate = new Date(new java.util.Date().getTime());
        Date dateEnd = new Date(new SimpleDateFormat("dd-MM-yyyy").parse("23-05-2005").getTime()) ;
        List<HealthInsuranceCard> result = healthInsuranceCardRepository.getAll3("Thành phố Hà Nội",
                "Quận Đống Đa", "Phường Thái Thịnh",
                dateEnd,currentDate);
        List<HealthInsuranceCard> expected =  ListCustomer.getComplete1();

        assertEquals(result.size(), ListCustomer.getComplete1().size());
        for(int i = 0; i< result.size();i++){
            assertNotNull(expected.get(i));
            assertEquals(result.get(i), expected.get(i));
        }
    }
    */

}