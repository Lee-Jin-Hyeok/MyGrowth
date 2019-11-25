DROP DATABASE ddamaminsns;
CREATE DATABASE ddamaminsns;
USE ddamaminsns

CREATE TABLE user(
    u_id VARCHAR(16) NOT NULL,
    u_pw VARCHAR(16) NOT NULL,
    u_name VARCHAR(10) NOT NULL,
    u_email VARCHAR(52) NOT NULL,
    PRIMARY KEY(u_id)
);

CREATE TABLE post(
    p_id INT(11) UNSIGNED AUTO_INCREMENT NOT NULL,
    p_title VARCHAR(32) NOT NULL,
    p_content VARCHAR(512) NOT NULL,
    p_date DATETIME NOT NULL,
    PRIMARY KEY(p_id),
    u_id VARCHAR(16) NOT NULL
);

CREATE TABLE comment(
    c_id INT(11) UNSIGNED AUTO_INCREMENT NOT NULL,
    c_content VARCHAR(100) NOT NULL,
    c_date DATETIME NOT NULL,
    PRIMARY KEY(c_id),
    u_id VARCHAR(16) NOT NULL,
    p_id INT(11) UNSIGNED NOT NULL
);

CREATE TABLE user_post_like(
    u_id VARCHAR(16) NOT NULL,
    p_id INT(11) UNSIGNED NOT NULL,
    status INT(11) NOT NULL
);

ALTER TABLE post ADD CONSTRAINT fk_post_u_id FOREIGN KEY(u_id) REFERENCES user(u_id);
ALTER TABLE comment ADD CONSTRAINT fk_comment_u_id FOREIGN KEY(u_id) REFERENCES user(u_id);
ALTER TABLE comment ADD CONSTRAINT fk_comment_p_id FOREIGN KEY(p_id) REFERENCES post(p_id);

ALTER TABLE user_post_like ADD CONSTRAINT fk_user_post_like_u_id FOREIGN KEY(u_id) REFERENCES user(u_id);
ALTER TABLE user_post_like ADD CONSTRAINT fk_user_post_like_p_id FOREIGN KEY(p_id) REFERENCES post(p_id);
ALTER TABLE user_post_like ADD PRIMARY KEY(u_id, p_id);