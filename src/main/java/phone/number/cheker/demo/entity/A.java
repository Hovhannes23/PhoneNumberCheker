package phone.number.cheker.demo.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

/** This class is an entity of table A  */
@Entity
@Table(name ="A")
public class A {

    /** Use column tel_num as id */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tel_num")
    private String id;

    /** When tel_num was added  */
    @Column(name = "add_date")
    private LocalDateTime addDate;


    public A() {
    }

    public A(String telNum){
        this.id = telNum;
        this.addDate = LocalDateTime.now();
    }

    public String getTelNum() {
        return id;
    }

    public void setTelNum(String telNum) {
        this.id = telNum;
    }

    public LocalDateTime getAddDate() {
        return addDate;
    }

    public void setAddDate(LocalDateTime addDate) {
        this.addDate = addDate;
    }
}
