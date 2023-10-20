package ku.cs.sa.torrungruang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping("/test/header")
    public String getHeader(Model model) {
        return "/fragments/header";
    }
    @RequestMapping("/test/layout")
    public String getMainLayout(Model model) {
        return "/layouts/main-layout";
    }
}
