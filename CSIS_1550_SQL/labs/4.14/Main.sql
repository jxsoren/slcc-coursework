-- Initialize database
source Initialize.sql

-- Your SELECT statement goes here
SELECT 
    ls.LessonDateTime LessonDateTime, 
    s.FirstName FirstName, 
    s.LastName LastName, 
    h.RegisteredName RegisteredName
FROM LessonSchedule ls
LEFT JOIN Student s on s.ID = ls.StudentID
JOIN Horse h on h.id = ls.HorseID
WHERE ls.LessonDateTime >= '2020-02-01 00:00:00' 
    AND ls.LessonDateTime <= '2020-02-01 23:59:59'
ORDER BY ls.LessonDateTime, h.RegisteredName;

