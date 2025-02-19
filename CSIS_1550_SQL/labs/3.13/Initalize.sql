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
