package phone.number.cheker.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.Serializable;
import java.net.URI;


@Component
public class ResponseStatus implements Serializable {


    TelNumStatus status;


    public ResponseStatus( ) {
    }

    public TelNumStatus getStatus()
    {
        return status;
    }

    public void setStatus(TelNumStatus status) {

        this.status = status;
    }

    @Override
    public String toString() {
        return "Response{" +
                "status='" + status + '\'' +
                '}';
    }


}
