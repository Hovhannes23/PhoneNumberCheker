package phone.number.cheker.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import phone.number.cheker.demo.service.AService;
import phone.number.cheker.demo.service.BService;


/** This class checks in which tables tel_num exists and returns state */
@Component
public class TelNumCheker {

    @Autowired
    AService aService;

    @Autowired

    BService bService
            ;

    /**
     *  Method checks in which tables tel_num exists and returns state
     * @param telNum is the tel_num which existence the method checks
     * @return status - which can be among options: DECLINE, CHALLENGE, ACCEPT
     * */
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
