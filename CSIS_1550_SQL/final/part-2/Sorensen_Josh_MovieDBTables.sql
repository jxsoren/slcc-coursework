-- Create Database

CREATE DATABASE IF NOT EXISTS MOVIES;

# 16:52:07	CREATE DATABASE IF NOT EXISTS MOVIES	1 row(s) affected	0.0017 sec

USE MOVIES;

# 16:52:35	USE MOVIES	0 row(s) affected	0.00055 sec

-- Actor Table

CREATE TABLE IF NOT EXISTS Actor(
  actorID INT PRIMARY KEY,
  lastName VARCHAR(50),
  firstName VARCHAR(50),
  middleName VARCHAR(50),
  suffix VARCHAR(10),
  gender CHAR(1) check (gender in ('M', 'F')),
  birthDay DATE,
  deathDate DATE
);

# 16:52:49	CREATE TABLE IF NOT EXISTS Actor(   actorID INT PRIMARY KEY,   lastName VARCHAR(50),   firstName VARCHAR(50),   middleName VARCHAR(50),   suffix VARCHAR(10),   gender CHAR(1) check (gender in ('M', 'F')),   birthDay DATE,   deathDate DATE )	0 row(s) affected	0.0063 sec

-- Movie Table

CREATE TABLE IF NOT EXISTS Movie(
  movieID INT PRIMARY KEY,
  title VARCHAR(100),
  year YEAR,
  company VARCHAR(100),
  totalNoms TINYINT,
  awardsWon TINYINT,
  DVDPrice DECIMAL(4, 2),
  discountPrice DECIMAL(4, 2)
);

# 16:53:08	CREATE TABLE IF NOT EXISTS Movie(   movieID INT PRIMARY KEY,   title VARCHAR(100),   year YEAR,   company VARCHAR(100),   totalNoms TINYINT,   awardsWon TINYINT,   DVDPrice DECIMAL(4, 2),   discountPrice DECIMAL(4, 2) )	0 row(s) affected	0.0074 sec

-- Quote Table

CREATE TABLE IF NOT EXISTS Quote(
  quoteID INT PRIMARY KEY,
  quoteText VARCHAR(200)
); 

# 16:53:19	CREATE TABLE IF NOT EXISTS Quote(   quoteID INT PRIMARY KEY,   quoteText VARCHAR(200) )	0 row(s) affected	0.0075 sec

-- Role Table

CREATE TABLE IF NOT EXISTS Role (
    roleID INT PRIMARY KEY,
    roleName VARCHAR(50),
    gender CHAR(1) CHECK (gender IN ('M' , 'F')),
    actorID INT,
    movieID INT,
    FOREIGN KEY (actorID)
        REFERENCES Actor (actorID),
    FOREIGN KEY (movieID)
        REFERENCES Movie (movieID)
);

# 16:29:46 CREATE TABLE IF NOT EXISTS Role (     roleID INT PRIMARY KEY,     roleName VARCHAR(50),     gender CHAR(1) CHECK (gender IN ('M' , 'F')),     actorID INT,     movieID INT,     FOREIGN KEY (actorID)         REFERENCES Actor (actorID),     FOREIGN KEY (movieID)         REFERENCES Movie (movieID) )	0 row(s) affected	0.036 sec


-- Role Quote Table

CREATE TABLE IF NOT EXISTS RoleQuote (
    roleID INT,
    quoteID INT,
    PRIMARY KEY (roleID , quoteID),
    FOREIGN KEY (roleID)
        REFERENCES Role (roleID),
    FOREIGN KEY (quoteID)
        REFERENCES Quote (quoteID)
);

# 16:30:58	CREATE TABLE IF NOT EXISTS RoleQuote (     roleID INT,     quoteID INT,     PRIMARY KEY (roleID , quoteID),     FOREIGN KEY (roleID)         REFERENCES Role (roleID),     FOREIGN KEY (quoteID)         REFERENCES Quote (quoteID) )	0 row(s) affected	0.023 sec

-- Actor Data Load

