package bhyt.controller;

import bhyt.model.admin.UserAccount;
import bhyt.repository.UserRepository;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.net.http.HttpResponse;

@Controller
@RequestMapping
public class HomeController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/login")
    public String login(Model model){
        UserAccount u = new UserAccount();
        model.addAttribute("user", u);
        return "login";
    }
    @PostMapping("/login")
    public String authen(@ModelAttribute("user") UserAccount user, Model model, HttpServletResponse response) throws IOException {
        user = (UserAccount) model.getAttribute("user");
        user = user!=null?userRepository.findUserAccountByUsernameAndPassword(user.getUsername(), user.getPassword()):user;
        if(user == null){
            model.addAttribute("result", "Sai thông tin đăng nhập");
            return "login";
        }else{
            response.sendRedirect("/customers/");
            return "";
        }
    }
}
