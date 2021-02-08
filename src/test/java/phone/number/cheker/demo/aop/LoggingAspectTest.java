package phone.number.cheker.demo.aop;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import phone.number.cheker.demo.TestConfig;
import phone.number.cheker.demo.entity.EventLog;
import phone.number.cheker.demo.service.EventLogService;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@EnableAutoConfiguration
@SpringBootTest(classes = TestConfig.class)
@Transactional
public class LoggingAspectTest {

    @Autowired
    EventLogService service;

    @Test
    public void afterReturningMainPageAdvice() {

        String telNum = "79260595365";
        LocalDateTime localDateTime = LocalDateTime.of(2017,12,2,15, 5);
        String decision = "CHALLENGE";

        EventLog expected = new EventLog(telNum,localDateTime,decision);

        service.save(expected);
        EventLog actual = service.getById(telNum);

        System.out.println(expected);
        System.out.println(actual);

        Assert.assertEquals(expected,actual);




    }

}