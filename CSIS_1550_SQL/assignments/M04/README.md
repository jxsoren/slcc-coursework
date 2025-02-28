# ALEXAMARA Database Assignment

## Instructions

Using MySQL INSERT statements, add ALL of the records to all 5 of the ALEXAMARA Database Tables.
- Use the Records PDF to see what data needs to be inserted. 
- It's a total of 46 records.

When you are done, run the command below (copy and paste the entire thing into MySQL), and submit a screenshot of the results.

```sql
USE ALEXAMARA;
SELECT CONCAT("MARINA: ", COUNT(*)) AS TAL FROM MARINA 
UNION SELECT CONCAT("MARINA_SLIP: ", COUNT(*)) FROM MARINA_SLIP 
UNION SELECT CONCAT("OWNER: ", COUNT(*)) FROM OWNER 
UNION SELECT CONCAT("SERVICE_CATEGORY: ", COUNT(*)) FROM SERVICE_CATEGORY 
UNION SELECT CONCAT("SERVICE_REQUEST: ", COUNT(*)) FROM SERVICE_REQUEST;
```

