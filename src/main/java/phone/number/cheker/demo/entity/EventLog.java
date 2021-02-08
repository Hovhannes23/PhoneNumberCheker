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
        int result = 17;
        result = 31 * result + telNum.hashCode();
        result = 31 * result + eventDate.hashCode();
        result = 31 * result + decision.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof EventLog)) {
            return false;
        }

        EventLog eventLog = (EventLog) o;

        return eventLog.telNum.equals(telNum) &&
                eventLog.eventDate.equals(eventDate) &&
                eventLog.decision.equals(decision);
    }
}
