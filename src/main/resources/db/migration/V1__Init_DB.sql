
CREATE DATABASE IF NOT EXISTS phonenumbercheker;

USE phonenumbercheker;

    drop table if exists a;

    drop table if exists b;

    drop table if exists event_log;

     drop table if exists tel_num;

    create table tel_num (
       tel_num varchar(255) not null,
        add_date datetime(6),
        primary key (tel_num)
    ) engine=InnoDB;

    create table a (
       tel_num varchar(255) not null,
        add_date datetime(6),
        primary key (tel_num)
    ) engine=InnoDB;

    create table b (
       tel_num varchar(255) not null,
        add_date datetime(6),
        primary key (tel_num)
    )engine=InnoDB;


    create table event_log (
       log_id bigint not null auto_increment,
        decision varchar(255),
        event_date datetime(6),
        tel_num varchar(255),
        primary key (log_id)
    )engine=InnoDB;




INSERT INTO a (tel_num, add_date) VALUES
('79260595365', '2019-05-03 11:55:36'),
('79152150563', '2020-10-15 15:35:23'),
('79256548525', '2020-11-23 00:55:28'),
('79260595387', '2020-12-07 21:33:36'),
('79650658521', '2020-12-21 16:02:00'),
('79162333212', '2021-01-05 07:30:21'),
('79155866565', '2021-01-07 12:58:57'),
('79252584141', '2021-01-10 14:23:50'),
('79166542551', '2021-02-02 17:52:20'),
('79155241474', '2021-02-03 20:55:36'),
('79999999999', '2021-02-03 22:15:05')
;


INSERT INTO b (tel_num, add_date) VALUES
('79260595365', '2019-05-03 11:55:36'),
('79256548525', '2020-11-23 00:55:28'),
('79260595387', '2020-12-07 21:33:36'),
('79162332812', '2021-01-05 07:30:21'),
('79155862565', '2021-01-07 12:58:57'),
('79252584141', '2021-01-10 14:23:50'),
('79166542888', '2021-02-02 17:52:20'),
('79155241474', '2021-02-03 20:55:36')
;



