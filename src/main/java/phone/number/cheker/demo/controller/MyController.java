package phone.number.cheker.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import phone.number.cheker.demo.TelNumCheker;
import phone.number.cheker.demo.ResponseStatus;
import phone.number.cheker.demo.TelNumStatus;


@RestController
public class MyController {


    TelNumCheker telNumCheker;

    @Autowired
    public MyController(TelNumCheker telNumCheker) {
        this.telNumCheker = telNumCheker;
    }

    @RequestMapping("/")
    public String mainPage() {
        return "mainPage";
    }

//    @RequestMapping("/checkTelNum")
//    public String checkTelNum(@RequestParam String telNum, Model model){
//      String status =  telNumCheker.checkTelNum(telNum);
//       model.addAttribute("status", status);
//       model.addAttribute("telNum", telNum);
//       return "checkPage";
//    }

    @RequestMapping("/checkTelNum")
    public ResponseStatus checkTelNum(@RequestParam String telNum, Model model){
        TelNumStatus status =  telNumCheker.checkTelNum(telNum);
        ResponseStatus responseStatus = new ResponseStatus();
        responseStatus.setStatus(status);

        System.out.println(responseStatus);
        return responseStatus;


    }

}
