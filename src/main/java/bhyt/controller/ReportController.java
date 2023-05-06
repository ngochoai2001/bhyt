package bhyt.controller;


import bhyt.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/report")
public class ReportController {
    @Autowired
    ReportService service;


    @GetMapping(value = "demo-report", produces = MediaType.APPLICATION_PDF_VALUE)
    public ResponseEntity<byte[]> getReport() {
        try {
            return new ResponseEntity<byte[]>(service.getReport(), HttpStatus.OK);
        }
        catch(Exception e) {
            e.printStackTrace();
            return new ResponseEntity<byte[]>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