INSERT INTO Actor
VALUES
	('00001','Hanks','Tom',NULL,NULL,'M','1956-07-09',NULL),
	('00002','Paxton','Bill',NULL,NULL,'M','1955-05-17',NULL),
	('00003','Bacon','Kevin',NULL,NULL,'M','1958-07-08',NULL),
	('00004','Sinise','Gary',NULL,NULL,'M','1955-03-17',NULL),
	('00005','Harris','Ed',NULL,NULL,'M','1950-11-28',NULL),
	('00006','Quinlan','Kathleen',NULL,NULL,'F','1954-11-19',NULL),
	('00007','Bogart','Humphrey',NULL,NULL,'M','1899-01-23','1957-01-14'),
	('00008','Bergman','Ingrid',NULL,NULL,'F','1913-08-29','1982-08-29'),
	('00009','Henreid','Paul',NULL,NULL,'M','1908-01-10','1992-03-29'),
	('00010','Rains','Claude',NULL,NULL,'M','1889-11-10','1967-05-30'),
	('00011','Veidt','Conrad',NULL,NULL,'M','1893-01-22','1943-04-03'),
	('00012','Greenstreet','Sydney',NULL,NULL,'M','1879-12-27','1954-01-18'),
	('00013','Lorre','Peter',NULL,NULL,'M','1904-06-26','1964-03-23'),
	('00014','Wilson','Dooley',NULL,NULL,'M','1886-04-03','1953-05-30'),
	('00015','Eastwood','Clint',NULL,NULL,'M','1930-05-31',NULL),
	('00016','Guardino','Harry',NULL,NULL,'M','1925-12-23','1995-07-17'),
	('00017','Santoni','Reni',NULL,NULL,'M','1939-04-21',NULL),
	('00018','Cruise','Tom',NULL,NULL,'M','1962-07-03',NULL),
	('00019','Nicholson','Jack',NULL,NULL,'M','1937-04-22',NULL),
	('00020','Moore','Demi',NULL,NULL,'F','1962-11-11',NULL),
	('00021','Sutherland','Kiefer',NULL,NULL,'M','1966-12-21',NULL),
	('00022','Pollak','Kevin',NULL,NULL,'M','1958-10-30',NULL),
	('00023','Costner','Kevin',NULL,NULL,'M','1955-01-18',NULL),
	('00024','Madigan','Amy',NULL,NULL,'F','1950-09-11',NULL),
	('00025','Hoffman','Gaby',NULL,NULL,'F','1982-01-08',NULL),
	('00026','Liotta','Ray',NULL,NULL,'M','1955-12-18',NULL),
	('00027','Goldblum','Jeff',NULL,NULL,'M','1952-10-22',NULL),
	('00028','Davis','Geena',NULL,NULL,'F','1957-01-21',NULL),
	('00029','Getz','John',NULL,NULL,'M','1947-10-15',NULL),
	('00030','Wright','Robin',NULL,NULL,'F','1966-04-08',NULL),
	('00031','Williamson','Mykelti',NULL,NULL,'M','1960-04-04',NULL),
	('00032','Field','Sally',NULL,NULL,'F','1946-11-06',NULL),
	('00033','Humphreys','Michael','Conner',NULL,'M',NULL,NULL),
	('00034','Brando','Marlon',NULL,NULL,'M','1924-04-03','2004-07-01'),
	('00035','Pacino','Al',NULL,NULL,'M','1940-04-25',NULL),
	('00036','Caan','James',NULL,NULL,'M','1939-03-26',NULL),
	('00037','Castellano','Richard',NULL,NULL,'M','1933-09-04','1988-12-10'),
	('00038','Duvall','Robert',NULL,NULL,'M','1931-01-05',NULL),
	('00039','Keaton','Diane',NULL,NULL,'F','1946-01-05',NULL),
	('00040','Shire','Talia',NULL,NULL,'F','1946-04-25',NULL),
	('00041','Mitchell','Thomas',NULL,NULL,'M','1892-07-11','1962-12-17'),
	('00042','O\'Neil','Barbara',NULL,NULL,'F','1909-07-10','1980-09-03'),
	('00043','Leigh','Vivien',NULL,NULL,'F','1913-11-05','1967-07-08'),
	('00044','McDaniel','Hattie',NULL,NULL,'F','1895-06-10','1952-10-26'),
	('00045','McQueen','Butterfly',NULL,NULL,'F','1911-01-08','1995-12-22'),
	('00046','Gable','Clark',NULL,NULL,'M','1901-02-01','1960-11-16'),
	('00047','Gooding','Cuba',NULL,'jr.','M','1968-01-02',NULL),
	('00048','Zellweger','Renee',NULL,NULL,'F','1969-04-25',NULL),
	('00049','Preston','Kelly',NULL,NULL,'F','1962-10-13',NULL),
	('00050','Hellinger','Mark',NULL,NULL,'M','1903-03-21','1947-12-21'),
	('00051','Willis','Bruce',NULL,NULL,'M','1955-03-19',NULL),
	('00052','Osment','Haley','Joel',NULL,'M','1988-04-10',NULL),
	('00053','Collette','Toni',NULL,NULL,'F','1972-11-01',NULL),
	('00054','Williams','Olivia',NULL,NULL,'F','1968-07-26',NULL),
	('00055','Locke','Sondra',NULL,NULL,'F','1947-05-28',NULL),
	('00056','Schwarzenegger','Arnold',NULL,NULL,'M','1947-07-30',NULL),
	('00057','Biehn','Michael',NULL,NULL,'M','1956-07-31',NULL),
	('00058','Hamilton','Linda',NULL,NULL,'F','1957-09-26',NULL),
	('00059','Furlong','Edward',NULL,NULL,'M','1977-08-02',NULL),
	('00060','Patrick','Robert',NULL,NULL,'M','1958-11-05',NULL),
	('00061','Garland','Judy',NULL,NULL,'F','1922-06-10','1969-06-22'),
	('00062','Morgan','Frank',NULL,NULL,'M','1890-06-01','1949-09-18'),
	('00063','Bolger','Ray',NULL,NULL,'M','1904-01-10','1987-01-15'),
	('00064','Lahr','Bert',NULL,NULL,'M','1895-08-13','1967-12-04'),
	('00065','Haley','Jack',NULL,NULL,'M','1898-08-10','1979-06-06'),
	('00066','Burke','Billie',NULL,NULL,'F','1885-08-07','1970-05-14'),
	('00067','Hamilton','Margaret',NULL,NULL,'F','1902-12-09','1985-05-16'),
	('00068','Blandick','Clara',NULL,NULL,'F','1880-06-04','1962-04-15'),
	('00069',NULL,'Terry',NULL,NULL,'M',NULL,NULL),
	('00070','Hoffman','Dustin',NULL,NULL,'M','1937-08-08',NULL),
	('00071','Lange','Jessica',NULL,NULL,'F','1949-04-20',NULL),
	('00072','Garr','Teri',NULL,NULL,'F','1944-12-11',NULL),
	('00073','Williams','Robin',NULL,NULL,'M','1952-07-21',NULL),
	('00074','Brosnan','Pierce',NULL,NULL,'M','1951-05-16',NULL),
	('00075','Fierstein','Harvey',NULL,NULL,'M','1954-06-06',NULL),
	('00076','Keaton','Michael',NULL,NULL,'M','1951-09-09',NULL),
	('00077','Basinger','Kim',NULL,NULL,'F','1953-12-08',NULL),
	('00078','DeVito','Danny',NULL,NULL,'M','1944-11-17',NULL),
	('00079','Pfeiffer','Michelle',NULL,NULL,'F','1958-04-29',NULL),
	('00080','Kilmer','Val',NULL,NULL,'M','1959-12-31',NULL),
	('00081','Jones','Tommy','Lee',NULL,'M','1946-09-15',NULL),
	('00082','Carrey','Jim',NULL,NULL,'M','1962-01-17',NULL),
	('00083','Kidman','Nicole',NULL,NULL,'F','1967-06-20',NULL),
	('00084','O\'Donnell','Chris',NULL,NULL,'M','1970-06-26',NULL),
	('00085','Barrymore','Drew',NULL,NULL,'F','1975-02-22',NULL),
	('00086','Mazar','Debi',NULL,NULL,'F','1964-08-15',NULL),
	('00087','Clooney','George',NULL,NULL,'M','1961-05-06',NULL),
	('00088','Thurman','Uma',NULL,NULL,'F','1970-04-29',NULL),
	('00089','Silverstone','Alicia',NULL,NULL,'F','1976-10-04',NULL),
	('00090','Macpherson','Elle',NULL,NULL,'F','1963-03-29',NULL),
	('00091','Bale','Christian',NULL,NULL,'M','1974-01-30',NULL),
	('00092','Caine','Michael',NULL,NULL,'M','1933-03-14',NULL),
	('00093','Neeson','Liam',NULL,NULL,'M','1952-06-07',NULL),
	('00094','Holmes','Katie',NULL,NULL,'F','1978-12-18',NULL),
	('00095','Walshe','Pat',NULL,NULL,'M','1900-07-26','1991-12-11'),
	('00096','Grapewin','Charley',NULL,NULL,'M','1869-12-20','1956-02-02'),
	('00097','Hulce','Tom',NULL,NULL,'M','1953-12-06',NULL),
	('00098','Abraham','F.','Murray',NULL,'M','1940-10-24',NULL),
	('00099','Berridge','Elizabeth',NULL,NULL,'F','1962-05-02',NULL),
	('00100','Jones','Jeffrey',NULL,NULL,'M','1947-09-28',NULL);

