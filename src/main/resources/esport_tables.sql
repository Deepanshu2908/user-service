CREATE TABLE IF NOT EXISTS users (
    id BIGSERIAL PRIMARY KEY,
    fullname VARCHAR(255),
    email VARCHAR(255) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS contest (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    gametype VARCHAR(50) NOT NULL,
    entryfee DECIMAL(10, 2) NOT NULL,
    maxparticipants INT NOT NULL,
    prizepool DECIMAL(10, 2) NOT NULL,
    starttime TIMESTAMP NOT NULL,
    endtime TIMESTAMP NOT NULL
);

CREATE TABLE IF NOT EXISTS team (
    id SERIAL PRIMARY KEY,
    user_id BIGINT NOT NULL,
    contest_id BIGINT NOT NULL,
    team_name VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS team_player (
    id SERIAL PRIMARY KEY,
    player_id BIGINT NOT NULL,
    role VARCHAR(100),
    team_id BIGINT REFERENCES team(id)  -- <-- correct column name and relationship
);
