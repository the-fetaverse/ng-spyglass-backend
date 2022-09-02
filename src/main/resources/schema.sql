CREATE TABLE users (
	username VARCHAR(255) NOT NULL PRIMARY KEY,
    password VARCHAR(255) NOT NULL,
    enabled BOOLEAN NOT NULL
);

CREATE TABLE authorities (
	username VARCHAR(255) NOT NULL,
    authority VARCHAR(50) NOT NULL,
    CONSTRAINT fk_users_authorities FOREIGN KEY(username) REFERENCES users(username)
);

CREATE TABLE goals (
    goal_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    description VARCHAR(255) NOT NULL,
    username VARCHAR(255) NOT NULL,
    date_created DATETIME(6) NOT NULL,
    date_target DATETIME(6) NOT NULL,
    amount_current DOUBLE NOT NULL,
    amount_target DOUBLE NOT NULL,
    flag_achieved BOOLEAN NOT NULL,
    CONSTRAINT fk_users_username FOREIGN KEY(username) REFERENCES users(username)
);