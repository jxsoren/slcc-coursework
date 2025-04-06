-- start a new transaction
START TRANSACTION;

  -- insert a new actor
  INSERT INTO actor (first_name, last_name)
  VALUES ('VICTOR', 'ROBERTS');

  -- execute select query
  SELECT first_name, last_name
  FROM actor
  WHERE last_name LIKE 'R%';

  -- set a savepoint
  SAVEPOINT before_delete;

  -- delete actor
  DELETE 
  FROM actor
  WHERE first_name = 'VICTOR' AND last_name = 'ROBERTS';

  -- execute query again
  SELECT first_name, last_name
  FROM actor
  WHERE last_name LIKE 'R%';

  -- rolback to the savepoint
  ROLLBACK TO SAVEPOINT before_delete;

  SELECT first_name, last_name
  FROM actor
  WHERE last_name LIKE 'R%';

  -- commit the transaction
COMMIT;

