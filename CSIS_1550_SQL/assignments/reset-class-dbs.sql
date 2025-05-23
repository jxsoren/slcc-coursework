DROP DATABASE IF EXISTS TAL;
CREATE DATABASE TAL;

USE TAL;

DROP TABLE IF EXISTS CUSTOMER;
CREATE TABLE CUSTOMER (
  CUSTOMER_NUM CHAR(3) NOT NULL,
  CUSTOMER_NAME CHAR(35) NOT NULL,
  STREET CHAR(20) DEFAULT NULL,
  CITY CHAR(15) DEFAULT NULL,
  STATE CHAR(2) DEFAULT NULL,
  POSTAL_CODE CHAR(5) DEFAULT NULL,
  BALANCE DECIMAL(8,2) DEFAULT NULL,
  CREDIT_LIMIT DECIMAL(8,2) DEFAULT NULL,
  REP_NUM CHAR(2) DEFAULT NULL,
  PRIMARY KEY (CUSTOMER_NUM)
);

INSERT INTO CUSTOMER VALUES ('126','TOYS GALORE','28 LAKETON ST.','FULLTON','CA','90085',1210.25,7500.00,'15'),('260','BROOKINGS DIRECT','452 COLUMBUS DR.','GROVE','CA','90092',575.00,10000.00,'30'),('334','THE EVERYTHING SHOP','342 MAGEE ST.','CONGAREE','CA','90097',2345.75,7500.00,'45'),('386','JOHNSON\'S DEPARTMENT STORE','124 MAIN ST.','NORTHFIELD','CA','90098',879.25,7500.00,'30'),('440','GROVE HISTORICAL MUSEUM STORE','3456 CENTRAL AVE.','FULLTON','CA','90085',345.00,5000.00,'45'),('502','CARDS AND MORE','167 HALE ST.','MESA','CA','90104',5025.75,5000.00,'15'),('586','ALMONDTON GENERAL STORE','3345 DEVON AVE.','ALMONDTON','CA','90125',3456.75,15000.00,'45'),('665','CRICKET GIFT SHOP','372 OXFORD ST.','GROVE','CA','90092',678.90,7500.00,'30'),('713','CRESS STORE','12 RISING SUN AVE.','CONGAREE','CA','90097',4234.60,10000.00,'15'),('796','UNIQUE GIFTS','786 PASSMORE ST.','NORTHFIELD','CA','90098',124.75,7500.00,'45'),('824','KLINE\'S','945 GILHAM ST.','MESA','CA','90104',2475.99,15000.00,'30'),('893','ALL SEASON GIFTS','382 WILDWOOD AVE.','FULLTON','CA','90085',935.75,7500.00,'15');

DROP TABLE IF EXISTS ITEM;

CREATE TABLE ITEM (
  ITEM_NUM CHAR(4) NOT NULL,
  DESCRIPTION CHAR(30) DEFAULT NULL,
  ON_HAND DECIMAL(4,0) DEFAULT NULL,
  CATEGORY CHAR(3) DEFAULT NULL,
  STOREHOUSE CHAR(1) DEFAULT NULL,
  PRICE DECIMAL(6,2) DEFAULT NULL,
  PRIMARY KEY (ITEM_NUM)
);


INSERT INTO ITEM VALUES ('AH74','PATIENCE',9,'GME','3',22.99),('BR23','SKITTLES',21,'GME','2',29.99),('CD33','WOOD BLOCK SET (48 PIECE)',36,'TOY','1',89.49),('DL51','CLASSIC RAILWAY SET',12,'TOY','3',107.95),('DR67','GIANT STAR BRAIN TEASER',24,'PZL','2',31.95),('DW23','MANCALA',40,'GME','3',50.00),('FD11','ROCKING HORSE',8,'TOY','3',124.95),('FH24','PUZZLE GIFT SET',65,'PZL','1',38.95),('KA12','CRIBBAGE SET',56,'GME','3',75.00),('KD34','PENTOMINOES BRAIN TEASER',60,'PZL','2',14.95),('KL78','PICK UP STICKS',110,'GME','1',10.95),('MT03','ZAUBERKASTEN BRAIN TEASER',45,'PZL','1',45.79),('NL89','WOOD BLOCK SET (62 PIECE)',32,'TOY','3',119.75),('TR40','TIC TAC TOE',75,'GME','2',13.99),('TW35','FIRE ENGINE',30,'TOY','2',118.95);


