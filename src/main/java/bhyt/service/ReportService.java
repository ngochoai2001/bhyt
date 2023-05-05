package bhyt.service;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bhyt.repository.HealthInsuranceCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Service
public class ReportService {
    @Autowired
    HealthInsuranceCardRepository healthInsuranceCardRepository;
    public byte[] getReport() throws IOException, JRException {
        // tìm kiếm file report
        JasperReport jasperReport = JasperCompileManager.compileReport(new ClassPathResource("report_by_year.jrxml").getInputStream());
        // đây là list data của mình, thông thường list này sẽ đc query dưới db
        List<Object[]> list = healthInsuranceCardRepository.reportByYear(
                "Thành phố Hà Nội", "Quận Thanh Xuân", 2020,2023
        );

        // khởi tạo data source
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(list);
        // khai báo các parameter
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("START", 2020);
        parameters.put("END", 2023);
        // compile file report cùng các tham số đã khai báo
        return JasperExportManager.exportReportToPdf(JasperFillManager.fillReport(jasperReport, parameters, dataSource));
    }
}

