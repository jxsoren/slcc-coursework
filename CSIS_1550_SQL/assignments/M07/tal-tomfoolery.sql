use TAL;

-- 1. Create a NONGAME table with the structure shown in the Figure below.

CREATE TABLE IF NOT EXISTS NONGAME(
  ITEM_NUM CHAR(4) PRIMARY KEY,
  DESCRIPTION CHAR(30),
  ON_HAND DECIMAL(4, 0),
  CATEGORY CHAR(3),
  PRICE DECIMAL(6, 2)
);

-- 2. Insert into the NONGAME table the item number, description, number of units on hand, category, and unit price from the ITEM table for each item that is not in category GME. 

SELECT CONCAT(
"(",
'"',ITEM_NUM, '"', ', ', 
'"',DESCRIPTION, '"', ', ', 
ON_HAND, ', ', 
'"',CATEGORY, '"', ', ', 
PRICE,
")", ', '
)
FROM ITEM
WHERE CATEGORY != 'GME';

INSERT INTO NONGAME
VALUES 
	("CD33", "WOOD BLOCK SET (48 PIECE)", 36, "TOY", 89.49), 
	("DL51", "CLASSIC RAILWAY SET", 12, "TOY", 107.95), 
	("DR67", "GIANT STAR BRAIN TEASER", 24, "PZL", 31.95), 
	("FD11", "ROCKING HORSE", 8, "TOY", 124.95), 
	("FH24", "PUZZLE GIFT SET", 65, "PZL", 38.95), 
	("KD34", "PENTOMINOES BRAIN TEASER", 60, "PZL", 14.95), 
	("MT03", "ZAUBERKASTEN BRAIN TEASER", 45, "PZL", 45.79), 
	("NL89", "WOOD BLOCK SET (62 PIECE)", 32, "TOY", 119.75), 
	("TW35", "FIRE ENGINE", 30, "TOY", 118.95);

-- 3. In the NONGAME table, change the description of item number DL51 to “Classic Train Set.”

# before record is updated (should be "CLASSIC RAILWAY SET")
select DESCRIPTION from NONGAME where ITEM_NUM = 'DL51';

UPDATE NONGAME
SET DESCRIPTION = 'Classic Train Set.'
WHERE ITEM_NUM = 'DL51';

# after record is updated (should be "Classic Train Set.")
select DESCRIPTION from NONGAME where ITEM_NUM = 'DL51';

-- 4. In the NONGAME table, increase the price of each item in category TOY by two percent. (Hint: Multiply each price by 1.02.)

# before records are updated (should be 89.49,107.95,124.95,119.75,118.95)
select GROUP_CONCAT(PRICE) from NONGAME WHERE CATEGORY = 'TOY' ORDER BY PRICE;

UPDATE NONGAME
SET PRICE = PRICE * 1.02
WHERE CATEGORY = 'TOY';

# after records are updated (should be 91.28,110.11,127.45,122.15,121.33
select GROUP_CONCAT(PRICE) from NONGAME WHERE CATEGORY = 'TOY' ORDER BY PRICE;

-- 5. Add the following item to the NONGAME table: item number: TL92; description: DumpTruck; number of units on hand: 10; category: TOY; and price: 59.95.

# before count (should be 9)
SELECT COUNT(*) FROM NONGAME;

INSERT INTO NONGAME
VALUES ('TL92', 'DumpTruck', 10, 'TOY', 59.95);

# after count (should be 10)
SELECT COUNT(*) FROM NONGAME;

-- 6.  Delete every item in the NONGAME table for which the category is PZL.

# before count (should be 10)
SELECT COUNT(*) FROM NONGAME;

# count that will be affected (should be 4)
SELECT COUNT(*) FROM NONGAME WHERE CATEGORY = 'PZL';

DELETE FROM NONGAME
WHERE CATEGORY = 'PZL';

# after count (should be (10 - 4) = 6)
SELECT COUNT(*) FROM NONGAME;

-- 7.   In the NONGAME table, change the category for item FD11 to null.

# before category (should be "TOY")
SELECT CATEGORY FROM NONGAME WHERE ITEM_NUM = 'FD11';

UPDATE NONGAME
SET CATEGORY = NULL
WHERE ITEM_NUM = 'FD11';

# before category (should be NULL)
SELECT CATEGORY FROM NONGAME WHERE ITEM_NUM = 'FD11';

-- 8. Add a column named ON_HAND_VALUE to the NONGAME table. The on-hand value is a seven-digit number with two decimal places that represents 
-- the product of the number of units on hand and the price. Then set all values of ON_HAND_VALUE to ON_HAND * PRICE.

# before schema change (should result in 'Unknown Column' error)
SELECT ON_HAND_VALUE FROM NONGAME;

ALTER TABLE NONGAME
ADD COLUMN ON_HAND_VALUE DECIMAL(7, 2);

# before value for column is set (they should all be NULL)
SELECT ON_HAND_VALUE FROM NONGAME;

UPDATE NONGAME
SET ON_HAND_VALUE = ON_HAND * PRICE;

# after updated column values (should be 3286.08,1321.32,1019.60,3908.80,599.50,3639.90)
SELECT GROUP_CONCAT(ON_HAND_VALUE) FROM NONGAME ORDER BY ON_HAND_VALUE;

-- 9.  In the NONGAME table, increase the length of the DESCRIPTION column to 40 characters.

# before DESCRIPTION change (should be CHAR(30))
describe NONGAME;

ALTER TABLE NONGAME
MODIFY COLUMN DESCRIPTION CHAR(40);

# before DESCRIPTION change (should be CHAR(40))
describe NONGAME;

-- Once you've completed all 9 steps, you'll need to run (copy and paste) the query below. 
USE TAL; SELECT @i:=0; SELECT @i:=@i+1 AS A,ON_HAND AS B,CATEGORY AS C,ON_HAND_VALUE AS D,PRICE AS E,ITEM_NUM AS F FROM NONGAME ORDER BY DESCRIPTION;

-- Describe NONGAME
DESCRIBE NONGAME;

