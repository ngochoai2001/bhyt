package bhyt.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HiReportBillRequest {
    private String province;
    private String district;
    private Integer year;
    private Integer month;
}
