-- Initialize database
source Initialize.sql

-- Your SQL statement goes here
SELECT RegisteredName, Height, BirthDate
FROM Horse
WHERE Height >= 15.0 AND Height <= 16.0 OR BirthDate >= '2020-01-01';
