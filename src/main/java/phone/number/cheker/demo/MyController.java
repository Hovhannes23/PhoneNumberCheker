package phone.number.cheker.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @Autowired
    TelNumService service;

    @Autowired
    TelNumServiceB serviceB;

    @RequestMapping("/")
    public String mainPage(Model model){
        String status="";
       if(service.existsById("79155241474")&& serviceB.existsById("79155241474"))
          status="DECLINE";
       else if(service.existsById("79155241474")||serviceB.existsById("79155241474"))
          status="CHALLENGE";
       else status="ACCEPT";

       model.addAttribute("status", status);
       return "index";
    }
}
