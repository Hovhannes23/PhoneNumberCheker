package phone.number.cheker.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TelNumRepositoryB extends JpaRepository<B,String> {

    @Override
    boolean existsById(String s);
}
