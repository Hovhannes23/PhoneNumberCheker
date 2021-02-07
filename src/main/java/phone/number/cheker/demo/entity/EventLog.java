package phone.number.cheker.demo.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

/** This class is an entity of table EVENT_LOG  */
@Entity
@Table(name = "event_log")
public class EventLog {

    /** Use column tel_num as id */
    @Id
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

    @Override
    public String toString() {
        return "EventLog{" +
                "telNum='" + telNum + '\'' +
                ", eventDate=" + eventDate +
                ", decision='" + decision + '\'' +
                '}';
    }
}
