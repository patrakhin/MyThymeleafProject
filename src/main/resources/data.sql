CREATE TABLE users (
                          id BIGINT PRIMARY KEY AUTO_INCREMENT,
                          username VARCHAR(255) NOT NULL,
                          password VARCHAR(255) NOT NULL
);
INSERT INTO users (username, password) VALUES ('testuser', 'testpassword');