# 16:54:06	INSERT INTO Actor VALUES  ('00001','Hanks','Tom',NULL,NULL,'M','1956-07-09',NULL),  ('00002','Paxton','Bill',NULL,NULL,'M','1955-05-17',NULL),  ('00003','Bacon','Kevin',NULL,NULL,'M','1958-07-08',NULL),  ('00004','Sinise','Gary',NULL,NULL,'M','1955-03-17',NULL),  ('00005','Harris','Ed',NULL,NULL,'M','1950-11-28',NULL),  ('00006','Quinlan','Kathleen',NULL,NULL,'F','1954-11-19',NULL),  ('00007','Bogart','Humphrey',NULL,NULL,'M','1899-01-23','1957-01-14'),  ('00008','Bergman','Ingrid',NULL,NULL,'F','1913-08-29','1982-08-29'),  ('00009','Henreid','Paul',NULL,NULL,'M','1908-01-10','1992-03-29'),  ('00010','Rains','Claude',NULL,NULL,'M','1889-11-10','1967-05-30'),  ('00011','Veidt','Conrad',NULL,NULL,'M','1893-01-22','1943-04-03'),  ('00012','Greenstreet','Sydney',NULL,NULL,'M','1879-12-27','1954-01-18'),  ('00013','Lorre','Peter',NULL,NULL,'M','1904-06-26','1964-03-23'),  ('00014','Wilson','Dooley',NULL,NULL,'M','1886-04-03','1953-05-30'),  ('00015','Eastwood','Clint',NULL,NULL,'M','1930-05-31',NULL),  ('00016','Guardino','Harry',NULL,NULL,'M','1925-12-23','1995-07-17'),  ('00017','Santoni','Reni',NULL,NULL,'M','1939-04-21',NULL),  ('00018','Cruise','Tom',NULL,NULL,'M','1962-07-03',NULL),  ('00019','Nicholson','Jack',NULL,NULL,'M','1937-04-22',NULL),  ('00020','Moore','Demi',NULL,NULL,'F','1962-11-11',NULL),  ('00021','Sutherland','Kiefer',NULL,NULL,'M','1966-12-21',NULL),  ('00022','Pollak','Kevin',NULL,NULL,'M','1958-10-30',NULL),  ('00023','Costner','Kevin',NULL,NULL,'M','1955-01-18',NULL),  ('00024','Madigan','Amy',NULL,NULL,'F','1950-09-11',NULL),  ('00025','Hoffman','Gaby',NULL,NULL,'F','1982-01-08',NULL),  ('00026','Liotta','Ray',NULL,NULL,'M','1955-12-18',NULL),  ('00027','Goldblum','Jeff',NULL,NULL,'M','1952-10-22',NULL),  ('00028','Davis','Geena',NULL,NULL,'F','1957-01-21',NULL),  ('00029','Getz','John',NULL,NULL,'M','1947-10-15',NULL),  ('00030','Wright','Robin',NULL,NULL,'F','1966-04-08',NULL),  ('00031','Williamson','Mykelti',NULL,NULL,'M','1960-04-04',NULL),  ('00032','Field','Sally',NULL,NULL,'F','1946-11-06',NULL),  ('00033','Humphreys','Michael','Conner',NULL,'M',NULL,NULL),  ('00034','Brando','Marlon',NULL,NULL,'M','1924-04-03','2004-07-01'),  ('00035','Pacino','Al',NULL,NULL,'M','1940-04-25',NULL),  ('00036','Caan','James',NULL,NULL,'M','1939-03-26',NULL),  ('00037','Castellano','Richard',NULL,NULL,'M','1933-09-04','1988-12-10'),  ('00038','Duvall','Robert',NULL,NULL,'M','1931-01-05',NULL),  ('00039','Keaton','Diane',NULL,NULL,'F','1946-01-05',NULL),  ('00040','Shire','Talia',NULL,NULL,'F','1946-04-25',NULL),  ('00041','Mitchell','Thomas',NULL,NULL,'M','1892-07-11','1962-12-17'),  ('00042','O\'Neil','Barbara',NULL,NULL,'F','1909-07-10','1980-09-03'),  ('00043','Leigh','Vivien',NULL,NULL,'F','1913-11-05','1967-07-08'),  ('00044','McDaniel','Hattie',NULL,NULL,'F','1895-06-10','1952-10-26'),  ('00045','McQueen','Butterfly',NULL,NULL,'F','1911-01-08','1995-12-22'),  ('00046','Gable','Clark',NULL,NULL,'M','1901-02-01','1960-11-16'),  ('00047','Gooding','Cuba',NULL,'jr.','M','1968-01-02',NULL),  ('00048','Zellweger','Renee',NULL,NULL,'F','1969-04-25',NULL),  ('00049','Preston','Kelly',NULL,NULL,'F','1962-10-13',NULL),  ('00050','Hellinger','Mark',NULL,NULL,'M','1903-03-21','1947-12-21'),  ('00051','Willis','Bruce',NULL,NULL,'M','1955-03-19',NULL),  ('00052','Osment','Haley','Joel',NULL,'M','1988-04-10',NULL),  ('00053','Collette','Toni',NULL,NULL,'F','1972-11-01',NULL),  ('00054','Williams','Olivia',NULL,NULL,'F','1968-07-26',NULL),  ('00055','Locke','Sondra',NULL,NULL,'F','1947-05-28',NULL),  ('00056','Schwarzenegger','Arnold',NULL,NULL,'M','1947-07-30',NULL),  ('00057','Biehn','Michael',NULL,NULL,'M','1956-07-31',NULL),  ('00058','Hamilton','Linda',NULL,NULL,'F','1957-09-26',NULL),  ('00059','Furlong','Edward',NULL,NULL,'M','1977-08-02',NULL),  ('00060','Patrick','Robert',NULL,NULL,'M','1958-11-05',NULL),  ('00061','Garland','Judy',NULL,NULL,'F','1922-06-10','1969-06-22'),  ('00062','Morgan','Frank',NULL,NULL,'M','1890-06-01','1949-09-18'),  ('00063','Bolger','Ray',NULL,NULL,'M','1904-01-10','1987-01-15'),  ('0...	100 row(s) affected Records: 100  Duplicates: 0  Warnings: 0	0.0035 sec

