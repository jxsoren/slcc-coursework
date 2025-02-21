Instructions:

Create a database called `ALEXAMARA`

Create the 5 `ALEXAMARA` tables with the names shown below:

    MARINA
    MARINA_SLIP
    OWNER
    SERVICE_CATEGORY
    SERVICE_REQUEST

It should look as follows:

```
MARINA
+------------+----------+------+-----+---------+-------+
| Field      | Type     | Null | Key | Default | Extra |
+------------+----------+------+-----+---------+-------+
| MARINA_NUM | char(4)  | NO   | PRI | NULL    |       |
| NAME       | char(20) | NO   |     | NULL    |       |
| ADDRESS    | char(15) | YES  |     | NULL    |       |
| CITY       | char(15) | YES  |     | NULL    |       |
| STATE      | char(2)  | YES  |     | NULL    |       |
| ZIP        | char(5)  | YES  |     | NULL    |       |
+------------+----------+------+-----+---------+-------+
6 rows in set (0.007 sec)

MARINA_SLIP
+------------+--------------+------+-----+---------+-------+
| Field      | Type         | Null | Key | Default | Extra |
+------------+--------------+------+-----+---------+-------+
| SLIP_ID    | decimal(4,0) | NO   | PRI | NULL    |       |
| MARINA_NUM | char(4)      | YES  |     | NULL    |       |
| SLIP_NUM   | char(4)      | YES  |     | NULL    |       |
| LENGTH     | decimal(4,0) | YES  |     | NULL    |       |
| RENTAL_FEE | decimal(8,2) | YES  |     | NULL    |       |
| BOAT_NAME  | char(50)     | YES  |     | NULL    |       |
| BOAT_TYPE  | char(50)     | YES  |     | NULL    |       |
| OWNER_NUM  | char(4)      | YES  |     | NULL    |       |
+------------+--------------+------+-----+---------+-------+
8 rows in set (0.006 sec)

OWNER
+------------+----------+------+-----+---------+-------+
| Field      | Type     | Null | Key | Default | Extra |
+------------+----------+------+-----+---------+-------+
| OWNER_NUM  | char(4)  | NO   | PRI | NULL    |       |
| LAST_NAME  | char(50) | YES  |     | NULL    |       |
| FIRST_NAME | char(20) | YES  |     | NULL    |       |
| ADDRESS    | char(15) | YES  |     | NULL    |       |
| CITY       | char(15) | YES  |     | NULL    |       |
| STATE      | char(2)  | YES  |     | NULL    |       |
| ZIP        | char(5)  | YES  |     | NULL    |       |
+------------+----------+------+-----+---------+-------+
7 rows in set (0.009 sec)

SERVICE_CATEGORY
+----------------------+--------------+------+-----+---------+-------+
| Field                | Type         | Null | Key | Default | Extra |
+----------------------+--------------+------+-----+---------+-------+
| CATEGORY_NUM         | decimal(4,0) | NO   | PRI | NULL    |       |
| CATEGORY_DESCRIPTION | char(255)    | YES  |     | NULL    |       |
+----------------------+--------------+------+-----+---------+-------+
2 rows in set (0.007 sec)

SERVICE_REQUEST
+-------------------+--------------+------+-----+---------+-------+
| Field             | Type         | Null | Key | Default | Extra |
+-------------------+--------------+------+-----+---------+-------+
| SERVICE_ID        | decimal(4,0) | NO   | PRI | NULL    |       |
| SLIP_ID           | decimal(4,0) | YES  |     | NULL    |       |
| CATEGORY_NUM      | decimal(4,0) | YES  |     | NULL    |       |
| DESCRIPTION       | char(255)    | YES  |     | NULL    |       |
| STATUS            | char(255)    | YES  |     | NULL    |       |
| EST_HOURS         | decimal(4,2) | YES  |     | NULL    |       |
| SPENT_HOURS       | decimal(4,2) | YES  |     | NULL    |       |
| NEXT_SERVICE_DATE | date         | YES  |     | NULL    |       |
+-------------------+--------------+------+-----+---------+-------+
8 rows in set (0.006 sec)
```
