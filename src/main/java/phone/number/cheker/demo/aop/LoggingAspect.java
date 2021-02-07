package phone.number.cheker.demo.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import phone.number.cheker.demo.entity.EventLog;
import phone.number.cheker.demo.service.EventLogService;

import java.time.LocalDateTime;

@Component
@Aspect
public class LoggingAspect {

    @Autowired
    EventLogService service;

    @AfterReturning ("execution (public String checkTelNum (String,*))")
    public void afterReturningMainPageAdvice(JoinPoint jp){

       Object[] args = jp.getArgs();
       String s = (String) args[0];
       Model model = (Model) args[1];

        LocalDateTime now = LocalDateTime.now();
       String  status = (String) model.getAttribute("status");

        EventLog eventLog = new EventLog(s,now, status);

       service.save(eventLog);


    }
}
