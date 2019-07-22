INSERT INTO course(creation_date, cost, name) VALUES (1563211909, 12000, 'Java');
INSERT INTO course(creation_date, cost, name) VALUES (1563211916, 6000, 'English');

INSERT INTO section(creation_date, name, course_id) VALUES (1563212189, 'Java Core', 1);
INSERT INTO section(creation_date, name, course_id) VALUES (1563212275, 'Concurrency', 1);
INSERT INTO section(creation_date, name, course_id) VALUES (1563212286, 'Spring', 1);

INSERT INTO section(creation_date, name, course_id) VALUES (1563212315, 'Pre-Intermediate', 2);
INSERT INTO section(creation_date, name, course_id) VALUES (1563212318, 'Intermediate', 2);
INSERT INTO section(creation_date, name, course_id) VALUES (1563212321, 'Advanced', 2);

INSERT INTO lesson(creation_date, content, name, section_id) VALUES (1563212413, 'String is immutable', 'String', 1);
INSERT INTO lesson(creation_date, content, name, section_id) VALUES (1563212555, 'int has Integer, long has Long...', 'Autoboxing', 1);
INSERT INTO lesson(creation_date, content, name, section_id) VALUES (1563212558, 'Object class has 11 methods', 'Object class', 1);

INSERT INTO lesson(creation_date, content, name, section_id) VALUES (1563212780, 'A set of permits', 'Semaphore', 2);
INSERT INTO lesson(creation_date, content, name, section_id) VALUES (1563212783, 'Allows a set of threads to all wait for each other to reach a common barrier point', 'CyclicBarrier', 2);
INSERT INTO lesson(creation_date, content, name, section_id) VALUES (1563212785, 'Realisation of pattern Barrier', 'Phaser', 2);

INSERT INTO lesson(creation_date, content, name, section_id) VALUES (1563375287, 'Contains bean metadata', 'BeanDefinition', 3);
INSERT INTO lesson(creation_date, content, name, section_id) VALUES (1563375385, 'Add class to container', '@Component', 3);
INSERT INTO lesson(creation_date, content, name, section_id) VALUES (1563375388, 'Realisation of pattern Model-View-Controller', 'Spring MVC', 3);

INSERT INTO lesson(creation_date, content, name, section_id) VALUES (1563375581, 'A noun is a word that functions as the name of some specific thing or set of things', 'Noun', 4);
INSERT INTO lesson(creation_date, content, name, section_id) VALUES (1563375588, 'Numerator is the part of a fraction that is above the line', 'Numerator', 4);
INSERT INTO lesson(creation_date, content, name, section_id) VALUES (1563375591, 'Syllable is a single unit of speech', 'Syllable', 4);

INSERT INTO lesson(creation_date, content, name, section_id) VALUES (1563375872, 'The present perfect is used to indicate a link between the present and the past', 'Present Perfect', 5);
INSERT INTO lesson(creation_date, content, name, section_id) VALUES (1563375878, 'The simple past tense, sometimes called the preterite, is used to talk about a completed action in a time before now', 'Past Simple', 5);
INSERT INTO lesson(creation_date, content, name, section_id) VALUES (1563375882, 'The present perfect simple expresses an action that is still going on or that stopped recently, but has an influence on the present', 'Present Perfect Simple', 5);

INSERT INTO lesson(creation_date, content, name, section_id) VALUES (1563376039, 'We will give you the BBC Learning English book', 'Advanced grammar', 6);
INSERT INTO lesson(creation_date, content, name, section_id) VALUES (1563376039, 'You will talk with native speakers at this lesson', 'Native speaker talk', 6);
INSERT INTO lesson(creation_date, content, name, section_id) VALUES (1563376046, 'We will teach you the high level English', 'Cambridge english', 6);