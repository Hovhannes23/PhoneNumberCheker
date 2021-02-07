package phone.number.cheker.demo.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @AfterReturning ("execution (public String checkTelNum (..))")
    public void afterReturningMainPageAdvice(JoinPoint jp){

        System.out.println("afterReturningMainPageAdvice worked");

    }
}
