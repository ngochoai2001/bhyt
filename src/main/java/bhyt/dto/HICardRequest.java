package bhyt.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HICardRequest {
    private Date dateStart;
    private Date dateEnd;
    private String province;
    private String district;


}
