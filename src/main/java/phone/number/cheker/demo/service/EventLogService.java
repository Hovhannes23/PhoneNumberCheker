package phone.number.cheker.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import phone.number.cheker.demo.entity.EventLog;
import phone.number.cheker.demo.repository.EventLogRepository;

@Service
public class EventLogService {

    EventLogRepository repo;

    @Autowired
    public EventLogService(EventLogRepository repo) {
        this.repo = repo;
    }

    public void  save(EventLog eventLog){
        repo.save(eventLog);
    }

    public EventLog getById(Long id){
        return repo.getOne(id);
    }
}
