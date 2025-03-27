-- Initialize database
source Initialize.sql

-- Your SELECT statement goes here
SELECT Movie.Title, Movie.Year, Rating.Description
FROM Movie
LEFT JOIN Rating on Rating.code = Movie.RatingCode;

