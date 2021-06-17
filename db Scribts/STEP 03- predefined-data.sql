-- predefined Values for Product Category 
INSERT INTO `cart-simulate`.`product_category` (`id`, `category_name`) VALUES ('1', 'kids-costumes');
INSERT INTO `cart-simulate`.`product_category` (`id`, `category_name`) VALUES ('2', 'disney-ears');
INSERT INTO `cart-simulate`.`product_category` (`id`, `category_name`) VALUES ('3', 'frozen-costumes');

-- predefined Values for Product Size 
INSERT INTO `cart-simulate`.`product_size` (`id`, `size_type`) VALUES ('1', '3');
INSERT INTO `cart-simulate`.`product_size` (`id`, `size_type`) VALUES ('2', '6');
INSERT INTO `cart-simulate`.`product_size` (`id`, `size_type`) VALUES ('3', '9');
INSERT INTO `cart-simulate`.`product_size` (`id`, `size_type`) VALUES ('4', '12');


-- predefined Values for Product 
INSERT INTO `cart-simulate`.`product` (`id`, `name`, `description`, `unit_price`, `units_in_stock`, `date_created`, `category_id`) VALUES ('1', 'Disney Store Raya Costume Set For Kids, Raya and the Last Dragon', 'Little ones will be ever-ready for epic quests in style with this Raya Costume Set! Inspired by Raya and the Last Dragon, the 5-piece set captures all of the details from the film.', 40.00, 20, NOW(), 1);
INSERT INTO `cart-simulate`.`product` (`id`, `name`, `description`, `unit_price`, `units_in_stock`, `date_created`, `category_id`) VALUES ('2', 'Disney Store Rapunzel Costume Collection For Kids, Tangled', 'Let your little ones spirit shine as they enjoy playtime fun with our Princess Rapunzel Costume Collection! Featuring a costume, a wig, and an array of accessories, they ll be ready to let down their hair and enjoy fairytale fun.', 30.95, 24, NOW(), 1);

INSERT INTO `cart-simulate`.`product` (`id`, `name`, `description`, `unit_price`, `units_in_stock`, `date_created`, `category_id`) VALUES ('3', 'Disneyland Resort Minnie Mouse Disneyland Ears Headband For Adults', 'Be ever-ready for trips to the The happiest place on earth with this Minnie ears headband! Featuring reversible sequin ears, and Disneyland wording across the front, the shimmery design is sure to bring a little sparkle to your Disney Parks look.', 24.00, 20, NOW(), 2);
INSERT INTO `cart-simulate`.`product` (`id`, `name`, `description`, `unit_price`, `units_in_stock`, `date_created`, `category_id`) VALUES ('4', 'Walt Disney World Minnie Mouse The Haunted Mansion Ears Headband For Adults', 'Make a haunting addition to your Disney Parks style with this Minnie Mouse The Haunted Mansion Ears Headband! The bold design is maid-to-order for an afterlife full of fun.', 24.00, 20, NOW(), 2);

INSERT INTO `cart-simulate`.`product` (`id`, `name`, `description`, `unit_price`, `units_in_stock`, `date_created`, `category_id`) VALUES ('5', 'Disney Store Elsa the Snow Queen Costume For Kids, Frozen 2', 'Let little ones channel the Snow Queen and rule the forest in this Elsa costume! The enchanting two piece design features a beautiful dress with a split organza cape, and a pair of pale blue trousers.', 33.00, 5, NOW(), 3);
INSERT INTO `cart-simulate`.`product` (`id`, `name`, `description`, `unit_price`, `units_in_stock`, `date_created`, `category_id`) VALUES ('6', 'Disney Store Queen Anna Costume For Kids, Frozen 2', 'Your little Frozen 2 fan will take their rightful place as Queen of Arendelle in this Anna costume. The satin and velvet dress is accented by glitter, and the satin-lined cape completes the regal look.', 33.00, 5, NOW(), 3);
