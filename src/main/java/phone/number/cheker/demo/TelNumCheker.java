package phone.number.cheker.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import phone.number.cheker.demo.service.TelNumService;


/** This class checks in which tables tel_num exists and returns state */
@Component
public class TelNumCheker {

    TelNumService telNumService;

    @Autowired
    public TelNumCheker(TelNumService telNumService) {
        this.telNumService = telNumService;

    }


    /**
     *  Method counts quantity of telNum in table and returns state
     * @param telNum is the tel_num which existence the method checks
     * @return status - which can be among options: DECLINE, CHALLENGE, ACCEPT
     * */
    public TelNumStatus checkTelNum(String telNum){

     long count = telNumService.getCountOfTelNum(telNum);

       TelNumStatus telNumStatus=TelNumStatus.ACCEPT;

      if(count==1)
          telNumStatus=TelNumStatus.CHALLENGE;

      else if (count==2)
          telNumStatus = TelNumStatus.DECLINE;

      return telNumStatus;
    }

}
