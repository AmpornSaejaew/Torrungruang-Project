package ku.cs.sa.torrungruang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String getHomePage(Model model) {
        model.addAttribute("greeting", "This is a home page idk what to do with it");
        return "home";
    }
    @RequestMapping("/test/header")
    public String getHeader(Model model) {
        model.addAttribute("greeting", "This is a home page idk what to do with it");
        return "/fragments/header";
    }
    @RequestMapping("/test/layout")
    public String getMainLayout(Model model) {
        model.addAttribute("greeting", "This is a home page idk what to do with it");
        return "/layouts/mainLayout";
    }
}
