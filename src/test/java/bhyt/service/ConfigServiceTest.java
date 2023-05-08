package bhyt.service;

import bhyt.model.Config;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class ConfigServiceTest {
    @Autowired
    ConfigService configService;
    private Config config;
    @BeforeEach
    public void getCloneConfigFromDb(){
        config = new Config();
        Config cfFromFb = configService.findConfig(1L);
        config.setSalary(cfFromFb.getSalary());
        config.setSalary(cfFromFb.getSalary());
        config.setWorker(cfFromFb.getWorker());
        config.setRetirement(cfFromFb.getRetirement());
        config.setMaternity(cfFromFb.getMaternity());
        config.setUnemployment(cfFromFb.getUnemployment());
        config.setOther(cfFromFb.getOther());
        config.setFamilyOne(cfFromFb.getFamilyOne());
        config.setFamilyTwo(cfFromFb.getFamilyTwo());
        config.setFamilyThree(cfFromFb.getFamilyThree());
        config.setFamilyFour(cfFromFb.getFamilyFour());
        config.setFamilyFive(cfFromFb.getFamilyFive());
        config.setPoor(cfFromFb.getPoor());
        config.setNearPoor(cfFromFb.getNearPoor());
        config.setStudent(cfFromFb.getStudent());
        config.setFarmer(cfFromFb.getFarmer());
    }
    @Test
    @DisplayName("Test config salary, must not be negative, config value must be remain after execute function ")
    @Rollback
    public void baseSalaryIsNegative_AfterUpdateFunctionConfigValueMustUnchange(){
        config.setSalary(-1);
        testUnsuccessfullUpdateConfig_ConfigMustUnchange(config);
    }

    @Test
    @DisplayName("Test config salary, must not be zero, config value must be remain after update function ")
    @Rollback
    public void baseSalaryIsZero_AfterUpdateFunctionConfigValueMustUnchange(){
        //create config is the same in database except base salary
        config.setSalary(0);
        testUnsuccessfullUpdateConfig_ConfigMustUnchange(config);
    }
    @Test
    @DisplayName("Test config salary, salary is greater than zero, config value must be updated after update function ")
    @Rollback
    public void baseSalaryGreaterThanZero_AfterUpdateFunctionConfigValueMustUnchange(){
        config.setSalary(1);
        testSuccessfullUpdateConfig(config);
    }
    @Test
    @DisplayName("Test config percent value, must not be negative, config value must be remain after update function ")
    @Rollback
    public void percentValueIsNegative_AfterUpdateFunctionConfigValueMustUnchange(){
        config.setFarmer(-1);
        testUnsuccessfullUpdateConfig_ConfigMustUnchange(config);
    }

    @Test
    @DisplayName("Test config percent value, must not be zero, config value must be remain after update function ")
    @Rollback
    public void percentValueIsZero_AfterUpdateFunctionConfigValueMustUnchange(){
        config.setFarmer(0);
        testUnsuccessfullUpdateConfig_ConfigMustUnchange(config);
    }
    @Test
    @DisplayName("Test config percent value, can be greater than zero, config value must be update after update function ")
    @Rollback
    public void percentValueNearZerp_AfterUpdateFunctionConfigValueMustUnchange(){
        config.setFarmer(1);
        testSuccessfullUpdateConfig(config);
    }


    @Test
    @DisplayName("Test config percent value, can be 100, config value must be update after update function ")
    @Rollback
    public void percentValueIs100_AfterUpdateFunctionConfigValueMustUpdated(){
        config.setFarmer(100);
        testSuccessfullUpdateConfig(config);
    }
    @Test
    @DisplayName("Test config percent value, must not be exceeded 100, config value must be remain after update function ")
    @Rollback
    public void percentValueExceed100_AfterUpdateFunctionConfigValueMustUnchange(){
        config.setFarmer(101);
        testUnsuccessfullUpdateConfig_ConfigMustUnchange(config);
    }

    @Test
    @DisplayName("Test config percent value and amt value concurrently,both is valid," +
            " config value must be update after update function ")
    @Rollback
    public void validPercentValueIsAnd_AfterUpdateFunctionConfigValueMustUpdated(){
        config.setFarmer(100);
        config.setSalary(12343);
        testSuccessfullUpdateConfig(config);
    }
    @Test
    @DisplayName("Test config percent value valid, amt value is invalid, config value must be remain after update function ")
    @Rollback
    public void percentValueValidSalaryInvalid_AfterUpdateFunctionConfigValueMustUnchange(){
        config.setFarmer(100);
        config.setSalary(-1);
        testUnsuccessfullUpdateConfig_ConfigMustUnchange(config);
    }
    @Test
    @DisplayName("Test config percent value invalid, amt value is valid, config value must be remain after update function ")
    @Rollback
    public void percentValueInValidSalaryValid_AfterUpdateFunctionConfigValueMustUnchange(){
        config.setFarmer(101);
        config.setSalary(12344);
        testUnsuccessfullUpdateConfig_ConfigMustUnchange(config);
    }
    @Test
    @DisplayName("Test config percent value valid, amt value is invalid, config value must be remain after update function ")
    @Rollback
    public void bothPercentValueSalaryInValid_AfterUpdateFunctionConfigValueMustUnchange(){
        config.setFarmer(101);
        config.setSalary(-1);
        testUnsuccessfullUpdateConfig_ConfigMustUnchange(config);
    }
    @Test
    @DisplayName("Get config record in database to display config information,value must no be null, exception must not be thrown ")
    @Rollback
    public void findConfigHaveDataInDatebase_ShouldNotBeNull(){
        assertNotNull(configService.findConfig(1L));
        assertDoesNotThrow(()-> configService.findConfig(1L));
    }
    @Test
    @DisplayName("Get config record not in database, exception must be thrown ")
    @Rollback
    public void findConfigNotInDatebase_ExceptionMustBeThrown(){
        assertThrows(NoSuchElementException.class, ()->configService.findConfig(2L));

    }
    public void testSuccessfullUpdateConfig(Config config){

        configService.updateConfig(config);
        // compare new config in data base vs config pass into this function
        Config newConfig = configService.findConfig(1L);
        assertEquals(config.getSalary(),newConfig.getSalary());
        assertEquals(config.getWorker(),newConfig.getWorker());
        assertEquals(config.getRetirement(),newConfig.getRetirement());
        assertEquals(config.getMaternity(),newConfig.getMaternity());
        assertEquals(config.getUnemployment(),newConfig.getUnemployment());
        assertEquals(config.getOther(),newConfig.getOther());
        assertEquals(config.getFamilyOne(),newConfig.getFamilyOne());
        assertEquals(config.getFamilyTwo(),newConfig.getFamilyTwo());
        assertEquals(config.getFamilyThree(),newConfig.getFamilyThree());
        assertEquals(config.getFamilyFour(),newConfig.getFamilyFour());
        assertEquals(config.getFamilyFive(),newConfig.getFamilyFive());
        assertEquals(config.getPoor(),newConfig.getPoor());
        assertEquals(config.getNearPoor(),newConfig.getNearPoor());
        assertEquals(config.getStudent(),newConfig.getStudent());
        assertEquals(config.getFarmer(),newConfig.getFarmer());
    }
    public void   testUnsuccessfullUpdateConfig_ConfigMustUnchange(Config config){
        //config in database must not be updated
        //
        Config newConfig = configService.updateConfig(config);;
        assertNotEquals(config.getSalary(),newConfig.getSalary());
        assertEquals(config.getWorker(),newConfig.getWorker());
        assertEquals(config.getRetirement(),newConfig.getRetirement());
        assertEquals(config.getMaternity(),newConfig.getMaternity());
        assertEquals(config.getUnemployment(),newConfig.getUnemployment());
        assertEquals(config.getOther(),newConfig.getOther());
        assertEquals(config.getFamilyOne(),newConfig.getFamilyOne());
        assertEquals(config.getFamilyTwo(),newConfig.getFamilyTwo());
        assertEquals(config.getFamilyThree(),newConfig.getFamilyThree());
        assertEquals(config.getFamilyFour(),newConfig.getFamilyFour());
        assertEquals(config.getFamilyFive(),newConfig.getFamilyFive());
        assertEquals(config.getPoor(),newConfig.getPoor());
        assertEquals(config.getNearPoor(),newConfig.getNearPoor());
        assertEquals(config.getStudent(),newConfig.getStudent());
        assertEquals(config.getFarmer(),newConfig.getFarmer());
    }

}