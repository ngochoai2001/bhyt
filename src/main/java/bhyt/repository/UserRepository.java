package bhyt.repository;

import bhyt.model.admin.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserAccount, String> {
    public UserAccount findUserAccountByUsernameAndPassword(String username, String password);
}
