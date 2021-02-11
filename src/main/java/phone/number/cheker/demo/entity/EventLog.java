package phone.number.cheker.demo.entity;


import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

/** This class is an entity of
 *
 */

@Entity
@Table(name = "event_log")
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

    public void setLogId(Long logId){
        this.logId = logId;
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    public LocalDateTime getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDateTime eventDate) {
        this.eventDate = eventDate;
    }

    public String getDecision() {
        return decision;
    }

    public void setDecision(String decision) {
        this.decision = decision;
    }

    @Override
    public String toString() {
        return "EventLog{" +
                "telNum='" + telNum + '\'' +
                ", eventDate=" + eventDate +
                ", decision='" + decision + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
       return Objects.hashCode(this);
    }

    @Override
    public boolean equals(Object o) {
       return Objects.equals(this,(EventLog)o);

    }
}
