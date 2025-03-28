
-- Initialize database
source Initialize.sql

-- Your SELECT statement goes here
SELECT RegisteredName, Height
FROM Horse
WHERE Horse.Height > (
  SELECT AVG(Horse.Height)
  FROM Horse
)
ORDER BY Horse.Height

