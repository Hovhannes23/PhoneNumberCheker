package phone.number.cheker.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import phone.number.cheker.demo.service.AService;
import phone.number.cheker.demo.service.BService;

@Component
public class TelNumCheker {

    @Autowired
    AService aService;

    @Autowired

    BService bService
            ;

    public String checkTelNum(String telNum) {
        String status = "";
        if (aService.existsById(telNum) && bService.existsById(telNum))
            status = "DECLINE";
        else if (aService.existsById(telNum) || bService.existsById(telNum))
            status = "CHALLENGE";
        else status = "ACCEPT";

        return status;
    }
}