DROP TABLE IF EXISTS ORDER_LINE;

CREATE TABLE ORDER_LINE (
  ORDER_NUM CHAR(5) NOT NULL,
  ITEM_NUM CHAR(4) NOT NULL,
  NUM_ORDERED DECIMAL(3,0) DEFAULT NULL,
  QUOTED_PRICE DECIMAL(6,2) DEFAULT NULL,
  PRIMARY KEY (ORDER_NUM,ITEM_NUM)
);

INSERT INTO ORDER_LINE VALUES ('51608','CD33',5,86.99),('51610','KL78',25,10.95),('51610','TR40',10,13.99),('51613','DL51',5,104.95),('51614','FD11',1,124.95),('51617','NL89',4,115.99),('51617','TW35',3,116.95),('51619','FD11',2,121.95),('51623','DR67',5,29.95),('51623','FH24',12,36.95),('51623','KD34',10,13.10),('51625','MT03',8,45.79);

DROP TABLE IF EXISTS ORDERS;

CREATE TABLE ORDERS (
  ORDER_NUM CHAR(5) NOT NULL,
  ORDER_DATE DATE DEFAULT NULL,
  CUSTOMER_NUM CHAR(3) DEFAULT NULL,
  PRIMARY KEY (ORDER_NUM)
);

INSERT INTO ORDERS VALUES ('51608','2015-10-12','126'),('51610','2015-10-12','334'),('51613','2015-10-13','386'),('51614','2015-10-13','260'),('51617','2015-10-15','586'),('51619','2015-10-15','126'),('51623','2015-10-15','586'),('51625','2015-10-16','796');


DROP TABLE IF EXISTS REP;

CREATE TABLE REP (
  REP_NUM CHAR(2) NOT NULL,
  LAST_NAME CHAR(15) DEFAULT NULL,
  FIRST_NAME CHAR(15) DEFAULT NULL,
  STREET CHAR(15) DEFAULT NULL,
  CITY CHAR(15) DEFAULT NULL,
  STATE CHAR(2) DEFAULT NULL,
  POSTAL_CODE CHAR(5) DEFAULT NULL,
  COMMISSION DECIMAL(7,2) DEFAULT NULL,
  RATE DECIMAL(3,2) DEFAULT NULL,
  PRIMARY KEY (REP_NUM)
);

INSERT INTO REP VALUES ('15','CAMPOS','RAFAEL','724 VINCA DR.','GROVE','CA','90092',23457.50,0.06),('30','GRADEY','MEGAN','632 LIATRIS ST.','FULLTON','CA','90085',41317.00,0.08),('45','TIAN','HUI','1785 TYLER AVE.','NORTHFIELD','CA','90098',27789.25,0.06),('60','SEFTON','JANET','267 OAKLEY ST.','CONGAREE','CA','90097',0.00,0.06);

DROP DATABASE IF EXISTS COLONIAL;
CREATE DATABASE COLONIAL;

USE COLONIAL;



DROP TABLE IF EXISTS CUSTOMER;

CREATE TABLE CUSTOMER (
  CUSTOMER_NUM CHAR(4) NOT NULL,
  LAST_NAME CHAR(30) NOT NULL,
  FIRST_NAME CHAR(30) DEFAULT NULL,
  ADDRESS CHAR(35) DEFAULT NULL,
  CITY CHAR(35) DEFAULT NULL,
  STATE CHAR(2) DEFAULT NULL,
  POSTAL_CODE CHAR(5) DEFAULT NULL,
  PHONE CHAR(12) DEFAULT NULL,
  PRIMARY KEY (CUSTOMER_NUM)
);

