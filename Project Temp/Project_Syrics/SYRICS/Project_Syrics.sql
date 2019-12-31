DROP DATABASE syrics;
CREATE DATABASE syrics;
USE syrics

-- 여기서 부터 복사

CREATE TABLE object (
    id INT(11) UNSIGNED AUTO_INCREMENT NOT NULL,
    title VARCHAR(100) NOT NULL,
    img VARCHAR(20) NOT NULL,
    singer VARCHAR(20) NOT NULL,
    song_title VARCHAR(40) NOT NULL,
    PRIMARY KEY(id)
);