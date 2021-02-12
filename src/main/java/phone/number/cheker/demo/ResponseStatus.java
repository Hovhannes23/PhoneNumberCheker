package phone.number.cheker.demo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.Serializable;
import java.net.URI;


@Component
@Data
public class ResponseStatus implements Serializable {

    TelNumStatus status;

}
