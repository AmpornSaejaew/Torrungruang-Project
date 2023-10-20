package ku.cs.sa.torrungruang.controller;

import ku.cs.sa.torrungruang.entity.Employee;
import ku.cs.sa.torrungruang.service.SignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


@Controller
public class SignupController {
    @Autowired
    private SignupService signupService;

    @GetMapping("/signup")
    public String getSignupPage() {
        return "signup"; // return signup.html form
    }

    @PostMapping("/signup")
    public String signupUser(@ModelAttribute Employee user, Model model) {

        if (signupService.isUsernameAvailable(user.getUsername())) {
            signupService.createUser(user);
            model.addAttribute("signupSuccess", true);
        } else {
            model.addAttribute("signupError", "Username not available");
        }
        // return signup.html too but with messages
        return "signup";
    }

}
