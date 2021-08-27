-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema db_almoxarife
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema db_almoxarife
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `db_almoxarife` DEFAULT CHARACTER SET utf8 ;
USE `db_almoxarife` ;

-- -----------------------------------------------------
-- Table `db_almoxarife`.`address`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_almoxarife`.`address` (
  `id_address` INT NOT NULL AUTO_INCREMENT,
  `address_street` VARCHAR(45) NULL,
  `address_number` INT NULL,
  PRIMARY KEY (`id_address`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_almoxarife`.`db_User`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_almoxarife`.`db_User` (
  `id_user` INT NOT NULL,
  `user_name` VARCHAR(55) NOT NULL,
  `user_password` INT NOT NULL,
  `address_id_address` INT NULL,
  PRIMARY KEY (`id_user`, `address_id_address`, `user_password`),
  INDEX `fk_user_address_idx` (`address_id_address` ASC) VISIBLE,
  CONSTRAINT `fk_user_address`
    FOREIGN KEY (`address_id_address`)
    REFERENCES `db_almoxarife`.`address` (`id_address`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_almoxarife`.`login`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_almoxarife`.`login` (
  `user_id_user` INT NOT NULL,
  `id` INT NOT NULL,
  `password_user` INT NOT NULL,
  PRIMARY KEY (`user_id_user`, `password_user`, `id`),
  CONSTRAINT `fk_login_user1`
    FOREIGN KEY (`user_id_user` , `password_user` , `id`)
    REFERENCES `db_almoxarife`.`db_User` (`id_user` , `user_password` , `id_user`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
