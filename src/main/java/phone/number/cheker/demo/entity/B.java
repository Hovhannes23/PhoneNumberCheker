package phone.number.cheker.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

/** This class is an entity of table B  */
@Entity
@Table(name ="B")
@Data
public class B extends TelNum {


}
