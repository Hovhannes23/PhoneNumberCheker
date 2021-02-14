package phone.number.cheker.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

/** This class is an entity of table A  */
@Entity
@Table(name ="A")
@Data
public class A extends TelNum {

}
