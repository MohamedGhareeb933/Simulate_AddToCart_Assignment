CREATE USER 'cart'@'localhost' identified BY 'cart';
GRANT ALL PRIVILEGES ON *. * TO 'cart'@'localhost';

ALTER USER 'cart'@'localhost' IDENTIFIED WITH mysql_native_password BY 'cart';