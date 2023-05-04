package bhyt.model.admin;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity

public class UserAccount {
    @Id
    String username;
    private String password;
}