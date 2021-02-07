package phone.number.cheker.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import phone.number.cheker.demo.entity.B;

public interface TelNumRepositoryB extends JpaRepository<B,String> {

    @Override
    boolean existsById(String s);
}
