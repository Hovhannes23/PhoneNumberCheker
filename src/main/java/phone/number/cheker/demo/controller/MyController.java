package phone.number.cheker.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import phone.number.cheker.demo.TelNumCheker;
import phone.number.cheker.demo.ResponseStatus;
import phone.number.cheker.demo.TelNumStatus;

import java.nio.channels.ScatteringByteChannel;


@Controller
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


    @RequestMapping("/checkTelNum")
    @ResponseBody
    public ResponseStatus checkTelNum(@RequestParam String telNum, Model model){

        TelNumStatus status = null;

        try {
          status = telNumCheker.checkTelNum(telNum);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        ResponseStatus responseStatus = new ResponseStatus();
        responseStatus.setStatus(status);

        model.addAttribute("status",status);

        System.out.println(responseStatus);
        return responseStatus;


    }

}
