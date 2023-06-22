--DROP DATABASE IF EXISTS "meetups";
--CREATE DATABASE "meetups";

CREATE TABLE member
( 	member_id SERIAL NOT NULL,
 	last_name VARCHAR (50) NOT NULL,
 	first_name VARCHAR (50) NOT NULL,
 	email VARCHAR (45) NOT NULL,
 	phone_number INT NULL,
 	date_of_birth DATE NOT NULL,
 	reminder_emails BOOLEAN NOT NULL,
 
 	CONSTRAINT pk_member PRIMARY KEY (member_id)
);

--DROP TABLE IF EXISTS interest_group;
CREATE TABLE interest_group
(	interest_group_id SERIAL NOT NULL,
 	interest_group_name VARCHAR (100) NOT NULL,
 
 	CONSTRAINT pk_interest_group PRIMARY KEY (interest_group_id),
    CONSTRAINT uq_name UNIQUE (interest_group_name)
);

--DROP TABLE IF EXISTS event;
CREATE TABLE event 
( 	event_id SERIAL NOT NULL,
 	event_name VARCHAR (75) NOT NULL,
 	description VARCHAR (400) NOT NULL,
 	start_date_and_time DATE NOT NULL, 
 	duration INT NOT NULL DEFAULT 30,
 
 CONSTRAINT pk_event PRIMARY KEY (event_id)
 --CONSTRAINT fk_member_event FOREIGN KEY (member_id) REFERENCES member (member_id),
 --CONSTRAINT fk_interest_group_event FOREIGN KEY (interest_group_id) REFERENCES interest_group (interest_group_id)
 	
);

CREATE TABLE member_group
(	member_id INT NOT NULL,
 	interest_group_id INT NOT NULL,
 
 CONSTRAINT pk_member_interest_group PRIMARY KEY (member_id, interest_group_id)

);
 
 CREATE TABLE member_event
 (	member_id INT NOT NULL,
  	interest_group_id INT NOT NULL,
  
 CONSTRAINT pk_member_event PRIMARY KEY (member_id, interest_group_id)
 CONSTRAINT fk_member_event FOREIGN KEY (member_id, interest_group_id)
 
 );
 	
	ALTER TABLE member_group ADD CONSTRAINT fk_member_interest_group FOREIGN KEY (member_id) REFERENCES member (member_id);
	--ALTER TABLE member_group ADD CONSTRAINT fk_member_interest_group FOREIGN KEY (interest_group_id) REFERENCES interest_group(interest_group_id);
	ALTER TABLE member_event ADD CONSTRAINT fk_member_event FOREIGN KEY (member_id) REFERENCES member (member_id);
	--ALTER TABLE member_event ADD CONSTRAINT fk_member_event FOREIGN KEY (interest_group_id) REFERENCES interest_group(interest_group_id);
	
	
	INSERT INTO member (last_name, first_name, email, phone_number, date_of_birth, reminder_emails)
				VALUES ('Hancock','John', 'jh@gmail.com', NULL , '12/17/1987','true'),
						('Dean', 'Jimmy', 'jd@gamil.com', NULL, '1/17/1987', 'true'), 
						('Poppins', 'Mary', 'mp@gmail.com', NULL, '2/17/1987','true'),
						('Lee', 'Sarah', 'sl@gmail.com', NULL, '3/17/1987', 'true' ),
						('Crocker', 'Betty', 'bc@gmail.com', NULL, '4/17/1987', 'false'),
						('Howard', 'Dwight', 'dh@gmail.com', NULL, '5/17/1987', 'false'),
						('Butler', 'Jimmy', 'jb@gamil.com', NULL, '6/17/1987', 'false'),
						('James', 'Lebron', 'lb@gmail.com', NULL, '7/17/1987', 'false');
						--SELECT * FROM member;
	
	
	INSERT INTO interest_group (interest_group_name)
						VALUES ('Basketball Fans'),
							   ('Foodies'),
							   ('Geek Squad');
	
	
	
	INSERT INTO event (event_name, description, start_date_and_time, duration)
			VALUES 	  ('Basketball Fans Unite', 'a gathering of all things basketball for the true basketball fans', '9/16/2023 7:00:00','120'),
					  ('Foodies Unite', 'you know why we are here, we love food!', '8/24/2023 8:00:00', '120'),
					  ('Geek Squad Meetup', 'a space for all things tech','7/15/2023 8:30:00','120');
		--SELECT * FROM event
		
		
	--SELECT member_id, event_id FROM member, event; 
	--INSERT INTO member_event 
	
	
	
	
	--SELECT * FROM member;
	
	
	
	
	
	
	