package phone.number.cheker.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import phone.number.cheker.demo.repository.ARepository;

@Service
public class AService {


    @Autowired
    ARepository repo;

    public AService() {
    }

    public boolean existsById(String s){
        return repo.existsById(s);
    }
}
