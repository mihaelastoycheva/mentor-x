CREATE TABLE mentors (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  name varchar(100) NOT NULL,
  city varchar(50) NOT NULL,
  grade int(50) DEFAULT NULL,
  school varchar(50) DEFAULT NULL,
  subject varchar(50) DEFAULT NULL,
  email varchar(50) DEFAULT NULL,
  bio varchar(50) DEFAULT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY UK_name (name)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE students (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  name varchar(100) NOT NULL,
  city varchar(50) NOT NULL,
  grade int(50) DEFAULT NULL,
  school varchar(50) DEFAULT NULL,
  subject varchar(50) DEFAULT NULL,
  email varchar(50) DEFAULT NULL,
  bio varchar(50) DEFAULT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY UK_name (name)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;