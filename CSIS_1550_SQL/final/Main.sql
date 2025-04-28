CREATE DATABASE IF NOT EXISTS MOVIES;
USE MOVIES;

-- Actor Table

CREATE TABLE IF NOT EXISTS Actor(
  actorID INT PRIMARY KEY,
  lastName VARCHAR(50) NOT NULL,
  firstName VARCHAR(50) NOT NULL,
  middleName VARCHAR(50),
  suffix VARCHAR(10),
  gender CHAR(1) check (gender in ('M', 'F')),
  birthDay DATE NOT NULL,
  deathDate DATE
);

-- Movie Table

CREATE TABLE IF NOT EXISTS Movie(
  movieID INT PRIMARY KEY,
  title VARCHAR(100) NOT NULL,
  year YEAR NOT NULL,
  company VARCHAR(100),
  totalNoms TINYINT,
  awardsWon TINYINT,
  DVDPrice DECIMAL(2, 2),
  discountPrice DECIMAL(2, 2)
);

-- Quote Table

CREATE TABLE IF NOT EXISTS Quote(
  quoteID INT PRIMARY KEY,
  quoteText VARCHAR(100)
); 

-- Role Table

CREATE TABLE IF NOT: EXISTS Role(
  roleID INT PRIMARY KEY,
  roleName VARCHAR(50),
  gender CHAR(1) CHECK (gender in ('M', 'F')),
  actorID INT REFERENCES Actor(actorID),
  movieID INT REFERENCES Movie(movieID)
);

-- Role Quote Table

CREATE TABLE IF NOT EXISTS RoleQuote(
  roleID INT PRIMARY KEY,
  quoteID INT REFERENCES Quote(quoteID)
);

