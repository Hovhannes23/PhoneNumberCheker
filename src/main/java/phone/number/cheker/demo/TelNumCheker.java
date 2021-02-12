package phone.number.cheker.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import phone.number.cheker.demo.service.AService;
import phone.number.cheker.demo.service.BService;

import java.util.AbstractSequentialList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


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
    public TelNumStatus checkTelNum(String telNum) throws Exception {

     Pattern pattern = Pattern.compile("^7\\d{10}$");
     Matcher matcher = pattern.matcher(telNum);

     if(!matcher.matches())
         throw new Exception("Введите номер телефона в формате 71234567890");

        TelNumStatus telNumStatus = TelNumStatus.ACCEPT;

        if (aService.existsById(telNum) && bService.existsById(telNum))
            telNumStatus = telNumStatus.DECLINE;
        else if (aService.existsById(telNum) || bService.existsById(telNum))
            telNumStatus = telNumStatus.CHALLENGE;

        return telNumStatus;
    }
}
