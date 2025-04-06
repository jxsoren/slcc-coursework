This lab illustrates transactional statements. The lab uses the actor table of the Sakila database. 

Enter and run the following statements:

1. Start a transaction.

2. Insert a new actor with first name 'VICTOR' and last name'ROBERTS'. 

3. Execute the following query:

SELECT first_name, last_name
FROM actor
WHERE last_name LIKE 'R%';

4. Set a savepoint.

5. Delete the actor with last name 'ROBERTS'.

6. Execute the query of step 3.

7. Roll back to the savepoint.

8. Execute the query of step 3.

9. Commit the transaction.

The actor Victor Roberts should appear in the result of steps 3 and 8 but not step 6.

