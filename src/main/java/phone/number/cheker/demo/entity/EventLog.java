package phone.number.cheker.demo.entity;


import lombok.Data;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

/** This class is an entity of
 *
 */

@Entity
@Table(name = "event_log")
@Data
public class EventLog {

    /** Use column tel_num as id */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "log_id")
    private long logId;

    @Column(name = "tel_num")
    private String telNum;

    /** When tel_num was checked last time */
    @Column(name = "event_date")
    private LocalDateTime eventDate;

    /** decision that was returned in result of last time check */
    @Column(name = "decision")
     private  String decision;


    public EventLog() {
    }

    public EventLog(String telNum, LocalDateTime eventDate, String decision) {
        this.telNum = telNum;
        this.eventDate = eventDate;
        this.decision = decision;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        EventLog eventLog = (EventLog) o;
//        return logId == eventLog.logId &&
//                Objects.equals(getTelNum(), eventLog.getTelNum()) &&
//                Objects.equals(getEventDate(), eventLog.getEventDate()) &&
//                Objects.equals(getDecision(), eventLog.getDecision());
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hashCode(this);
//    }
}
