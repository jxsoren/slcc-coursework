USE ALEXAMARA;

-- MARINA --
INSERT INTO MARINA
	(MARINA_NUM, NAME, ADDRESS, CITY, STATE, ZIP) 
VALUES
	(1, 'Alexamara East', '108 2nd Ave.', 'Brinman', 'FL', '32273'),
    (2, 'Alexamara Central', '283 Branston', 'W. Brinman', 'FL', '32274')
;

-- MARINA_SLIP --
INSERT INTO MARINA_SLIP
	(SLIP_ID ,MARINA_NUM, SLIP_NUM, LENGTH, RENTAL_FEE, BOAT_NAME, BOAT_TYPE, OWNER_NUM)
VALUES 
	(1, '1', 'A1', 40.00, 3800.00, 'Anderson II', 'Sprite 4000', 'AN75'),
    (2, '1', 'A2', 40.00, 3800.00, 'Our Toy', 'Ray 4025', 'EL25'),
    (3, '1', 'A3', 40.00, 3600.00, 'Escape', 'Sprite 4000', 'KE22'),
    (4, '1', 'B1', 30.00, 2400.00, 'Gypsy', 'Dolphin 28', 'JU92'),
    (5, '1', 'B2', 30.00, 2600.00, 'Anderson III', 'Sprite 3000', 'AN75'),
    (6, '2', '1', 25.00, 1800.00, 'Bravo', 'Dolphin 25', 'AD57'),
    (7, '2', '2', 25.00, 1800.00, 'Chinook', ' Dolphin 22', 'FE82'),
    (8, '2', '3', 25.00, 2000.00, 'Listy', ' Dolphin 25', 'SM72'),
    (9, '2', '4', 30.00, 2500.00, 'Mermaid', ' Dolphin 28', 'BL72'),
    (10, '2', '5', 40.00, 4200.00, 'Axxon II', ' Dolphin 40', 'NO27'),
    (11, '2', '6', 40.00, 4200.00, 'Karvel', 'Ray 4025', 'TR72')
;

-- OWNER --
INSERT INTO OWNER
	(OWNER_NUM, LAST_NAME, FIRST_NAME, ADDRESS, CITY, STATE, ZIP)
VALUES 
	('AD57','Adney','Bruce and Jean','208 Citrus','Bowton','FL','31313'),
	('AN75','Anderson','Bill','18 Wilcox','Glander Bay','FL','31044'),
	('BL72','Blake','Mary','2672 Commodore','Bowton','FL','31313'),
	('EL25','Elend','Sandy and Bill','462 Riverside','Rivard','FL','31062'),
	('FE82','Feenstra','Daniel','7822 Coventry','Kaleva','FL','32521'),
	('JU92','Juarez','Maria','8922 Oak','Rivard','FL','31062'),
	('KE22','Kelly','Alyssa','5271 Waters','Bowton','FL','31313'),
	('NO27','Norton','Peter','2811 Lakewood','Lewiston','FL','32765'),
	('SM72','Smeltz','Becky and Dave','922 Garland','Glander Bay','FL','31044'),
	('TR72','Trent','Ashton','922 Crest','Bay Shores','FL','30992')
;

-- SERVICE_CATEGORY --
INSERT INTO SERVICE_CATEGORY
	(CATEGORY_NUM, CATEGORY_DESCRIPTION)
VALUES 
		(1, 'Routine engine maintenance'),
        (2, 'Engine repair'),
        (3, 'Air conditioning'),
        (4, 'Electrical systems'),
        (5, 'Fiberglass repair'),
        (6, 'Canvas installation '),
        (7, 'Canvas repair'),
        (8, 'Electronic systems (radar, GPS, autopilots, etc.)')
;

-- SERVICE_REQUEST --
INSERT INTO SERVICE_REQUEST
	(SERVICE_ID, SLIP_ID, CATEGORY_NUM, EST_HOURS, SPENT_HOURS, NEXT_SERVICE_DATE, DESCRIPTION, STATUS)
VALUES
	(1, 1, 3, 4.00, 2.00, '2007-07-12', 'Air conditioner periodically stops with code indicating low coolant level. Diagnose and repair.', 'Technician has verified the problem. Air conditioning specialist has been called.'),
	(2, 5, 4, 2.00, 0.00, '2007-07-12', 'Fuse on port motor blown on two occasions. Diagnose and repair.', 'Open'),
	(3, 4, 1, 1.00, 0.00, '2007-07-16', 'Oil change and general routine maintenance (check fluid levels, clean sea strainers etc.).', 'Service call has been scheduled.'),
	(4, 1, 2, 2.00, 0.00, '2007-07-13', 'Engine oil level has been dropping drastically. Diagnose and repair.', 'Open'),
	(5, 3, 5, 4.00, 2.00, '2007-07-13', 'Open pockets at base of two stantions.', 'Technician has completed the initial filling of the open pockets. Will complete the job after the initial fill has had sufficient time to dry.'),
	(6, 11, 4, 3.00, 0.00, NULL, 'Electric-flush system periodically stops functioning. Diagnose and repair.', 'Open'),
	(7, 6, 2, 2.00, 0.00, '2007-07-13', 'Engine overheating. Loss of coolant. Diagnose and repair.', 'Open'),
	(8, 6, 2, 4.00, 1.00, '2007-07-17', 'Heat exchanger not operating correctly.', 'Technician has determined that the exchanger is faulty. New exchanger has been ordered.'),
	(9, 7, 6, 8.00, 0.00, '2007-07-16', 'Canvas severely damaged in windstorm. Order and install new canvas.', 'Open'),
	(10, 2, 8, 7.00, 0.00, '2007-07-17', 'Install new GPS and chart plotter.', 'Scheduled'),
	(11, 2, 3, 1.00, 1.00, NULL, 'Air conditioning unit shuts down with HHH showing on the control panel.', 'Technician not able to replicate the problem. Air conditioning unit ran fine through multiple tests. Owner to notify technician if the problem recurs.'),
	(12, 4, 8, 2.00, 0.00, '2007-07-16', 'Both speed and depth readings on data unit are significantly less than the owner thinks they should be.', 'Technician has scheduled appointment with owner to attempt to verify the problem.'),
	(13, 8, 2, 5.00, 2.00, '2007-07-12', 'Customer describes engine as making a clattering sound.', 'Technician suspects problem with either propeller or shaft and has scheduled the boat to be pulled from the water for further investigation.'),
	(14, 7, 5, 6.00, 0.00, '2007-07-13', 'Owner accident caused damage to forward portion of port side.', 'Technician has scheduled repair.'),
	(15, 11, 7, 8.00, 3.00, '2007-07-17', 'Canvas leaks around zippers in heavy rain. Install overlap around zippers to prevent leaks.', 'Overlap has been created. Installation has been scheduled.')
;

-- Verification Query --
USE ALEXAMARA;
SELECT CONCAT("MARINA: ", COUNT(*)) AS TAL FROM MARINA 
UNION SELECT CONCAT("MARINA_SLIP: ", COUNT(*)) FROM MARINA_SLIP 
UNION SELECT CONCAT("OWNER: ", COUNT(*)) FROM OWNER 
UNION SELECT CONCAT("SERVICE_CATEGORY: ", COUNT(*)) FROM SERVICE_CATEGORY 
UNION SELECT CONCAT("SERVICE_REQUEST: ", COUNT(*)) FROM SERVICE_REQUEST;
