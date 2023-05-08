package bhyt.repository;

import bhyt.model.admin.UserAccount;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserRepositoryTest {
    @Autowired
    UserRepository userRepository;

    @Test
    @DisplayName("Test when login all fields are empty")
    void findUserAccountByUsernameAndPassword() {
        String username = "";
        String password= "";
        UserAccount user = userRepository.findUserAccountByUsernameAndPassword(username, password);
        assertEquals(null,user);

    }
    @Test
    @DisplayName("Test when login username field is empty")
    void findUserAccountByPassword() {
        String username = "";
        String password= "admin";
        UserAccount user = userRepository.findUserAccountByUsernameAndPassword(username, password);
        assertEquals(null,user);

    }
    @Test
    @DisplayName("Test when login password field is empty")
    void findUserAccountByUserName() {
        String username = "hoai";
        String password= "";
        UserAccount user = userRepository.findUserAccountByUsernameAndPassword(username, password);
        assertEquals(null,user);

    }
    @Test
    @DisplayName("Test when login attempt failed")
    void findUserAccountByUserNameAndPass_ResultNotFound() {
        String username = "hoai";
        String password= "";
        UserAccount user = userRepository.findUserAccountByUsernameAndPassword(username, password);
        assertEquals(null,user);

    }
    @Test
    @DisplayName("Test when login attempt successful")
    void findUserAccountByUserNameAndPass_ResultFound() {
        String username = "hoai";
        String password= "admin";
        UserAccount user = userRepository.findUserAccountByUsernameAndPassword(username, password);
        assertEquals(new UserAccount(username, password),user);

    }
}