package phone.number.cheker.demo;

import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
