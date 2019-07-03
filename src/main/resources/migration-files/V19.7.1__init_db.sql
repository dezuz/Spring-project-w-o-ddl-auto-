CREATE TABLE user (
    id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    age INT NOT NULL,
    login VARCHAR(255) NOT NULL,
    name VARCHAR(255) NOT NULL,
    role VARCHAR(255)
);

CREATE TABLE course (
    id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    creation_date INT NOT NULL,
    cost INT NOT NULL,
    name VARCHAR(255) NOT NULL,
    section_id INT FOREIGN KEY REFERENCES section(id)
);

CREATE TABLE comment (
    id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    creation_date INT NOT NULL,
    content VARCHAR(255) NOT NULL,
    author_id INT
);

CREATE TABLE lesson (
    id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    creation_date INT NOT NULL,
    content VARCHAR(255) NOT NULL,
    name VARCHAR(255) NOT NULL,
    comment_id INT
);

CREATE TABLE section (
    id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    creation_date INT NOT NULL,
    name VARCHAR(255) NOT NULL
);