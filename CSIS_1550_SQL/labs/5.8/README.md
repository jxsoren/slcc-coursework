This lab illustrates the use of indexes and EXPLAIN to optimize query performance. Refer to EXPLAIN Output Format for information about EXPLAIN result columns. 

Write and run six statements, using the Sakila film table. The statements must appear in the following order:

Step 1. Explain the query SELECT * FROM film WHERE title = 'ALONE TRIP';.

In the result, column key has value idx_title, indicating the query uses the index on title. Column rows is 1, indicating only one table row is read. The query executes an index scan and is relatively fast.

Step 2. Drop the index idx_title on the film table.

Step 3. Explain the query of step 1 again.

In the result, column key is null, indicating no index is available for the query. Column rows is 1000, indicating all rows are read. The query executes a table scan.

Step 4. Explain the query SELECT rating, count(*) FROM film GROUP BY rating;

In the result, column key is null, indicating no index is available for the query. Column rows is 1000, indicating all rows are read. The query executes a table scan.

Step 5. Create an index idx_rating on the rating column.

Step 6. Explain the query of step 5 again.

In the result, column key has value idx_rating, indicating the query executes an index scan. Although the query reads all 1000 rows, rows are read in order of rating value. The query uses the index to quickly locate rows containing each rating value.