-- Movie Data Load

INSERT INTO Movie
VALUES
	('001','Apollo 13',1995,'Imagine Entertainment and Universal Pictures',9,2,12.99,9.99),
	('002','Casablanca',1943,'Warner Brothers',8,3,19.99,14.99),
	('003','Dirty Harry',1971,'The Malpaso Company',0,0,16.99,16.99),
	('004','Few Good Men, A',1992,'Castle Rock Entertainment',4,0,14.99,9.99),
	('005','Field of Dreams',1989,'Gordon Company',3,0,12.99,9.99),
	('006','Fly, The',1986,'Brooksfilms Limited',1,1,19.99,14.99),
	('007','Forrest Gump',1994,'Steve Tisch/Wendy Finerman',13,6,14.99,9.99),
	('008','Godfather, The',1972,'Albert S. Ruddy',10,3,14.99,9.99),
	('009','Gone with the Wind',1939,'Selznick International Pictures',15,10,19.99,17.99),
	('010','Jerry Maguire',1996,'TriStar Pictures',5,1,14.99,9.99),
	('011','Naked City, The',1948,'Mark Hellinger',3,2,29.99,29.99),
	('012','Sixth Sense, The',1999,'Kennedy/Marshall/Barry Mendel',6,0,14.99,9.99),
	('013','Sudden Impact',1983,'The Malpaso Company',0,0,9.99,9.99),
	('014','Terminator, The',1984,'Hemdale Film',0,0,14.99,9.99),
	('015','Terminator 2:  Judgment Day',1991,'CarolCo Pictures',6,4,9.99,7.99),
	('016','Wizard of Oz, The',1939,'Metro-Goldwyn-Mayer',5,2,22.99,22.99),
	('017','Tootsie',1982,'Mirage Punch',10,1,14.99,14.99),
	('018','Mrs. Doubtfire',1993,'20th Century Fox',1,1,14.99,14.99),
	('019','Batman',1989,'Warner Brothers',1,1,26.99,24.99),
	('020','Batman Returns',1992,'Warner Brothers',2,0,26.99,24.99),
	('021','Batman Forever',1995,'Warner Brothers',3,0,26.99,24.99),
	('022','Batman & Robin',1997,'Warner Brothers',0,0,19.99,15.99),
	('023','Batman Begins',2005,'Warner Brothers',1,0,14.99,9.99),
	('024','Amadeus',1984,'Saul Zaentz Company',11,8,19.99,14.99);
    
