CREATE TABLE `` (
	`User_ID` INT(10) NOT NULL AUTO_INCREMENT,
	`Meno` VARCHAR(50) NULL DEFAULT NULL,
	`Priezvisko` VARCHAR(50) NULL DEFAULT NULL,
	`TelCislo` INT(11) NULL,
	`IDRegister` INT(20) NULL,
	`CasVytvorenia` TIMESTAMP NULL,
	PRIMARY KEY (`User_ID`)
)
COLLATE='utf8mb4_general_ci'
;