-- Professors
INSERT INTO coach ("name") VALUES ('William Fences'); -- 1
INSERT INTO coach ("name") VALUES ('Arvid Strøm'); -- 2
INSERT INTO coach ("name") VALUES ('Anne Hansen'); -- 3
INSERT INTO coach ("name") VALUES ('Liv Larsen'); -- 4
-- Students
INSERT INTO athlete ("name", coach_id) VALUES ('Ola Nordmann', 1); -- 1
INSERT INTO athlete ("name", coach_id) VALUES ('Emma Hansen', 1); -- 2
INSERT INTO athlete ("name", coach_id) VALUES ('Olivia Nordmann', 2); -- 3
INSERT INTO athlete ("name", coach_id) VALUES ('Lucas Olsen', 2); -- 4
INSERT INTO athlete ("name", coach_id) VALUES ('Askel Nilsen', 3); -- 5
INSERT INTO athlete ("name", coach_id) VALUES ('Frida Kristiansen', 3); -- 6
INSERT INTO athlete ("name", coach_id) VALUES ('Ingrid Johansen', 3); -- 7
INSERT INTO athlete ("name", coach_id) VALUES ('Jakob Andersen', 3); -- 8
-- Projects
INSERT INTO event (title, athlete_id) VALUES ('Marathon', 1);
INSERT INTO event (title, athlete_id) VALUES ('100m fences', 2);
INSERT INTO event (title, athlete_id) VALUES ('300m sprint', 3);
INSERT INTO event (title, athlete_id) VALUES ('Distance jump', 5);
INSERT INTO event (title, athlete_id) VALUES ('Badminton', 7);
INSERT INTO event (title, athlete_id) VALUES ('2000m Swimming', 8);
-- Subjects