# 16:54:23	INSERT INTO Movie VALUES  ('001','Apollo 13',1995,'Imagine Entertainment and Universal Pictures',9,2,12.99,9.99),  ('002','Casablanca',1943,'Warner Brothers',8,3,19.99,14.99),  ('003','Dirty Harry',1971,'The Malpaso Company',0,0,16.99,16.99),  ('004','Few Good Men, A',1992,'Castle Rock Entertainment',4,0,14.99,9.99),  ('005','Field of Dreams',1989,'Gordon Company',3,0,12.99,9.99),  ('006','Fly, The',1986,'Brooksfilms Limited',1,1,19.99,14.99),  ('007','Forrest Gump',1994,'Steve Tisch/Wendy Finerman',13,6,14.99,9.99),  ('008','Godfather, The',1972,'Albert S. Ruddy',10,3,14.99,9.99),  ('009','Gone with the Wind',1939,'Selznick International Pictures',15,10,19.99,17.99),  ('010','Jerry Maguire',1996,'TriStar Pictures',5,1,14.99,9.99),  ('011','Naked City, The',1948,'Mark Hellinger',3,2,29.99,29.99),  ('012','Sixth Sense, The',1999,'Kennedy/Marshall/Barry Mendel',6,0,14.99,9.99),  ('013','Sudden Impact',1983,'The Malpaso Company',0,0,9.99,9.99),  ('014','Terminator, The',1984,'Hemdale Film',0,0,14.99,9.99),  ('015','Terminator 2:  Judgment Day',1991,'CarolCo Pictures',6,4,9.99,7.99),  ('016','Wizard of Oz, The',1939,'Metro-Goldwyn-Mayer',5,2,22.99,22.99),  ('017','Tootsie',1982,'Mirage Punch',10,1,14.99,14.99),  ('018','Mrs. Doubtfire',1993,'20th Century Fox',1,1,14.99,14.99),  ('019','Batman',1989,'Warner Brothers',1,1,26.99,24.99),  ('020','Batman Returns',1992,'Warner Brothers',2,0,26.99,24.99),  ('021','Batman Forever',1995,'Warner Brothers',3,0,26.99,24.99),  ('022','Batman & Robin',1997,'Warner Brothers',0,0,19.99,15.99),  ('023','Batman Begins',2005,'Warner Brothers',1,0,14.99,9.99),  ('024','Amadeus',1984,'Saul Zaentz Company',11,8,19.99,14.99)	24 row(s) affected Records: 24  Duplicates: 0  Warnings: 0	0.0030 sec
    
-- Quote Data Load

INSERT INTO Quote
VALUES
	('0001','Houston, we have a problem.'),
	('0002','Play it, Sam.  Play \"As Time Goes By.\"'),
	('0003','Of all the gin joints in all the towns in all the world, she walks into mine.'),
	('0004','Ilsa, I\'m no good at being noble, but it doesn\'t take much to see that the problems of three little people don\'t amount to a hill of beans in this crazy world.'),
	('0005','We\'ll always have Paris.'),
	('0006','Here\'s looking at you, kid.'),
	('0007','Round up the usual suspects.'),
	('0008','Louis, I think this is the beginning of a beautiful friendship.'),
	('0009','You\'ve got to ask yourself one question:  \"Do I feel lucky?\"  Well, do ya, punk?'),
	('0010','You can\'t handle the truth!'),
	('0011','If you build it, he will come.'),
	('0012','Be afraid.  Be very afraid.'),
	('0013','Mama says, \"Stupid is as stupid does.\"'),
	('0014','My mama always said, \"Life is like a box of chocolates.  You never know what you\'re gonna get.\"'),
	('0015','I\'m going to make him an offer he can\'t refuse.'),
	('0016','Leave the gun.  Take the cannolis.'),
	('0017','It\'s a Sicilian message.  It means Luca Brasi sleeps with the fishes.'),
	('0018','Fiddle-dee-dee.'),
	('0019','I don\'t know nothin\' \'bout birthin\' babies.'),
	('0020','As God is my witness, I\'ll never be hungry again.'),
	('0021','After all, tomorrow is another day.'),
	('0022','Frankly, my dear, I don\'t give a damn.'),
	('0023','Show me the money!'),
	('0024','You complete me.'),
	('0025','You had me at \"hello.\"'),
	('0026','There are eight million stories in the naked city.  This has been one of them.'),
	('0027','I see dead people.'),
	('0028','Go ahead, make my day.'),
	('0029','I\'ll be back.'),
	('0030','Hasta la vista, baby.'),
	('0031','Toto, I have a feeling we\'re not in Kansas anymore.'),
	('0032','I\'ll get you, my pretty, and your little dog, too!'),
	('0033','Lions and tigers and bears, oh my!'),
	('0034','I\'m melting!  Melting!  Oh, what a world!  What a world!'),
	('0035','Pay no attention to that man behind the curtain!'),
	('0036','There\'s no place like home.'),
	('0037','Have you ever danced with the Devil in the pale moonlight?'),
	('0038','You cursed brat, look what you\'ve done!'),
	('0039','Who would have thought a good little girl like you could destroy my beautiful wickedness?'),
	('0040','There are in fact only so many notes the ear can hear in the course of an evening.'),
	('0041','There are simply too many notes.'),
	('0042','I speak for all mediocrities in the world.  I am their champion.  I am their patron saint.'),
	('0043','Mediocrities everywhere.  I absolve you.  I absolve you.  I absolve you.  I absolve you.  I absolve you all.');
    
