The database has three tables for tracking horse-riding lessons:

The Horse table has columns:

    ID - primary key
    RegisteredName
    Breed
    Height
    BirthDate

The Student table has columns:

    ID - primary key
    FirstName
    LastName
    Street
    City
    State
    Zip
    Phone
    EmailAddress

The LessonSchedule table has  columns:

    HorseID - foreign key references Horse
    StudentID - foreign key references Student
    LessonDateTime - datetime

    Primary key is (HorseID, LessonDateTime)

Write a statement that selects a lesson schedule for Feb 1, 2020 with lesson datetimes, student first and last names, and horse registered names. Order the results in ascending order by lesson datetime, then by registered name. Unassigned lesson times (student ID is NULL) must appear in the results.

Hint: Perform a three-way join on LessonSchedule, Student, and Horse. Use the DATE() function to convert datetime to date.