INSERT INTO CUSTOMER VALUES ('101','NORTHFOLD','LIAM','9 OLD MILL RD.','LONDONDERRY','NH','03053','603-555-7563'),('102','OCEAN','ARNOLD','2332 SOUTH ST. APT 3','SPRINGFIELD','MA','01101','413-555-3212'),('103','KASUMA','SUJATA','132 MAIN ST. #1','EAST HARTFORD','CT','06108','860-555-0703'),('104','GOFF','RYAN','164A SOUTH BEND RD.','LOWELL','MA','01854','781-555-8423'),('105','MCLEAN','KYLE','345 LOWER AVE.','WOLCOTT','NY','14590','585-555-5321'),('106','MORONTOIA','JOSEPH','156 SCHOLAR ST.','JOHNSTON','RI','02919','401-555-4848'),('107','MARCHAND','QUINN','76 CROSS RD.','BATH','NH','03740','603-555-0456'),('108','RULF','USCHI','32 SHEEP STOP ST.','EDINBORO','PA','16412','814-555-5521'),('109','CARON','JEAN LUC','10 GREENFIELD ST.','ROME','ME','04963','207-555-9643'),('110','BERS','MARTHA','65 GRANITE ST.','YORK','NY','14592','585-555-0111'),('112','JONES','LAURA','373 HIGHLAND AVE.','SOMERVILLE','MA','02143','857-555-6258'),('115','VACCARI','ADAM','1282 OCEAN WALK','OCEAN CITY','NJ','08226','609-555-5231'),('116','MURAKAMI','IRIS','7 CHERRY BLOSSOM ST.','WEYMOUTH','MA','02188','617-555-6665'),('119','CHAU','CLEMENT','18 ARK LEDGE LN.','LONDONDERRY','VT','05148','802-555-3096'),('120','GERNOWSKI','SADIE','24 STUMP RD.','ATHENS','ME','04912','207-555-4507'),('121','BRETTON-BORAK','SIAM','10 OLD MAIN ST.','CAMBRIDGE','VT','05444','802-555-3443'),('122','HEFFERSON','ORLAGH','132 SOUTH ST. APT 27','MANCHESTER','NH','03101','603-555-3476'),('123','BARNETT','LARRY','25 STAG RD.','FAIRFIELD','CT','06824','860-555-9876'),('124','BUSA','KAREN','12 FOSTER ST.','SOUTH WINDSOR','CT','06074','857-555-5532'),('125','PETERSON','BECCA','51 FREDRICK ST.','ALBION','NY','14411','585-555-0900'),('126','BROWN','BRIANNE','154 CENTRAL ST.','VERNON','CT','06066','860-555-3234');

DROP TABLE IF EXISTS GUIDE;
CREATE TABLE GUIDE (
  GUIDE_NUM CHAR(4) NOT NULL,
  LAST_NAME CHAR(15) DEFAULT NULL,
  FIRST_NAME CHAR(15) DEFAULT NULL,
  ADDRESS CHAR(25) DEFAULT NULL,
  CITY CHAR(25) DEFAULT NULL,
  STATE CHAR(2) DEFAULT NULL,
  POSTAL_CODE CHAR(5) DEFAULT NULL,
  PHONE_NUM CHAR(12) DEFAULT NULL,
  HIRE_DATE DATE DEFAULT NULL,
  PRIMARY KEY (GUIDE_NUM)
);

