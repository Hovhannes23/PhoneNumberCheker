package phone.number.cheker.demo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.Serializable;
import java.net.URI;

/**
 * Object of this class is returned as a result of telephone number check
 */
@Component
@Data
public class ResponseStatus implements Serializable {


    TelNumStatus status;

}
