package phone.number.cheker.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TelNumService {


    TelNumRepository repo;

    @Autowired
    public TelNumService(TelNumRepository repo){
        this.repo = repo;
    }

    public TelNumService() {
    }

    public boolean existsById(String s){
        return repo.existsById(s);
    }
}
