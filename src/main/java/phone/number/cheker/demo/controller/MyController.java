package phone.number.cheker.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import phone.number.cheker.demo.TelNumCheker;

@Controller
public class MyController {

    @Autowired
    TelNumCheker telNumCheker;

    @RequestMapping("/")
    public String mainPage() {
        return "mainPage";
    }

    @RequestMapping("/checkTelNum")
    public String checkTelNum(@RequestParam String telNum, Model model){
      String status =  telNumCheker.checkTelNum(telNum);
       model.addAttribute("status", status);
       model.addAttribute("telNum", telNum);
       return "checkPage";
    }




}
