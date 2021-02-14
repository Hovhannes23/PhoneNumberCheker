package phone.number.cheker.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import phone.number.cheker.demo.entity.TelNum;

@Repository
public interface TelNumRepository extends JpaRepository<TelNum,String> {

    /**
     * this method counts telNum from union table
     * @param telNum is id
     * @return count of telNums in union table
     */
    long countById(String telNum);

}
