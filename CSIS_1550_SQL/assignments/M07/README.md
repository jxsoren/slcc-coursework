Read This First

 

 TAL Distributors:  Do the Exercises  1 through 9.

      Create a NONGAME table with the structure shown in the Figure below.

Column 	Type 	Length 	Decimal Places 	Nulls Allowed? 	Description
ITEM_NUM 	CHAR 	4 		NO 	Item number (Primary key)
DESCRIPTION 	CHAR 	30 			Item description
ON_HAND 	DECIMAL 	4 	0 		Number of units on hand
CATEGORY 	CHAR 	3 			Item category
PRICE 	DECIMAL 	6 	2 		Unit price

2. Insert into the NONGAME table the item number, description, number of units on hand, category, and unit price from the ITEM table for each item that is not in category GME.
# Read This First

## TAL Distributors: Do the Exercises 1 through 9

1. Create a NONGAME table with the structure shown in the Figure below.

| Column | Type | Length | Decimal Places | Nulls Allowed? | Description |
|--------|------|--------|---------------|----------------|-------------|
| ITEM_NUM | CHAR | 4 | | NO | Item number (Primary key) |
| DESCRIPTION | CHAR | 30 | | | Item description |
| ON_HAND | DECIMAL | 4 | 0 | | Number of units on hand |
| CATEGORY | CHAR | 3 | | | Item category |
| PRICE | DECIMAL | 6 | 2 | | Unit price |

2. Insert into the NONGAME table the item number, description, number of units on hand, category, and unit price from the ITEM table for each item that is not in category GME.

3. In the NONGAME table, change the description of item number DL51 to "Classic Train Set."

4. In the NONGAME table, increase the price of each item in category TOY by two percent. (Hint: Multiply each price by 1.02.)

5. Add the following item to the NONGAME table: item number: TL92; description: DumpTruck; number of units on hand: 10; category: TOY; and price: 59.95.

6. Delete every item in the NONGAME table for which the category is PZL.

7. In the NONGAME table, change the category for item FD11 to null.

8. Add a column named ON_HAND_VALUE to the NONGAME table. The on-hand value is a seven-digit number with two decimal places that represents the product of the number of units on hand and the price. Then set all values of ON_HAND_VALUE to ON_HAND * PRICE.

9. In the NONGAME table, increase the length of the DESCRIPTION column to 40 characters.

Once you've completed all 9 steps, you'll need to run (copy and paste) the query below.
Then answer the assignment questions based on the query results.

```sql
USE TAL; 
SELECT @i:=0; 
SELECT @i:=@i+1 AS A, ON_HAND AS B, CATEGORY AS C, ON_HAND_VALUE AS D, PRICE AS E, ITEM_NUM AS F 
FROM NONGAME 
ORDER BY DESCRIPTION;
```

