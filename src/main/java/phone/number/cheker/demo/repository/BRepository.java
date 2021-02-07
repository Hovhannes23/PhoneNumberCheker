package phone.number.cheker.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import phone.number.cheker.demo.entity.B;

@Repository
public interface BRepository extends JpaRepository<B,String> {

    @Override
    boolean existsById(String s);
}
