package phone.number.cheker.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import phone.number.cheker.demo.repository.TelNumRepository;

@Service
public class TelNumService {

   private TelNumRepository repo;

   @Autowired
    public TelNumService(TelNumRepository telNumRepository){
       this.repo = telNumRepository;
   }

    public long getCountOfTelNum(String telNum)
    {
      return repo.countById(telNum);
    }
}