# 16:54:33	INSERT INTO Quote VALUES  ('0001','Houston, we have a problem.'),  ('0002','Play it, Sam.  Play \"As Time Goes By.\"'),  ('0003','Of all the gin joints in all the towns in all the world, she walks into mine.'),  ('0004','Ilsa, I\'m no good at being noble, but it doesn\'t take much to see that the problems of three little people don\'t amount to a hill of beans in this crazy world.'),  ('0005','We\'ll always have Paris.'),  ('0006','Here\'s looking at you, kid.'),  ('0007','Round up the usual suspects.'),  ('0008','Louis, I think this is the beginning of a beautiful friendship.'),  ('0009','You\'ve got to ask yourself one question:  \"Do I feel lucky?\"  Well, do ya, punk?'),  ('0010','You can\'t handle the truth!'),  ('0011','If you build it, he will come.'),  ('0012','Be afraid.  Be very afraid.'),  ('0013','Mama says, \"Stupid is as stupid does.\"'),  ('0014','My mama always said, \"Life is like a box of chocolates.  You never know what you\'re gonna get.\"'),  ('0015','I\'m going to make him an offer he can\'t refuse.'),  ('0016','Leave the gun.  Take the cannolis.'),  ('0017','It\'s a Sicilian message.  It means Luca Brasi sleeps with the fishes.'),  ('0018','Fiddle-dee-dee.'),  ('0019','I don\'t know nothin\' \'bout birthin\' babies.'),  ('0020','As God is my witness, I\'ll never be hungry again.'),  ('0021','After all, tomorrow is another day.'),  ('0022','Frankly, my dear, I don\'t give a damn.'),  ('0023','Show me the money!'),  ('0024','You complete me.'),  ('0025','You had me at \"hello.\"'),  ('0026','There are eight million stories in the naked city.  This has been one of them.'),  ('0027','I see dead people.'),  ('0028','Go ahead, make my day.'),  ('0029','I\'ll be back.'),  ('0030','Hasta la vista, baby.'),  ('0031','Toto, I have a feeling we\'re not in Kansas anymore.'),  ('0032','I\'ll get you, my pretty, and your little dog, too!'),  ('0033','Lions and tigers and bears, oh my!'),  ('0034','I\'m melting!  Melting!  Oh, what a world!  What a world!'),  ('0035','Pay no attention to that man behind the curtain!'),  ('0036','There\'s no place like home.'),  ('0037','Have you ever danced with the Devil in the pale moonlight?'),  ('0038','You cursed brat, look what you\'ve done!'),  ('0039','Who would have thought a good little girl like you could destroy my beautiful wickedness?'),  ('0040','There are in fact only so many notes the ear can hear in the course of an evening.'),  ('0041','There are simply too many notes.'),  ('0042','I speak for all mediocrities in the world.  I am their champion.  I am their patron saint.'),  ('0043','Mediocrities everywhere.  I absolve you.  I absolve you.  I absolve you.  I absolve you.  I absolve you all.')	43 row(s) affected Records: 43  Duplicates: 0  Warnings: 0	0.0023 sec    

-- Role Table Dataload

INSERT INTO Role
VALUES
	('00001','Dorothy Gale','F','00061','016'),
	('00002','The Wizard of Oz','M','00062','016'),
	('00003','The Scarecrow','M','00063','016'),
	('00004','The Cowardly Lion','M','00064','016'),
	('00005','The Tin Man','M','00065','016'),
	('00006','Glinda, the Good Witch of the North','F','00066','016'),
	('00007','The Wicked Witch of the West','F','00067','016'),
	('00008','Auntie Em','F','00068','016'),
	('00009','Toto','M','00069','016'),
	('00010','Gerald O\'Hara','M','00041','009'),
	('00011','Ellen O\'Hara','F','00042','009'),
	('00012','Scarlett O\'Hara','F','00043','009'),
	('00013','Mammy','F','00044','009'),
	('00014','Prissy','F','00045','009'),
	('00015','Rhett Butler','M','00046','009'),
	('00016','Rick Blaine','M','00007','002'),
	('00017','Ilsa Lund (Laszlo)','F','00008','002'),
	('00018','Victor Laszlo','M','00009','002'),
	('00019','Captain Renault','M','00010','002'),
	('00020','Major Strasser','M','00011','002'),
	('00021','Signor Ferrari','M','00012','002'),
	('00022','Ugarte','M','00013','002'),
	('00023','Sam','M','00014','002'),
	('00024','Narrator (voice)','M','00050','011'),
	('00025','Inspector Harry Callahan','M','00015','003'),
	('00026','Lieutenant Al Bressler','M','00016','003'),
	('00027','Inspector Chico Gonzalez','M','00017','003'),
	('00028','Don Vito Corleone','M','00034','008'),
	('00029','Michael Corleone','M','00035','008'),
	('00030','Santino \"Sonny\" Corleone','M','00036','008'),
	('00031','Peter Clemenza','M','00037','008'),
	('00032','Tom Hagen','M','00038','008'),
	('00033','Kay Adams','F','00039','008'),
	('00034','Connie Corleone Rizzi','F','00040','008'),
	('00035','Inspector Harry Callahan','M','00015','013'),
	('00036','Jennifer Spencer','F','00055','013'),
	('00037','The Terminator','M','00056','014'),
	('00038','Kyle Reese','M','00057','014'),
	('00039','Sarah Connor','F','00058','014'),
	('00040','Seth Brundle','M','00027','006'),
	('00041','Veronica Quaife','F','00028','006'),
	('00042','Stathis Borans','M','00029','006'),
	('00043','Ray Kinsella','M','00023','005'),
	('00044','Annie Kinsella','F','00024','005'),
	('00045','Karin Kinsella','F','00025','005'),
	('00046','Shoeless Joe Jackson','M','00026','005'),
	('00047','The Terminator','M','00056','015'),
	('00048','Sarah Connor','F','00058','015'),
	('00049','John Connor','M','00059','015'),
	('00050','T-1000',NULL,'00060','015'),
	('00051','Lieutenant Daniel Kaffee','M','00018','004'),
	('00052','Colonel Nathan R. Jessep','M','00019','004'),
	('00053','Lieutenant Commander JoAnne Galloway','F','00020','004'),
	('00054','Captain Jack Ross','M','00003','004'),
	('00055','Lieutenant Jonathan Kendrick','M','00021','004'),
	('00056','Lieutenant Sam Weinberg','M','00022','004'),
	('00057','Forrest Gump','M','00001','007'),
	('00058','Jenny Curran','F','00030','007'),
	('00059','Lieutenant Dan Taylor','M','00004','007'),
	('00060','Private Benjamin Buford \"Bubba\" Blue','M','00031','007'),
	('00061','Mrs. Gump','F','00032','007'),
	('00062','Young Forrest Gump','M','00033','007'),
	('00063','Jim Lovell','M','00001','001'),
	('00064','Fred Haise','M','00002','001'),
	('00065','Jack Swigert','M','00003','001'),
	('00066','Ken Mattingly','M','00004','001'),
	('00067','Gene Kranz','M','00005','001'),
	('00068','Marilyn Lovell','F','00006','001'),
	('00069','Jerry Maguire','M','00018','010'),
	('00070','Rod Tidwell','M','00047','010'),
	('00071','Dorothy Boyd','F','00048','010'),
	('00072','Avery Bishop','F','00049','010'),
	('00073','Dr. Malcolm Crowe','M','00051','012'),
	('00074','Cole Sear','M','00052','012'),
	('00075','Lynn Sear','F','00053','012'),
	('00076','Anna Crowe','F','00054','012'),
	('00077','Michael Dorsey','M','00070','017'),
	('00078','Dorothy Michaels (Tootsie)','F','00070','017'),
	('00079','Julie Nichols','F','00071','017'),
	('00080','Sandy Lester','F','00072','017'),
	('00081','Daniel Hillard','M','00073','018'),
	('00082','Mrs. Doubtfire','F','00073','018'),
	('00083','Miranda Hillard','F','00032','018'),
	('00084','Stuart \'Stu\' Dunmeyer','M','00074','018'),
	('00085','Uncle Frank Hillard','M','00075','018'),
	('00086','Professor Marvel','M','00062','016'),
	('00087','The Gatekeeper','M','00062','016'),
	('00088','The Carriage Driver','M','00062','016'),
	('00089','The Guard Who Cries','M','00062','016'),
	('00090','Hunk','M','00063','016'),
	('00091','Zeke','M','00064','016'),
	('00092','Hickory','M','00065','016'),
	('00093','Elmira Gulch','F','00067','016'),
	('00094','The Wicked Witch of the East','F','00067','016'),
	('00095','Batman','M','00076','019'),
	('00096','Bruce Wayne','M','00076','019'),
	('00097','The Joker','M','00019','019'),
	('00098','Jack Napier','M','00019','019'),
	('00099','Vicki Hale','F','00077','019'),
	('00100','Batman','M','00076','020'),
	('00101','Bruce Wayne','M','00076','020'),
	('00102','The Penguin','M','00078','020'),
	('00103','Oswald Cobblepot','M','00078','020'),
	('00104','Catwoman','F','00079','020'),
	('00105','Selina Kyle','F','00079','020'),
	('00106','Batman','M','00080','021'),
	('00107','Bruce Wayne','M','00080','021'),
	('00108','Two-Face','M','00081','021'),
	('00109','Harvey Dent','M','00081','021'),
	('00110','The Riddler','M','00082','021'),
	('00111','Dr. Edward Nygma','M','00082','021'),
	('00112','Dr. Chase Meridian','F','00083','021'),
	('00113','Robin','M','00084','021'),
	('00114','Dick Grayson','M','00084','021'),
	('00115','Sugar','F','00085','021'),
	('00116','Spice','F','00086','021'),
	('00117','Mr. Freeze','M','00056','022'),
	('00118','Dr. Victor Fries','M','00056','022'),
	('00119','Batman','M','00087','022'),
	('00120','Bruce Wayne','M','00087','022'),
	('00121','Robin','M','00084','022'),
	('00122','Dick Grayson','M','00084','022'),
	('00123','Poison Ivy','F','00088','022'),
	('00124','Dr. Pamela Isley','F','00088','022'),
	('00125','Batgirl','F','00089','022'),
	('00126','Barbara Wilson','F','00089','022'),
	('00127','Julie Madison','F','00090','022'),
	('00128','Batman','M','00091','023'),
	('00129','Bruce Wayne','M','00091','023'),
	('00130','Alfred','M','00092','023'),
	('00131','Henri Ducard','M','00093','023'),
	('00132','Rachel Dawes','F','00094','023'),
	('00133','Nikko, the Head Flying Monkey','M','00095','016'),
	('00134','Uncle Henry','M','00096','016'),
	('00135','Wolfgang Amadeus Mozart','M','00097','024'),
	('00136','Antonio Scalieri','M','00098','024'),
	('00137','Constanze Mozart','F','00099','024'),
	('00138','Emperor Joseph II','M','00100','024');

