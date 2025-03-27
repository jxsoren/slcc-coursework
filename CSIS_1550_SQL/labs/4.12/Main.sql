-- Initialize database
source Initialize.sql

-- Your SELECT statement goes here
SELECT Employee.FirstName Employee, Manager.FirstName Manager
FROM Employee
INNER JOIN Employee Manager on Employee.ManagerID = Manager.id
ORDER BY Employee.FirstName;