INSERT INTO GUIDE VALUES ('AM01','ABRAMS','MILES','54 QUEST AVE.','WILLIAMSBURG','MA','01096','617-555-6032','2012-06-03'),('BR01','BOYERS','RITA','140 OAKTON RD.','JAFFREY','NH','03452','603-555-2134','2012-03-04'),('DH01','DEVON','HARLEY','25 OLD RANCH RD.','SUNDERLAND','MA','01375','781-555-7767','2012-01-08'),('GZ01','GREGORY','ZACH','7 MOOSE HEAD RD.','DUMMER','NH','03588','603-555-8765','2012-11-04'),('KS01','KILEY','SUSAN','943 OAKTON RD.','JAFFREY','NH','03452','603-555-1230','2013-04-08'),('KS02','KELLY','SAM','9 CONGAREE AVE.','FRACONIA','NH','03580','603-555-0003','2013-06-10'),('MR01','MARSTON','RAY','24 SHENANDOAH RD.','SPRINGFIELD','MA','01101','781-555-2323','2015-09-14'),('RH01','ROWAN','HAL','12 HEATHER RD.','MOUNT DESERT','ME','04660','207-555-9009','2014-06-02'),('SL01','STEVENS','LORI','15 RIVERTON RD.','COVENTRY','VT','05825','802-555-3339','2014-09-05'),('UG01','UNSER','GLORY','342 PINEVIEW ST.','DANBURY','CT','06810','203-555-8534','2015-02-02');


DROP TABLE IF EXISTS RESERVATION;
CREATE TABLE RESERVATION (
  RESERVATION_ID CHAR(7) NOT NULL,
  TRIP_ID DECIMAL(3,0) DEFAULT NULL,
  TRIP_DATE DATE DEFAULT NULL,
  NUM_PERSONS DECIMAL(3,0) DEFAULT NULL,
  TRIP_PRICE DECIMAL(6,2) DEFAULT NULL,
  OTHER_FEES DECIMAL(6,2) DEFAULT NULL,
  CUSTOMER_NUM CHAR(4) DEFAULT NULL,
  PRIMARY KEY (RESERVATION_ID)
);

INSERT INTO RESERVATION VALUES ('1600001',40,'2016-03-26',2,55.00,0.00,'101'),('1600002',21,'2016-06-08',2,95.00,0.00,'101'),('1600003',28,'2016-09-12',1,35.00,0.00,'103'),('1600004',26,'2016-10-16',4,45.00,15.00,'104'),('1600005',39,'2016-06-25',5,55.00,0.00,'105'),('1600006',32,'2016-06-18',1,80.00,20.00,'106'),('1600007',22,'2016-07-09',8,75.00,10.00,'107'),('1600008',28,'2016-09-12',2,35.00,0.00,'108'),('1600009',38,'2016-09-11',2,90.00,40.00,'109'),('1600010',2,'2016-05-14',3,25.00,0.00,'102'),('1600011',3,'2016-09-15',3,25.00,0.00,'102'),('1600012',1,'2016-06-12',4,15.00,0.00,'115'),('1600013',8,'2016-07-09',1,20.00,5.00,'116'),('1600014',12,'2016-10-01',2,40.00,5.00,'119'),('1600015',10,'2016-07-23',1,20.00,0.00,'120'),('1600016',11,'2016-07-23',6,75.00,15.00,'121'),('1600017',39,'2016-06-18',3,20.00,5.00,'122'),('1600018',38,'2016-09-18',4,85.00,15.00,'126'),('1600019',25,'2016-08-29',2,110.00,25.00,'124'),('1600020',28,'2016-08-27',2,35.00,10.00,'124'),('1600021',32,'2016-06-11',3,90.00,20.00,'112'),('1600022',21,'2016-06-08',1,95.00,25.00,'119'),('1600024',38,'2016-09-11',1,70.00,30.00,'121'),('1600025',38,'2016-09-11',2,70.00,45.00,'125'),('1600026',12,'2016-10-01',2,40.00,0.00,'126'),('1600029',4,'2016-09-19',4,105.00,25.00,'120'),('1600030',15,'2016-07-25',6,60.00,15.00,'104');

