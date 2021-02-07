package phone.number.cheker.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import phone.number.cheker.demo.entity.EventLog;

@Repository
public interface EventLogRepository extends JpaRepository<EventLog,String> {

    @Override
    <S extends EventLog> S save(S s);
}
