-- 1. Add a new person to the person table with the name "Lisa Byway" with the birthday of 4/15/1984 (1 row)
SELECT person_name, birthday
FROM person
WHERE person_name = 'Lisa Byway';

INSERT INTO person (person_name, birthday)
VALUES('Lisa Byway', '4/15/1984');
