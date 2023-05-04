package bhyt.service;

import bhyt.dto.HICardRequest;
import bhyt.dto.HIReportRequest;
import bhyt.dto.HiReportBillRequest;
import bhyt.model.HealthInsuranceBill;
import bhyt.model.HealthInsuranceCard;

import java.util.List;
public interface HealthInsuranceCardService {
    List<Object[]> getReportByYear(HIReportRequest request);
    List<HealthInsuranceBill> getReportCompleteFee(HiReportBillRequest request);
    List<HealthInsuranceBill> getReportNotCompleteFee(HiReportBillRequest request);
    List<HealthInsuranceCard> getAllHiCard(HICardRequest request);

}
