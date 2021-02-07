package phone.number.cheker.demo;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class TelNumServiceTest {

    @Autowired
    TelNumService service;

    @Test
    public  void existsById(){

       boolean exists = service.existsById("79260595387");
        boolean exists2 = service.existsById("79260595365");

        Assert.assertTrue(exists);
        Assert.assertFalse(exists2);
    }


}