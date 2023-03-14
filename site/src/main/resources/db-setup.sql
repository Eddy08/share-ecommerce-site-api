#Drop table if exists Products;
#create table Products(
#    ID INT PRIMARY KEY AUTO_INCREMENT,
#    title String,
#    price INT,
#    category String,
#
#)
#
#CREATE TABLE `Image` (
#  `id` INT PRIMARY KEY AUTO_INCREMENT,
#  `cart_id` int(11) unsigned NOT NULL,
#  KEY `cart_id` (`cart_id`),
#  CONSTRAINT `items_ibfk_1` FOREIGN KEY (`cart_id`) REFERENCES `Cart` (`cart_id`)
#) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
#