-- Initialize database
source Initialize.sql

-- Your SQL statements go here
DELETE FROM Horse
WHERE ID = 5;

DELETE FROM Horse
WHERE Breed = 'Holsteiner' OR Breed = 'Paint';

DELETE FROM Horse
WHERE BirthDate < '2013-03-13';

SELECT *
FROM Horse;
