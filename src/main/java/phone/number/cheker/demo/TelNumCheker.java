package phone.number.cheker.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import phone.number.cheker.demo.service.TelNumService;
import phone.number.cheker.demo.service.TelNumServiceB;

@Component
public class TelNumCheker {

    @Autowired
    TelNumService service;

    @Autowired
    TelNumServiceB serviceB;

    public String checkTelNum(String telNum) {
        String status = "";
        if (service.existsById(telNum) && serviceB.existsById(telNum))
            status = "DECLINE";
        else if (service.existsById(telNum) || serviceB.existsById(telNum))
            status = "CHALLENGE";
        else status = "ACCEPT";

        return status;
    }
}
