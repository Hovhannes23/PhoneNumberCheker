package phone.number.cheker.demo;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table(name ="A")
public class A {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tel_num")
    private String id;

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
