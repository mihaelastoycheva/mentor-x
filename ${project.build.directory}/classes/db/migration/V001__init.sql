CREATE TABLE users (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  username varchar(100) NOT NULL,
  password varchar(50) NOT NULL,
  first_name varchar(50) DEFAULT NULL,
  last_name varchar(50) DEFAULT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY UK_name (username)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;