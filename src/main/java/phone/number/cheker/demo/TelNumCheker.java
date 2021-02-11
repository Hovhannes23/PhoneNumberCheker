package phone.number.cheker.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import phone.number.cheker.demo.service.AService;
import phone.number.cheker.demo.service.BService;

import java.util.AbstractSequentialList;


/** This class checks in which tables tel_num exists and returns state */
@Component
public class TelNumCheker {

    AService aService;
    BService bService;

    @Autowired
    public TelNumCheker(AService aService, BService bService) {
        this.aService = aService;
        this.bService = bService;
    }

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