DROP TABLE IF EXISTS TRIP;

CREATE TABLE TRIP (
  TRIP_ID DECIMAL(3,0) NOT NULL,
  TRIP_NAME CHAR(75) DEFAULT NULL,
  START_LOCATION CHAR(50) DEFAULT NULL,
  STATE CHAR(2) DEFAULT NULL,
  DISTANCE DECIMAL(4,0) DEFAULT NULL,
  MAX_GRP_SIZE DECIMAL(4,0) DEFAULT NULL,
  TYPE CHAR(20) DEFAULT NULL,
  SEASON CHAR(20) DEFAULT NULL,
  PRIMARY KEY (TRIP_ID)
);
INSERT INTO TRIP VALUES (1,'ARETHUSA FALLS','HARTS LOCATION','NH',5,10,'HIKING','SUMMER'),(2,'MT ASCUTNEY - NORTH PEAK','WEATHERSFIELD','VT',5,6,'HIKING','LATE SPRING'),(3,'MT ASCUTNEY - WEST PEAK','WEATHERSFIELD','VT',6,10,'HIKING','EARLY FALL'),(4,'BRADBURY MOUNTAIN RIDE','LEWISTON-AUBURN','ME',25,8,'BIKING','EARLY FALL'),(5,'BALDPATE MOUNTAIN','NORTH NEWRY','ME',6,10,'HIKING','LATE SPRING'),(6,'BLUEBERRY MOUNTAIN','BATCHELDERS GRANT','ME',8,8,'HIKING','EARLY FALL'),(7,'BLOOMFIELD - MAIDSTONE','BLOOMFIELD','CT',10,6,'PADDLING','LATE SPRING'),(8,'BLACK POND','LINCOLN','NH',8,12,'HIKING','SUMMER'),(9,'BIG ROCK CAVE','TAMWORTH','NH',6,10,'HIKING','SUMMER'),(10,'MT. CARDIGAN - FIRESCREW','ORANGE','NH',7,8,'HIKING','SUMMER'),(11,'CHOCORUA LAKE TOUR','TAMWORTH','NH',12,15,'PADDLING','SUMMER'),(12,'CADILLAC MOUNTAIN RIDE','BAR HARBOR','ME',8,16,'BIKING','EARLY FALL'),(13,'CADILLAC MOUNTAIN','BAR HARBOR','ME',7,8,'HIKING','LATE SPRING'),(14,'CANNON MTN','FRANCONIA','NH',6,6,'HIKING','EARLY FALL'),(15,'CRAWFORD PATH PRESIDENTIALS HIKE','CRAWFORD NOTCH','NH',16,4,'HIKING','SUMMER'),(16,'CHERRY POND','WHITEFIELD','NH',6,16,'HIKING','SPRING'),(17,'HUGUENOT HEAD HIKE','BAR HARBOR','ME',5,10,'HIKING','EARLY FALL'),(18,'LOW BALD SPOT HIKE','PINKAM NOTCH','NH',8,6,'HIKING','EARLY FALL'),(19,'MASON\'S FARM','NORTH STRATFORD','CT',12,7,'PADDLING','LATE SPRING'),(20,'LAKE MEPHREMAGOG TOUR','NEWPORT','VT',8,15,'PADDLING','LATE SPRING'),(21,'LONG POND','RUTLAND','MA',8,12,'HIKING','SUMMER'),(22,'LONG POND TOUR','GREENVILLE','ME',12,10,'PADDLING','SUMMER'),(23,'LOWER POND TOUR','POLAND','ME',8,15,'PADDLING','LATE SPRING'),(24,'MT ADAMS','RANDOLPH','NH',9,6,'HIKING','SUMMER'),(25,'MOUNT BATTIE RIDE','CAMDEN','ME',20,8,'BIKING','EARLY FALL'),(26,'MOUNT CARDIGAN HIKE','CARDIGAN','NH',4,16,'HIKING','LATE FALL'),(27,'MT. CHOCORUA','ALBANY','NH',6,10,'HIKING','SPRING'),(28,'MOUNT GARFIELD HIKE','WOODSTOCK','NH',5,10,'HIKING','EARLY FALL'),(29,'METACOMET-MONADNOCK TRAIL HIKE','PELHAM','MA',10,12,'HIKING','LATE SPRING'),(30,'MCLENNAN RESERVATION HIKE','TYRINGHAM','MA',6,16,'HIKING','SUMMER'),(31,'MISSISQUOI RIVER - VT','LOWELL','VT',12,10,'PADDLING','SUMMER'),(32,'NORTHERN FOREST CANOE TRAIL','STARK','NH',15,10,'PADDLING','SUMMER'),(33,'PARK LOOP RIDE','MOUNT DESERT ISLAND','ME',27,8,'BIKING','LATE SPRING'),(34,'PONTOOK RESERVOIR TOUR','DUMMER','NH',15,14,'PADDLING','LATE SPRING'),(35,'PISGAH STATE PARK RIDE','NORTHBOROUGH','NH',12,10,'BIKING','SUMMER'),(36,'PONDICHERRY TRAIL RIDE','WHITE MOUNTAINS','NH',15,16,'BIKING','LATE SPRING'),(37,'SEAL BEACH HARBOR','BAR HARBOR','ME',5,16,'HIKING','EARLY SPRING'),(38,'SAWYER RIVER RIDE','MOUNT CARRIGAIN','NH',10,18,'BIKING','EARLY FALL'),(39,'WELCH AND DICKEY MOUNTAINS HIKE','THORTON','NH',5,10,'HIKING','SUMMER'),(40,'WACHUSETT MOUNTAIN','PRINCETON','MA',8,8,'HIKING','EARLY SPRING'),(41,'WESTFIELD RIVER LOOP','FORT FAIRFIELD','ME',20,10,'BIKING','LATE SPRING');

