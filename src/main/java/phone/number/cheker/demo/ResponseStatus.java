package phone.number.cheker.demo;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Object of this class is returned as a result of telephone number check
 */
@Component
@Data
public class ResponseStatus implements Serializable {

    TelNumStatus status;

}
