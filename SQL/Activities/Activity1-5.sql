---- Activity 1
DROP TABLE salesman;
CREATE TABLE salesman(salesman_id int PRIMARY KEY, salesman_name varchar(20), salesman_city varchar(20), commission int);
DESCRIBE salesman;

--- Activity 2
INSERT ALL
    INTO salesman VALUES (5001, 'James Hoog', 'New York', 15)
    INTO salesman VALUES (5002, 'Nail knite', 'Paris', 13)
    INTO salesman VALUES (5003, 'Pit Alex', 'London', 11)
    INTO salesman VALUES (5004, 'McLyon', 'Rome', 14)
    INTO salesman VALUES (5005, 'Paul Adam', 'Rome', 13)
    INTO salesman VALUES (5006, 'Lauson Hen', 'San Jose', 12)
SELECT 1 FROM DUAL;
SELECT * FROM salesman;

--- Activity 3
SELECT salesman_id, salesman_city FROM salesman;
SELECT * FROM salesman WHERE salesman_city = 'Paris';
SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';

--- Activity 4
ALTER TABLE salesman ADD (grade int);
DESCRIBE salesman;
UPDATE salesman SET grade=100;
SELECT * FROM salesman;

---- Activity 5
UPDATE salesman SET grade=200 WHERE salesman_city='ROME';
UPDATE salesman SET grade=300 WHERE salesman_name='James Hoog';
UPDATE salesman SET salesman_name='Pierre' WHERE salesman_name='McLyon';
SELECT * FROM salesman;
