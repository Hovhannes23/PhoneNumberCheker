package phone.number.cheker.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.Column;

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