DROP TABLE IF EXISTS TRIP_GUIDES;

CREATE TABLE TRIP_GUIDES (
  TRIP_ID DECIMAL(3,0) NOT NULL,
  GUIDE_NUM CHAR(4) NOT NULL,
  PRIMARY KEY (TRIP_ID,GUIDE_NUM)
);
INSERT INTO TRIP_GUIDES VALUES (1,'GZ01'),(1,'RH01'),(2,'AM01'),(2,'SL01'),(3,'SL01'),(4,'BR01'),(4,'GZ01'),(5,'KS01'),(5,'UG01'),(6,'RH01'),(7,'SL01'),(8,'BR01'),(9,'BR01'),(10,'GZ01'),(11,'DH01'),(11,'KS01'),(11,'UG01'),(12,'BR01'),(13,'RH01'),(14,'KS02'),(15,'GZ01'),(16,'KS02'),(17,'RH01'),(18,'KS02'),(19,'DH01'),(20,'SL01'),(21,'AM01'),(22,'UG01'),(23,'DH01'),(23,'SL01'),(24,'BR01'),(25,'BR01'),(26,'GZ01'),(27,'GZ01'),(28,'BR01'),(29,'DH01'),(30,'AM01'),(31,'SL01'),(32,'KS01'),(33,'UG01'),(34,'KS01'),(35,'GZ01'),(36,'KS02'),(37,'RH01'),(38,'KS02'),(39,'BR01'),(40,'DH01'),(41,'BR01');

DROP DATABASE IF EXISTS SOLMARIS;
CREATE DATABASE SOLMARIS;

USE SOLMARIS;

