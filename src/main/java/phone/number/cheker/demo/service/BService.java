package phone.number.cheker.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import phone.number.cheker.demo.repository.BRepository;

@Service
public class BService {

    BRepository repo;

    @Autowired
    public BService(BRepository repo) {
        this.repo = repo;
    }

    public BService() {
    }

    public boolean existsById(String s){
        return repo.existsById(s);
    }
}
