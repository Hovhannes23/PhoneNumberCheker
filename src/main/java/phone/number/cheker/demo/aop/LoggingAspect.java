package phone.number.cheker.demo.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import phone.number.cheker.demo.EventLog;
import phone.number.cheker.demo.EventLogService;
import org.springframework.ui.Model;

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

        System.out.println("afterReturningMainPageAdvice worked");

    }
}
