-- Initialize database
source Initialize.sql

-- Step 1. Explain the query SELECT * FROM film WHERE title = 'ALONE TRIP';.

EXPLAIN SELECT * FROM film WHERE title = 'ALONE TRIP';

-- Step 2. Drop the index idx_title on the film table.

DROP INDEX idx_title ON FILM;

-- Step 3. Explain the query of step 1 again.

EXPLAIN SELECT * FROM film WHERE title = 'ALONE TRIP';

-- Step 4. Explain the query SELECT rating, count(*) FROM film GROUP BY rating;

EXPLAIN SELECT rating, count(*) FROM film GROUP BY rating;

-- Step 5. Create an index idx_rating on the rating column.

CREATE INDEX idx_rating ON film (rating);

-- Step 6. Explain the query of step 5 again.

EXPLAIN SELECT rating, count(*) FROM film GROUP BY rating;

