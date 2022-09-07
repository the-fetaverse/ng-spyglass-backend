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

INSERT INTO goals
VALUES (
	1,
    "PS5",
    "New PlayStation for Christmas",
    "dmjohnspor@gmail.com",
    "09/06/2022",
    "12/25/2022",
    0,
    500.00,
    false
);
INSERT INTO goals
VALUES (
	2,
    "Trip to Spain",
    "Spend summer in Barcelona",
    "dmjohnspor@gmail.com",
    "09/06/2022",
    "07/10/2023",
    0,
    2500.00,
    false
);