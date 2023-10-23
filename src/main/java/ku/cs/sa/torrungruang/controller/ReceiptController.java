package ku.cs.sa.torrungruang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/receipt")
public class ReceiptController {
    @GetMapping
    public String getPurchaseOrderPage(Model model) {
        model.addAttribute("greeting", "Hello");
        // ต้องคืนค่าเป็นชื่อไฟล์ html template โดยในเมธอดนี้ คืนค่าเป็น home.html
        return "receipt";
    }
    
}


