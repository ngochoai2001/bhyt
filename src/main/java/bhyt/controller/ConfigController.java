package bhyt.controller;

import bhyt.model.Config;
import bhyt.service.ConfigService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class ConfigController {
    private ConfigService configService;

    public ConfigController(ConfigService configService) {
        this.configService = configService;
    }

    @GetMapping("/hicard/home/config")
    public String editStudentForm( Model model) {
        model.addAttribute("config", configService.findConfig(1L));
        return "config";
    }

    @PostMapping("/hicard/home/config")
    public String updateStudent(@ModelAttribute("config") Config config,
                                Model model) {
        Config old = configService.findConfig(1L);
        old.setSalary(config.getSalary());
        old.setWorker(config.getWorker());
        old.setRetirement(config.getRetirement());
        old.setMaternity(config.getMaternity());
        old.setUnemployment(config.getUnemployment());
        old.setOther(config.getOther());
        old.setFamilyOne(config.getFamilyOne());
        old.setFamilyTwo(config.getFamilyTwo());
        old.setFamilyThree(config.getFamilyThree());
        old.setFamilyFour(config.getFamilyFour());
        old.setFamilyFive(config.getFamilyFive());
        old.setPoor(config.getPoor());
        old.setNearPoor(config.getNearPoor());
        old.setStudent(config.getStudent());
        old.setFarmer(config.getFarmer());
        configService.updateConfig(old);
        return "config";
    }
    @GetMapping("/test")
    public String test(){
        return "list";
    }

}
