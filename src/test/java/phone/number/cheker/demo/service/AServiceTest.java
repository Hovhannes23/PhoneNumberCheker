package phone.number.cheker.demo.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import phone.number.cheker.demo.TestConfig;
import phone.number.cheker.demo.service.AService;
import phone.number.cheker.demo.service.BService;
import phone.number.cheker.demo.service.EventLogService;

@RunWith(SpringRunner.class)
@EnableAutoConfiguration
@SpringBootTest(classes = TestConfig.class)
public class AServiceTest {

    @Autowired
    AService serviceA;


    @Test
    public  void existsById(){

       boolean exists = serviceA.existsById("79260595387");
        boolean exists2 = serviceA.existsById("79260595366");

        Assert.assertTrue(exists);
        Assert.assertFalse(exists2);
    }


}