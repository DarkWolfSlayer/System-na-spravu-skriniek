CREATE DATABASE systemnaspravuskriniek;
USE systemnaspravuskriniek;
CREATE TABLE `databaza_skriniek` (
	`User_ID` INT(10) NOT NULL AUTO_INCREMENT,
	`Meno` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	`Priezvisko` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	`TelCislo` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	`ID_skrinka` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	`CasVytvorenia` TIMESTAMP NULL DEFAULT current_timestamp(),
	PRIMARY KEY (`User_ID`) USING BTREE
)
COLLATE='utf8mb4_general_ci'
ENGINE=InnoDB
AUTO_INCREMENT=19
;
