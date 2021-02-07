package phone.number.cheker.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import phone.number.cheker.demo.repository.TelNumRepositoryB;

@Service
public class TelNumServiceB {

    TelNumRepositoryB repo;

    @Autowired
    public TelNumServiceB(TelNumRepositoryB repo){
        this.repo = repo;
    }

    public TelNumServiceB() {
    }

    public boolean existsById(String s){
        return repo.existsById(s);
    }
}
