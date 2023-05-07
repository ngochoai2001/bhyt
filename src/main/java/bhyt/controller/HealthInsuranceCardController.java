package bhyt.controller;

import bhyt.dto.HICardRequest;
import bhyt.dto.HIReportRequest;
import bhyt.dto.HiReportBillRequest;
import bhyt.service.HealthInsuranceCardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HealthInsuranceCardController {
    private HealthInsuranceCardService healthInsuranceCardService;

    public HealthInsuranceCardController(HealthInsuranceCardService healthInsuranceCardService) {
        super();
        this.healthInsuranceCardService = healthInsuranceCardService;
    }


    @PostMapping("/hicard/home/report/reportbyyear/result")
    public String listCustomersYear(@ModelAttribute("request") HIReportRequest request, Model model) {
        model.addAttribute("listCustomersYear", healthInsuranceCardService.getReportByYear(request));
    return "report_by_year_result";
    }
    @GetMapping("/hicard/home/report/reportbyyear")
    public String reportByYear(Model model) {
        HIReportRequest request = new HIReportRequest();
        model.addAttribute("request", request);
        return "report_by_year";
    }
//    @GetMapping("/customers")
//    public String index() {
//        return "index";
//    }
    @GetMapping("/hicard/home")
    public String home() {
        return "home";
    }
//    @GetMapping("/hicard/home/report")
//    public String report() { return "report"; }

    @PostMapping("/hicard/home/report/reportcomplete/result")
    public String listCustomersComplete(@ModelAttribute("data") HiReportBillRequest request, Model model) {
        model.addAttribute("listCustomersComplete", healthInsuranceCardService.getReportCompleteFee(request));
        return "report_complete_result";
    }
    @GetMapping("/hicard/home/report/reportcomplete")
    public String reportComplete(Model model) {
        HiReportBillRequest request = new HiReportBillRequest();
        model.addAttribute("data", request);
        return "report_complete";
    }

    @PostMapping("/hicard/home/report/reportnotcomplete/result")
    public String listCustomersNotComplete(@ModelAttribute("data") HiReportBillRequest request, Model model) {
        model.addAttribute("listCustomersNotComplete", healthInsuranceCardService.getReportNotCompleteFee(request));
        return "report_not_complete_result";
    }
    @GetMapping("/hicard/home/report/reportnotcomplete")
    public String reportNotComplete(Model model) {
        HiReportBillRequest request = new HiReportBillRequest();
        model.addAttribute("data", request);
        return "report_not_complete";
    }
    @PostMapping("/hicard/home/viewlist/result")
    public String listCustomers(@ModelAttribute("request") HICardRequest request, Model model) {
        model.addAttribute("listHICard", healthInsuranceCardService.getAllHiCard(request));
        return "listhicardresult";
    }
    @GetMapping("/hicard/home/viewlist")
    public String viewlist(Model model) {
        HICardRequest request = new HICardRequest();
        model.addAttribute("request", request);
        return "listhicard";
    }

}
