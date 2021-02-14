package phone.number.cheker.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import phone.number.cheker.demo.entity.A;


@Repository
public interface ARepository extends JpaRepository<A, String> {

    @Override
    boolean existsById(String s);

}
