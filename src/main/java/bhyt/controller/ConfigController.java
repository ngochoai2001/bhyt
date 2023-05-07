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
        configService.updateConfig(config);
        return "config";
    }
    @GetMapping("/test")
    public String test(){
        return "list";
    }

}
