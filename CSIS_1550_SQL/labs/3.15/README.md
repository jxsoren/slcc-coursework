The Horse table has the following columns:

    ID - integer, auto increment, primary key
    RegisteredName - variable-length string
    Breed - variable-length string, must be one of the following: Egyptian Arab, Holsteiner, Quarter Horse, Paint, Saddlebred
    Height - decimal number, must be ≥ 10.0 and ≤ 20.0
    BirthDate - date, must be ≥ Jan 1, 2015

Make the following updates:

    Change the height to 15.6 for horse with ID 2.
    Change the registered name to Lady Luck and birth date to May 1, 2015 for horse with ID 4.
    Change every horse breed to NULL for horses born on or after December 22, 2016.

To confirm that the updates have been applied, add the SELECT * FROM Horse; statement.