# 16:54:49	INSERT INTO Role VALUES  ('00001','Dorothy Gale','F','00061','016'),  ('00002','The Wizard of Oz','M','00062','016'),  ('00003','The Scarecrow','M','00063','016'),  ('00004','The Cowardly Lion','M','00064','016'),  ('00005','The Tin Man','M','00065','016'),  ('00006','Glinda, the Good Witch of the North','F','00066','016'),  ('00007','The Wicked Witch of the West','F','00067','016'),  ('00008','Auntie Em','F','00068','016'),  ('00009','Toto','M','00069','016'),  ('00010','Gerald O\'Hara','M','00041','009'),  ('00011','Ellen O\'Hara','F','00042','009'),  ('00012','Scarlett O\'Hara','F','00043','009'),  ('00013','Mammy','F','00044','009'),  ('00014','Prissy','F','00045','009'),  ('00015','Rhett Butler','M','00046','009'),  ('00016','Rick Blaine','M','00007','002'),  ('00017','Ilsa Lund (Laszlo)','F','00008','002'),  ('00018','Victor Laszlo','M','00009','002'),  ('00019','Captain Renault','M','00010','002'),  ('00020','Major Strasser','M','00011','002'),  ('00021','Signor Ferrari','M','00012','002'),  ('00022','Ugarte','M','00013','002'),  ('00023','Sam','M','00014','002'),  ('00024','Narrator (voice)','M','00050','011'),  ('00025','Inspector Harry Callahan','M','00015','003'),  ('00026','Lieutenant Al Bressler','M','00016','003'),  ('00027','Inspector Chico Gonzalez','M','00017','003'),  ('00028','Don Vito Corleone','M','00034','008'),  ('00029','Michael Corleone','M','00035','008'),  ('00030','Santino \"Sonny\" Corleone','M','00036','008'),  ('00031','Peter Clemenza','M','00037','008'),  ('00032','Tom Hagen','M','00038','008'),  ('00033','Kay Adams','F','00039','008'),  ('00034','Connie Corleone Rizzi','F','00040','008'),  ('00035','Inspector Harry Callahan','M','00015','013'),  ('00036','Jennifer Spencer','F','00055','013'),  ('00037','The Terminator','M','00056','014'),  ('00038','Kyle Reese','M','00057','014'),  ('00039','Sarah Connor','F','00058','014'),  ('00040','Seth Brundle','M','00027','006'),  ('00041','Veronica Quaife','F','00028','006'),  ('00042','Stathis Borans','M','00029','006'),  ('00043','Ray Kinsella','M','00023','005'),  ('00044','Annie Kinsella','F','00024','005'),  ('00045','Karin Kinsella','F','00025','005'),  ('00046','Shoeless Joe Jackson','M','00026','005'),  ('00047','The Terminator','M','00056','015'),  ('00048','Sarah Connor','F','00058','015'),  ('00049','John Connor','M','00059','015'),  ('00050','T-1000',NULL,'00060','015'),  ('00051','Lieutenant Daniel Kaffee','M','00018','004'),  ('00052','Colonel Nathan R. Jessep','M','00019','004'),  ('00053','Lieutenant Commander JoAnne Galloway','F','00020','004'),  ('00054','Captain Jack Ross','M','00003','004'),  ('00055','Lieutenant Jonathan Kendrick','M','00021','004'),  ('00056','Lieutenant Sam Weinberg','M','00022','004'),  ('00057','Forrest Gump','M','00001','007'),  ('00058','Jenny Curran','F','00030','007'),  ('00059','Lieutenant Dan Taylor','M','00004','007'),  ('00060','Private Benjamin Buford \"Bubba\" Blue','M','00031','007'),  ('00061','Mrs. Gump','F','00032','007'),  ('00062','Young Forrest Gump','M','00033','007'),  ('00063','Jim Lovell','M','00001','001'),  ('00064','Fred Haise','M','00002','001'),  ('00065','Jack Swigert','M','00003','001'),  ('00066','Ken Mattingly','M','00004','001'),  ('00067','Gene Kranz','M','00005','001'),  ('00068','Marilyn Lovell','F','00006','001'),  ('00069','Jerry Maguire','M','00018','010'),  ('00070','Rod Tidwell','M','00047','010'),  ('00071','Dorothy Boyd','F','00048','010'),  ('00072','Avery Bishop','F','00049','010'),  ('00073','Dr. Malcolm Crowe','M','00051','012'),  ('00074','Cole Sear','M','00052','012'),  ('00075','Lynn Sear','F','00053','012'),  ('00076','Anna Crowe','F','00054','012'),  ('00077','Michael Dorsey','M','00070','017'),  ('00078','Dorothy Michaels (Tootsie)','F','00070','017'),  ('00079','Julie Nichols','F','00071','017'),  ('00080','Sandy Lester','F','00072','017'),  ('00081','Daniel Hillard','M','00073','018'),  ('00082','Mrs. Doubtfire','F','00073','018'),  ('00083','Miranda Hillard','F','00032','018'),  ('00084','Stuart \'Stu\' Dunmeyer','M','00074','018'),  ('00085','Uncle Fran...	138 row(s) affected Records: 138  Duplicates: 0  Warnings: 0	0.0030 sec

