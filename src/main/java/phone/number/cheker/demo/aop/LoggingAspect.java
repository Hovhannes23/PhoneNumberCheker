package phone.number.cheker.demo.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import phone.number.cheker.demo.ResponseStatus;
import phone.number.cheker.demo.entity.EventLog;
import phone.number.cheker.demo.service.EventLogService;

import java.time.LocalDateTime;

@Component
@Aspect
public class LoggingAspect {

    EventLogService service;
    ResponseStatus responseStatus;

    @Autowired
    public LoggingAspect( EventLogService service) {
        this.service = service;
    }

    @AfterReturning ("execution (public ResponseStatus checkTelNum (String,*))")
    public void afterReturningMainPageAdvice(JoinPoint jp){

       Object[] args = jp.getArgs();
       String telNum = (String) args[0];
       Model model = (Model) args[1];

       LocalDateTime now = LocalDateTime.now();
       ResponseStatus  responseStatus =  (ResponseStatus) model.getAttribute("status");
        assert responseStatus != null;
        String status = responseStatus.getStatus().name();

       EventLog eventLog = new EventLog(telNum,now,status);

       service.save(eventLog);


    }
}