DROP TABLE IF EXISTS CONDO_UNIT;
CREATE TABLE CONDO_UNIT (
  CONDO_ID DECIMAL(4,0) NOT NULL,
  LOCATION_NUM DECIMAL(2,0) DEFAULT NULL,
  UNIT_NUM CHAR(3) DEFAULT NULL,
  SQR_FT DECIMAL(5,0) DEFAULT NULL,
  BDRMS DECIMAL(2,0) DEFAULT NULL,
  BATHS DECIMAL(2,0) DEFAULT NULL,
  CONDO_FEE DECIMAL(6,2) DEFAULT NULL,
  OWNER_NUM CHAR(5) DEFAULT NULL,
  PRIMARY KEY (CONDO_ID)
);
INSERT INTO CONDO_UNIT VALUES (1,1,'102',675,1,1,475.00,'AD057'),(2,1,'201',1030,2,1,550.00,'EL025'),(3,1,'306',1575,3,2,625.00,'AN175'),(4,1,'204',1164,2,2,575.00,'BL720'),(5,1,'405',1575,3,2,625.00,'FE182'),(6,1,'401',1030,2,2,550.00,'KE122'),(7,1,'502',745,1,1,490.00,'JU092'),(8,1,'503',1680,3,3,670.00,'RO123'),(9,2,'A03',725,1,1,190.00,'TR222'),(10,2,'A01',1084,2,1,235.00,'NO225'),(11,2,'B01',1084,2,2,250.00,'SM072'),(12,2,'C01',750,1,1,190.00,'AN175'),(13,2,'C02',1245,2,2,250.00,'WS032'),(14,2,'C06',1540,3,2,300.00,'RO123');

DROP TABLE IF EXISTS LOCATION;
CREATE TABLE LOCATION (
  LOCATION_NUM DECIMAL(2,0) NOT NULL,
  LOCATION_NAME CHAR(25) DEFAULT NULL,
  ADDRESS CHAR(25) DEFAULT NULL,
  CITY CHAR(25) DEFAULT NULL,
  STATE CHAR(2) DEFAULT NULL,
  POSTAL_CODE CHAR(5) DEFAULT NULL,
  PRIMARY KEY (LOCATION_NUM)
);
INSERT INTO LOCATION VALUES (1,'SOLMARIS OCEAN','100 OCEAN AVE.','BOWTON','FL','31313'),(2,'SOLMARIS BAYSIDE','405 BAYSIDE BLVD.','GLANDER BAY','FL','31044');

DROP TABLE IF EXISTS OWNER;
CREATE TABLE OWNER (
  OWNER_NUM CHAR(5) NOT NULL,
  LAST_NAME CHAR(25) DEFAULT NULL,
  FIRST_NAME CHAR(25) DEFAULT NULL,
  ADDRESS CHAR(25) DEFAULT NULL,
  CITY CHAR(25) DEFAULT NULL,
  STATE CHAR(2) DEFAULT NULL,
  POSTAL_CODE CHAR(5) DEFAULT NULL,
  PRIMARY KEY (OWNER_NUM)
);
INSERT INTO OWNER VALUES ('AD057','ADNEY','BRUCE AND JEAN','100 OCEAN AVE.','BOWTON','FL','31313'),('AN175','ANDERSON','BILL','18 WILCOX ST.','BRUNSWICK','GA','31522'),('BL720','BLAKE','JACK','2672 CONDOR ST.','MILLS','SC','29707'),('EL025','ELEND','BILL AND SANDY','100 OCEAN AVE.','BOWTON','FL','31313'),('FE182','FEENSTRA','DANIEL','7822 COVENTRY DR.','RIVARD','FL','31062'),('JU092','JUAREZ','MARIA','892 OAK ST.','KALEVA','FL','31521'),('KE122','KELLY','ALYSSA','527 WATERS ST.','NORTON','MI','49441'),('NO225','NORTON','PETER AND CAITLIN','281 LAKEWOOD AVE.','LAWNDALE','PA','19111'),('RO123','ROBINSON','MIKE AND JANE','900 SPRING LAKE DR.','SPRINGS','MI','49456'),('SM072','SMELTZ','JIM AND CATHY','922 GARLAND DR.','LEWISTON','FL','32765'),('TR222','TRENT','MICHAEL','405 BAYSIDE BLVD.','GLANDER BAY','FL','31044'),('WS032','WILSON','HENRY AND KAREN','25 NICHOLS ST.','LEWISTON','FL','32765');

