DROP DATABASE dma;
CREATE DATABASE dma;
use dma

CREATE TABLE user (
    user_id VARCHAR(24) NOT NULL,
    user_pw VARCHAR(24) NOT NULL,
    user_name VARCHAR(12) NOT NULL,
    PRIMARY KEY(user_id)
);

CREATE TABLE student (
    std_id INT(11) unsigned NOT NULL,
    std_grade INT(11) NOT NULL,
    std_num INT(11) NOT NULL,
    std_name VARCHAR(12) NOT NULL,
    PRIMARY KEY(std_id)
);

CREATE TABLE club (
    club_id INT(11) unsigned NOT NULL,
    club_name VARCHAR(12) NOT NULL,
    club_floar INT(11) NOT NULL,
    club_posi VARCHAR(24) NOT NULL,
    PRIMARY KEY(club_id)
);

CREATE TABLE user_student_management (
    checked TINYINT(1) DEFAULT 1,
    FOREIGN KEY user_id REFERENCES user(user_id),
    FOREIGN KEY std_id REFERENCES student(std_id)
);