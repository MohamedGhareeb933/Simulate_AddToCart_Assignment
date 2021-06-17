-- -----------------------------------------------------
-- Schema cart-simulate
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `cart-simulate`;

CREATE SCHEMA `cart-simulate`;
USE `cart-simulate` ;

-- -----------------------------------------------------
-- Table structure for `product_category`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cart-simulate`.`product_category` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `category_name` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT = 1;

-- -----------------------------------------------------
-- Table structure for `product_size`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cart-simulate`.`product_size` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `size_type` SMALLINT DEFAULT NULL,
  PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT = 1;

-- -----------------------------------------------------
-- Table structure for `product`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cart-simulate`.`product` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,	
  `name` VARCHAR(255) DEFAULT NULL,	
  `description` VARCHAR(255) DEFAULT NULL,	
  `unit_price` DECIMAL(13,2) DEFAULT NULL,	
  `units_in_stock` INT(11) DEFAULT NULL,	
  `date_created` DATETIME(6) DEFAULT NULL,
  `category_id` BIGINT(20) NOT NULL,	
  PRIMARY KEY (`id`),
  KEY `fk_category` (`category_id`),
  CONSTRAINT `fk_category` FOREIGN KEY (`category_id`) REFERENCES `product_category` (`id`)
)ENGINE=InnoDB  AUTO_INCREMENT = 1;


-- -----------------------------------------------------
-- Table structure for `orders`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cart-simulate`.`orders` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `order_tracking_number` varchar(255) DEFAULT NULL,
  `total_price` decimal(19,2) DEFAULT NULL,
  `total_quantity` int DEFAULT NULL,
  `date_created` datetime(6) DEFAULT NULL,
  `last_updated` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `order_item` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `quantity` int DEFAULT NULL,
  `order_id` bigint DEFAULT NULL,
  `product_id` bigint DEFAULT NULL,
  `size_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `K_order_id` (`order_id`),
  CONSTRAINT `FK_order_id` FOREIGN KEY (`order_id`) REFERENCES `orders` (`id`),
  CONSTRAINT `FK_product_id` FOREIGN KEY (`product_id`) REFERENCES `product` (`id`),
  CONSTRAINT `FK_size_id` FOREIGN KEY (`size_id`) REFERENCES `product_size` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
