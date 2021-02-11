package phone.number.cheker.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import phone.number.cheker.demo.repository.ARepository;

@Service
public class AService {

    ARepository repo;

    @Autowired
    public AService(ARepository repo) {
        this.repo = repo;
    }

    public boolean existsById(String s){
        return repo.existsById(s);
    }
}
