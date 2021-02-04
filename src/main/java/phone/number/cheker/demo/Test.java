package phone.number.cheker.demo;

import org.hibernate.SessionFactory;

public class Test {

    String telNum = "79260595365";

    SELECT EXISTS(SELECT tel_num FROM A WHERE tel_num = telNum limit 1); // return 1 if exists, and 0 if doesn`t exist


   Create table A (
           tel_num VARCHAR(11) NOT NULL PRIMARY KEY
           add_date TIMESTAMP
    )

    INSERT INTO A (tel_num, add_date) VALUES
    ('79260595365', "2019-05-03 11:55:36");


   Create table EVENT_LOG (
           tel_num VARCHAR(11) NOT NULL PRIMARY KEY,
           event_date   TIMESTAMP,
           decision VARCHAR(20)
   );
}
