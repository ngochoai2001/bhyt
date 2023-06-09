package bhyt.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HIReportRequest {
    private String province;
    private String district;
    private Integer startYear  ;
    private Integer endYear ;

}