DROP TABLE IF EXISTS SERVICE_CATEGORY;

CREATE TABLE SERVICE_CATEGORY (
  CATEGORY_NUM DECIMAL(4,0) NOT NULL,
  CATEGORY_DESCRIPTION CHAR(35) DEFAULT NULL,
  PRIMARY KEY (CATEGORY_NUM)
);
INSERT INTO SERVICE_CATEGORY VALUES (1,'PLUMBING'),(2,'HEATING/AIR CONDITIONING'),(3,'PAINTING'),(4,'ELECTRICAL SYSTEMS'),(5,'CARPENTRY'),(6,'JANITORIAL');

DROP TABLE IF EXISTS SERVICE_REQUEST;

CREATE TABLE SERVICE_REQUEST (
  SERVICE_ID DECIMAL(4,0) NOT NULL,
  CONDO_ID DECIMAL(4,0) DEFAULT NULL,
  CATEGORY_NUM DECIMAL(4,0) DEFAULT NULL,
  DESCRIPTION CHAR(255) DEFAULT NULL,
  STATUS CHAR(255) DEFAULT NULL,
  EST_HOURS DECIMAL(4,2) DEFAULT NULL,
  SPENT_HOURS DECIMAL(4,2) DEFAULT NULL,
  NEXT_SERVICE_DATE DATE DEFAULT NULL,
  PRIMARY KEY (SERVICE_ID)
);
INSERT INTO SERVICE_REQUEST VALUES (1,2,1,'BACK WALL IN PANTRY HAS MOLD INDICATING WATER SEEPAGE. DIAGNOSE AND REPAIR.','SERVICE REP HAS VERIFIED THE PROBLEM. PLUMBING CONTRACTOR HAS BEEN CALLED.',4.00,2.00,'2015-10-12'),(2,5,2,'AIR CONDITIONING DOESNÆT COOL.','SERVICE REP HAS VERIFIED PROBLEM. AIR CONDITIONING CONTRACTOR HAS BEEN CALLED.',3.00,1.00,'2015-10-12'),(3,4,6,'HARDWOOD FLOORS MUST BE REFINISHED.','SERVICE CALL HAS BEEN SCHEDULED.',8.00,0.00,'2015-10-16'),(4,1,4,'SWITCHES IN KITCHEN AND ADJOINING DINING ROOM ARE REVERSED.','OPEN',1.00,0.00,'2015-10-13'),(5,2,5,'MOLDING IN PANTRY MUST BE REPLACED.','CANNOT SCHEDULE UNTIL WATER LEAK IS CORRECTED.',2.00,0.00,NULL),(6,14,3,'UNIT NEEDS TO BE REPAINTED DUE TO PREVIOUS TENANT DAMAGE.','SCHEDULED',7.00,0.00,'2015-10-19'),(7,11,4,'TENANT COMPLAINED THAT USING MICROWAVE CAUSED SHORT CIRCUITS ON TWO OCCASIONS.','SERVICE REP UNABLE TO DUPLICATE PROBLEM. TENANT TO NOTIFY CONDO MANAGEMENT IF PROBLEM RECURS.',1.00,1.00,NULL),(8,9,3,'KITCHEN MUST BE REPAINTED. WALLS DISCOLORED DUE TO KITCHEN FIRE.','SCHEDULED',5.00,0.00,'2015-10-16'),(9,7,6,'SHAMPOO ALL CARPETS.','OPEN',5.00,0.00,'2015-10-19'),(10,9,5,'REPAIR WINDOW SILLS.','SCHEDULED',4.00,0.00,'2015-10-20');

SHOW DATABASES;
USE TAL;

