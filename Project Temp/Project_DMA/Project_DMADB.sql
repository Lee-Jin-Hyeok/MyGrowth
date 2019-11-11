DROP DATABASE dma;
CREATE DATABASE dma;
use dma

CREATE TABLE user(
    id VARCHAR(24) NOT NULL,
    pw VARCHAR(24) NOT NULL,
    name VARCHAR(12) NOT NULL,
    auth INT(11) NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE club(
    id INT(11) NOT NULL AUTO_INCREMENT,
    name VARCHAR(12) NOT NULL,
    floor INT(11) NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE student(
    id INT(11) NOT NULL AUTO_INCREMENT,
    grade INT(11) NOT NULL,
    class INT(11) NOT NULL,
    num INT(11) NOT NULL,
    name VARCHAR(12) NOT NULL,
    club_id INT(11) NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE checked(
    std_id INT(11) NOT NULL,
    timeline TIMESTAMP DEFAULT NOW(),
    status1 TINYINT(2) DEFAULT 0,
    status2 TINYINT(2) DEFAULT 0,
    status3 TINYINT(2) DEFAULT 0
);

ALTER TABLE student ADD FOREIGN KEY(club_id) REFERENCES club(id);
ALTER TABLE checked ADD FOREIGN KEY(std_id) REFERENCES student(id);
ALTER TABLE checked ADD FOREIGN KEY(his_date) REFERENCES history(his_date);