package phone.number.cheker.demo.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import phone.number.cheker.demo.TestConfig;

@RunWith(SpringRunner.class)
@EnableAutoConfiguration
@SpringBootTest(classes = TestConfig.class)
public class BServiceTest {

    @Autowired
    BService serviceB;


    @Test
    public  void existsById(){

        boolean exists = serviceB.existsById("79256548525");
        boolean exists2 = serviceB.existsById("79258500212");

        Assert.assertTrue(exists);
        Assert.assertFalse(exists2);
    }


}