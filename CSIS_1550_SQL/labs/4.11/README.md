The Movie table has the following columns:

    ID - integer, primary key
    Title - variable-length string
    Genre - variable-length string
    RatingCode - variable-length string
    Year - integer

The Rating table has the following columns:

    Code - variable-length string, primary key
    Description - variable-length string

Write a statement that selects movie title, year, and description. Select all movies, including movies with no rating code.

Hint: Perform a LEFT JOIN on Movie and Rating, matching the RatingCode and Code columns.
