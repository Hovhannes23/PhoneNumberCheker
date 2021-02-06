package phone.number.cheker.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TelNumRepository extends JpaRepository<A, String> {

    @Override
    boolean existsById(String s);
}
