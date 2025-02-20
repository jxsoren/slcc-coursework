DROP TABLE IF EXISTS Horse;

CREATE TABLE Horse (
	ID SMALLINT UNSIGNED,
	RegisteredName VARCHAR(15),
	Breed VARCHAR(20),
	Height DECIMAL(3,1),
	BirthDate DATE
);

INSERT INTO Horse
VALUES 
    (1, 'Babe', 'Quarter Horse', 15.3, '2015-02-10'),
    (2, 'Independence', 'Holsteiner', 16.0, '2011-03-13'),
    (3, 'Ellie', 'Saddlebred', 15.0, '2016-12-22'),
    (4, 'Thunder', 'Paint', 16.1, '2019-05-01'),
    (5, 'Alexis' ,'Egyptian Arab', 15.9, '2018-02-01'),
    (6, 'Space Man', 'Holsteiner', 18.0, '2017-09-21'),
    (7, 'Lexie', 'Paint', 16.2, '2020-02-19');
