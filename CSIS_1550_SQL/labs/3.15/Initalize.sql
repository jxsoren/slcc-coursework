-- Drop Horse table if it exists
DROP TABLE IF EXISTS Horse;

-- Create Horse table
CREATE TABLE Horse (
	ID SMALLINT UNSIGNED NOT NULL AUTO_INCREMENT,
	RegisteredName VARCHAR(15),
	Breed VARCHAR(20) CHECK (Breed IN ('Egyptian Arab', 'Holsteiner', 'Quarter Horse', 'Paint', 'Saddlebred')),
	Height DECIMAL(3,1) CHECK (Height BETWEEN 10 AND 20),
	BirthDate DATE CHECK (BirthDate >= '2015-01-01'),
	PRIMARY KEY (ID)
);

-- Load data into Horse table
INSERT INTO Horse
VALUES
   (1, 'Babe', 'Quarter Horse', 15.3, '2015-02-10'),
   (2, 'Independence', 'Holsteiner', 16.0, '2015-03-13'),
   (3, 'Ellie', 'Saddlebred', 15.0, '2016-12-22'),
   (4, 'Thunder', 'Paint', 16.1, '2019-05-01'),
   (5, 'Alexis', 'Egyptian Arab', 15.9, '2018-02-01'),
   (6, 'Space Man', 'Holsteiner', 18.0, '2017-09-21');
