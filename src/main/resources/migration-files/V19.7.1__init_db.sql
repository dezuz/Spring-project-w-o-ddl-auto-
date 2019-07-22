CREATE TABLE user_table (
    id BIGSERIAL PRIMARY KEY,
    age INT NOT NULL,
    login VARCHAR(255) NOT NULL,
    name VARCHAR(255) NOT NULL,
    role VARCHAR(255)
);

CREATE TABLE course (
    id BIGSERIAL PRIMARY KEY,
    creation_date BIGINT,
    cost INT NOT NULL,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE section (
    id BIGSERIAL PRIMARY KEY,
    creation_date BIGINT,
    name VARCHAR(255) NOT NULL,
    course_id BIGINT
);

CREATE TABLE lesson (
    id BIGSERIAL PRIMARY KEY,
    creation_date BIGINT,
    content VARCHAR(255) NOT NULL,
    name VARCHAR(255) NOT NULL,
    section_id BIGINT
);

CREATE TABLE comment (
    id BIGSERIAL PRIMARY KEY,
    creation_date BIGINT,
    content VARCHAR(255) NOT NULL,
    author_id INT,
    lesson_id BIGINT
);

ALTER TABLE comment
    ADD CONSTRAINT fk_comment_id
        FOREIGN KEY(lesson_id) REFERENCES lesson(id);

ALTER TABLE section
    ADD CONSTRAINT section_course_id_fk
        FOREIGN KEY(course_id) REFERENCES course(id);

ALTER TABLE lesson
    ADD CONSTRAINT lesson_section_id_fk
        FOREIGN KEY(section_id) REFERENCES section(id);


