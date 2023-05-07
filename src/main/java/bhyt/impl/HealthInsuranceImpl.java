package bhyt.impl;

import bhyt.dto.HICardRequest;
import bhyt.dto.HIReportRequest;
import bhyt.dto.HiReportBillRequest;
import bhyt.model.HealthInsuranceBill;
import bhyt.model.HealthInsuranceCard;
import bhyt.repository.HealthInsuranceCardRepository;
import bhyt.service.HealthInsuranceCardService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HealthInsuranceImpl implements HealthInsuranceCardService {
    private HealthInsuranceCardRepository healthInsuranceCardRepository;

    public HealthInsuranceImpl(HealthInsuranceCardRepository healthInsuranceCardRepository) {
        super();
        this.healthInsuranceCardRepository = healthInsuranceCardRepository;
    }

    @Override
    public List<Object[]> getReportByYear(HIReportRequest request) {
        System.out.println(request.getProvince());
        System.out.println(request.getDistrict());
        System.out.println(request.getStartYear());
        System.out.println(request.getEndYear());
        return healthInsuranceCardRepository.reportByYear(request.getProvince(), request.getDistrict(), request.getStartYear(), request.getEndYear());
    }

    @Override
    public List<HealthInsuranceBill> getReportCompleteFee(HiReportBillRequest request) {
        System.out.println(request.getProvince());
        System.out.println(request.getDistrict());
        if (request.getMonth() > 0 && request.getMonth() < 12 && request.getYear() >= 1992) {
            return healthInsuranceCardRepository.reportCompleteByMonth(request.getProvince(), request.getDistrict(), request.getMonth(), request.getYear());
        }
        return new ArrayList<>();
    }
    @Override
    public List<HealthInsuranceBill> getReportNotCompleteFee(HiReportBillRequest request) {
        System.out.println(request.getProvince());
        System.out.println(request.getDistrict());
        if (request.getMonth() > 0 && request.getMonth() < 12 && request.getYear() >= 1992) {
            return healthInsuranceCardRepository.reportNotCompleteByMonth(request.getProvince(), request.getDistrict(), request.getMonth(), request.getYear());
        }
        return new ArrayList<>();
    }

    public List<HealthInsuranceCard> getAllHiCard(HICardRequest request) {
        System.out.println(request.getProvince());
        System.out.println(request.getDistrict());
        System.out.println(request.getDateStart());
        System.out.println(request.getDateEnd());
            return healthInsuranceCardRepository.getAll(request.getProvince(), request.getDistrict(),request.getDateStart(), request.getDateEnd());
      
    }
}
