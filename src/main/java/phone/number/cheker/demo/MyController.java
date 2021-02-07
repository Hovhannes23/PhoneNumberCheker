package phone.number.cheker.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

    @Autowired
    TelNumService service;

    @Autowired
    TelNumServiceB serviceB;

    @RequestMapping("/")
    public String mainPage() {
        return "mainPage";
    }

    @RequestMapping("/checkTelNum")
    public String checkTelNum(@RequestParam String telNum, Model model){
        String status="";
       if(service.existsById(telNum)&& serviceB.existsById(telNum))
          status="DECLINE";
       else if(service.existsById(telNum)||serviceB.existsById(telNum))
          status="CHALLENGE";
       else status="ACCEPT";

       model.addAttribute("status", status);
       model.addAttribute("telNum", telNum);
       return "checkPage";
    }




}
