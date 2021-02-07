package phone.number.cheker.demo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "event_log")
public class EventLog {

    @Id
    @Column(name = "tel_num")
    private String telNum;

    @Column(name = "event_date")
    private LocalDateTime eventDate;

    @Column(name = "decision")
     private  String decision;


    public EventLog() {
    }

    public EventLog(String telNum, LocalDateTime eventDate, String decision) {
        this.telNum = telNum;
        this.eventDate = eventDate;
        this.decision = decision;
    }
}
