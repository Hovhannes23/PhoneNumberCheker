package phone.number.cheker.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventLogService {

    @Autowired
    EventLogRepository repo;

    public void  save(EventLog eventLog){
        repo.save(eventLog);
    }
}
