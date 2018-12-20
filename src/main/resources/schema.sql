DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS user_roles;


CREATE TABLE user_roles (
  user_role_id VARCHAR(100) NOT NULL,
  user_role_name VARCHAR(100) NOT NULL,
  PRIMARY KEY (user_role_id));
  
  
CREATE  TABLE users (
  user_id VARCHAR(100) NOT NULL,
  email_address VARCHAR(100) NOT NULL ,
  first_name VARCHAR(100) NOT NULL ,
  last_name VARCHAR(100) NOT NULL ,
  password VARCHAR(100) NOT NULL ,
  role_id  VARCHAR(100) REFERENCES user_roles(user_role_id) NOT NULL,
  enabled boolean NOT NULL ,
  created DATE NOT NULL, 
  PRIMARY KEY (user_id));

  
INSERT INTO user_roles(user_role_id, user_role_name) VALUES ('6a8e4a82-7226-4eee-9e20-f65ff0f5457b', 'Student');
INSERT INTO user_roles(user_role_id, user_role_name) VALUES ('3bae8425-b47f-48f5-a724-996d695a6df8', 'Teacher');


INSERT INTO users(user_id, email_address, first_name, last_name, password, role_id, enabled, created) VALUES ('832f3a1b-22a9-4bb9-a147-e3f3cb4e98b4', 'mjones3@gmail.com', 'Melvin', 'Jones',
                                                         '$2y$12$2idGkq.eQyEBbrmXF6nL3Of90S4mrtZwfMgv/gBJBjarFbLLTSLuG', '6a8e4a82-7226-4eee-9e20-f65ff0f5457b', true, '2018-11-25');
INSERT INTO users(user_id, email_address, first_name, last_name, password, role_id, enabled, created) VALUES ('9db31989-42c8-4fb9-b645-6fa8d2f51855', 'averydsjones@gmail.com', 'Avery', 'Jones',
                                                         '$2y$12$oTocsjqCv5KPQuVMtF5Fm.hvq6XSb.vWgx/SMCuPfcDj9jT9/auHu', '6a8e4a82-7226-4eee-9e20-f65ff0f5457b', true, '2018-11-25');



