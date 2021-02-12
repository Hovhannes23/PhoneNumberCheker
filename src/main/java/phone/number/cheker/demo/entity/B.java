package phone.number.cheker.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

/** This class is an entity of table B  */
@Entity
@Table(name ="B")
@Data
public class B {

    /** Use column tel_num as id */
    @Id
    @Column(name = "tel_num")
    private String id;

    /** When tel_num was added  */
    @Column(name = "add_date")
    private LocalDateTime addDate;

}
