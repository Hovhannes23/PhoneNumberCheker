package phone.number.cheker.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@EnableAutoConfiguration
@SpringBootTest(classes = TestConfig.class)
public class TelNumChekerTest {

    @Autowired
    TelNumCheker telNumCheker;

    @Test
    public void checkTelNumForCHALLENGE() throws Exception {

        TelNumStatus expectedStatus = TelNumStatus.CHALLENGE;
        String telNum = "79152150563";

        TelNumStatus actualStatus = telNumCheker.checkTelNum(telNum);

        Assert.assertEquals(expectedStatus, actualStatus);

    }

    @Test
    public void checkTelNumForDECLINE() throws Exception {

        TelNumStatus expectedStatus = TelNumStatus.DECLINE;
        String telNum = "79155241474";

        TelNumStatus actualStatus = telNumCheker.checkTelNum(telNum);

        Assert.assertEquals(expectedStatus, actualStatus);

    }

    @Test
    public void checkTelNumForACCEPT() throws Exception {

        TelNumStatus expectedStatus = TelNumStatus.ACCEPT;
        String telNum = "79160585965";

        TelNumStatus actualStatus = telNumCheker.checkTelNum(telNum);

        Assert.assertEquals(expectedStatus, actualStatus);

    }


}