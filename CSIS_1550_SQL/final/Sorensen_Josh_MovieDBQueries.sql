USE MOVIES;

-- 1. Find the movieID, title, year, and DVDPrice of all movies where the DVD-Price is equal to the discountPrice.

SELECT movieID, title, year, DVDPrice
FROM Movie
WHERE DVDPrice = discountPrice;

-- 2. Find the actorID, lastName, firstName, middleName, and suffix of all actors whose middleName is not NULL.

SELECT actorID, lastName, firstName, middleName, suffix
FROM Actor
WHERE middleName is NOT NULL;

-- 3. Suppose you remember a movie quote “Play it again, Sam.” However, when you write a query to find this quote, you get no results. 
-- Write a query that will find the text of all movie quotes that begin with the word “Play.”

describe Quote;

SELECT *
FROM Quote
WHERE quoteText like "Play%";

-- 4. Suppose you remember the role of Joker in one of the Batman movies, but when you write a query to find this role, you get no results. 
-- Write a query that will find the roleID and roleName of any role where Joker appears as part of the role name.

SELECT roleID, roleName
FROM Role
WHERE roleName like "%Joker%";

-- 5. Find the movieID, title, year, and totalNoms of all movies that were nominated for more than five Awards and were released before 1950.

SELECT movieID, title, year, totalNoms
FROM Movie
WHERE totalNoms > 5 AND year < 1950;

-- 6.Find the movieID, title, year, and awardsWon of all movies that either won more than five Awards or were released after 1990.

SELECT movieID, title, year, awardsWon
FROM Movie
WHERE awardsWon > 5 OR year > 1990;

-- 7. Find the movieID, title, year, and discountPrice of all movies with discount prices between $15.00 and $20.00 inclusive.

SELECT movieID, title, year, discountPrice
FROM Movie
WHERE discountPrice BETWEEN 15.00 AND 20.00;

-- 8. Find the movieID, title, and year of all movies, along with the difference between totalNoms and awardsWon. 
-- For the column heading of the calculated column, use “nominated but not won.”

SELECT movieID, title, year, totalNoms - awardsWon as "nominated but not won."
FROM Movie;

-- 9. Suppose you have a special membership at a store that qualifies you for 10% off all of your purchases, including discount prices.
-- Find the movieID, title, and year of all movies, along with the discount price minus 10% of the discount price. 
-- For the column heading of the calculated column, use “my price.”

SELECT movieID, title, year, (discountPrice * 1.10) - discountPrice  as "my price."
FROM Movie;

-- 10. Find the gender and the count (of all rows of that gender) in the Actor table, grouped by gender.

SELECT gender, COUNT(*)
FROM Actor
GROUP BY gender;

-- 11. Find the totalNoms and the maximum number of awardsWon in the Movie table, grouped by totalNoms and ordered by the maximum number of awardsWon.

SELECT totalNoms, MAX(awardsWon)
FROM Movie
GROUP BY totalNoms
ORDER BY MAX(awardsWon);

-- 12. Find the company, year, and sum of awardsWon for movies, grouped by company and year.

SELECT company, year, SUM(awardsWon)
FROM Movie
GROUP BY company, year;

-- 13. Find the actorID, lastName, firstName, middleName, suffix, and birthdate of rows in the Actor table where the gender is F. 
-- Order the results by the actor’s date of birth.

describe actor;

SELECT actorID, lastName, firstName, middleName, suffix, birthDay
FROM Actor
WHERE gender = 'F';


-- 14. Find the movieID, title, year, DVDPrice, and half of the DVDPrice (the price for a half-off sale) of movies that have a DVDPrice of at least $20.00.

SELECT movieID, title, year, DVDPrice, (DVDPrice / 2) as "half-off sale"
FROM Movie
WHERE DVDPrice >= 20.00;

-- 15. Find the sum of the discount prices of movies made after 1979.

SELECT SUM(discountPrice)
FROM Movie
WHERE year > 1979;

-- 16. Find the awards won and the average discount price of movies made before 1980, grouped by awards won.

SELECT awardsWon, AVG(discountPrice)
FROM Movie
WHERE year < 1980
GROUP BY awardsWon;

-- 17. Find the movieID, title, and year of movies, and the roleID and roleName of roles for the join 
-- of the Movie and Role tables where the gender of the role is female.

SELECT Movie.movieID, Movie.title, Movie.year, Role.roleID, Role.roleName
FROM Movie
JOIN Role on Role.movieID = Movie.movieID
WHERE Role.gender = 'F';

-- 18. Find the roleID, quoteID, and quoteText in the join between the Quote and RoleQuote tables where the roleID is 00001 or 00003.

SELECT RoleQuote.roleID, RoleQuote.quoteID, Quote.quoteText
FROM RoleQuote
JOIN Quote on Quote.quoteID = RoleQuote.quoteID
WHERE RoleQuote.roleID in (1, 3);

-- 19. Write an SQL query to create a view named movie_view that combines information from the actor, movies, role, quote, and role_quote tables. 
-- Include columns such as actor_name, birthdate, movie_title, release_year, role_name, quote_text, etc., to provide a comprehensive database view.

CREATE VIEW movie_view AS
SELECT 
    CONCAT(a.firstName, ' ', a.lastName) AS actor_name,
    a.birthDay AS birthdate,
    m.title AS movie_title,
    m.year AS release_year,
    r.roleName AS role_name,
    q.quoteText AS quote_text,
    m.company,
    m.totalNoms,
    m.awardsWon
FROM Actor a
JOIN Role r ON a.actorID = r.actorID
JOIN Movie m ON r.movieID = m.movieID
LEFT JOIN RoleQuote rq ON r.roleID = rq.roleID
LEFT JOIN Quote q ON rq.quoteID = q.quoteID;

-- 20. Write SQL statements to create appropriate indexes on the identified columns. Ensure that primary keys already have associated indexes.

