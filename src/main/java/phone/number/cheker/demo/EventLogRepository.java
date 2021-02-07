package phone.number.cheker.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventLogRepository extends JpaRepository<EventLog,String> {

    @Override
    <S extends EventLog> S save(S s);
}
