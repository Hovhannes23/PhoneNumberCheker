package phone.number.cheker.demo;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import phone.number.cheker.demo.service.AService;

@Component
public class AServiceTest {

    @Autowired
    AService service;

    @Test
    public  void existsById(){

       boolean exists = service.existsById("79260595387");
        boolean exists2 = service.existsById("79260595365");

        Assert.assertTrue(exists);
        Assert.assertFalse(exists2);
    }


}