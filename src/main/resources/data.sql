INSERT INTO users
VALUES (
    "dmjohnspor@gmail.com",
    "$2a$10$aDDQAzkeuqly.Ov/zHsBteOQmwFk9RY/oDTxykWWf3oFvKEiu6iiW", -- password is "test"
    true
    -- "Giannis",
    -- "Sporidis"
    );

INSERT INTO authorities VALUES ("dmjohnspor@gmail.com", "ROLE_ADMIN");
INSERT INTO authorities VALUES ("dmjohnspor@gmail.com", "ROLE_USER");