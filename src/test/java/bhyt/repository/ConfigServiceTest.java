package bhyt.repository;

import bhyt.model.Config;
import bhyt.service.ConfigService;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Transactional
class ConfigServiceTest {
    @Autowired
    ConfigService configService;
    @Test
    @DisplayName("Test config amt, must not be negative ")
    @Rollback
    public void testConfigAmt(){
        Config config = new Config();
        config.setSalary(-1);
        testInvalidateSalary(config);
    }
    public void testInvalidateSalary(Config config){

    }
    @Test
    @DisplayName("Test config amt, must not be negative ")
    @Rollback
    public void testConfigPercent(){
        Config config = new Config();
        config.setSalary(-1);
        testInvalidateSalary(config);
    }
    public void testValidateConfig(Config config){
        Config old = configService.findConfig(1L);
        old.setSalary(config.getSalary());
        old.setWorker(config.getWorker());
        old.setRetirement(config.getRetirement());
        old.setMaternity(config.getMaternity());
        old.setUnemployment(config.getUnemployment());
        old.setOther(config.getOther());
        old.setFamilyOne(config.getFamilyOne());
        old.setFamilyTwo(config.getFamilyTwo());
        old.setFamilyThree(config.getFamilyThree());
        old.setFamilyFour(config.getFamilyFour());
        old.setFamilyFive(config.getFamilyFive());
        old.setPoor(config.getPoor());
        old.setNearPoor(config.getNearPoor());
        old.setStudent(config.getStudent());
        old.setFarmer(config.getFarmer());
        configService.updateConfig(config);
        //
        Config newConfig = configService.findConfig(1L);
        assertEquals(newConfig.getSalary(),config.getSalary());
        assertEquals(newConfig.getWorker(),config.getWorker());
        assertEquals(newConfig.getRetirement(),config.getRetirement());
        assertEquals(newConfig.getMaternity(),config.getMaternity());
        assertEquals(newConfig.getUnemployment(),config.getUnemployment());
        assertEquals(newConfig.getOther(),config.getOther());
        assertEquals(newConfig.getFamilyOne(),config.getFamilyOne());
        assertEquals(newConfig.getFamilyTwo(),config.getFamilyTwo());
        assertEquals(newConfig.getFamilyThree(),config.getFamilyThree());
        assertEquals(newConfig.getFamilyFour(),config.getFamilyFour());
        assertEquals(newConfig.getFamilyFive(),config.getFamilyFive());
        assertEquals(newConfig.getPoor(),config.getPoor());
        assertEquals(newConfig.getNearPoor(),config.getNearPoor());
        assertEquals(newConfig.getStudent(),config.getStudent());
        assertEquals(newConfig.getFarmer(),config.getFarmer());
    }
}