-- RoleQuote Data Load

INSERT INTO RoleQuote
VALUES
	('00001','0031'),
	('00001','0033'),
	('00001','0036'),
	('00002','0035'),
	('00003','0033'),
	('00005','0033'),
	('00007','0032'),
	('00007','0034'),
	('00007','0038'),
	('00007','0039'),
	('00012','0018'),
	('00012','0020'),
	('00012','0021'),
	('00014','0019'),
	('00015','0022'),
	('00016','0003'),
	('00016','0004'),
	('00016','0005'),
	('00016','0006'),
	('00016','0008'),
	('00017','0002'),
	('00019','0007'),
	('00024','0026'),
	('00025','0009'),
	('00028','0015'),
	('00031','0016'),
	('00031','0017'),
	('00035','0028'),
	('00037','0029'),
	('00041','0012'),
	('00046','0011'),
	('00047','0030'),
	('00052','0010'),
	('00057','0014'),
	('00062','0013'),
	('00063','0001'),
	('00069','0024'),
	('00070','0023'),
	('00071','0025'),
	('00074','0027'),
	('00097','0037'),
	('00136','0042'),
	('00136','0043'),
	('00138','0040'),
	('00138','0041');

# 16:55:02	INSERT INTO RoleQuote VALUES  ('00001','0031'),  ('00001','0033'),  ('00001','0036'),  ('00002','0035'),  ('00003','0033'),  ('00005','0033'),  ('00007','0032'),  ('00007','0034'),  ('00007','0038'),  ('00007','0039'),  ('00012','0018'),  ('00012','0020'),  ('00012','0021'),  ('00014','0019'),  ('00015','0022'),  ('00016','0003'),  ('00016','0004'),  ('00016','0005'),  ('00016','0006'),  ('00016','0008'),  ('00017','0002'),  ('00019','0007'),  ('00024','0026'),  ('00025','0009'),  ('00028','0015'),  ('00031','0016'),  ('00031','0017'),  ('00035','0028'),  ('00037','0029'),  ('00041','0012'),  ('00046','0011'),  ('00047','0030'),  ('00052','0010'),  ('00057','0014'),  ('00062','0013'),  ('00063','0001'),  ('00069','0024'),  ('00070','0023'),  ('00071','0025'),  ('00074','0027'),  ('00097','0037'),  ('00136','0042'),  ('00136','0043'),  ('00138','0040'),  ('00138','0041')	45 row(s) affected Records: 45  Duplicates: 0  Warnings: 0	0.0019 sec

