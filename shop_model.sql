CREATE TABLE `address`  (
  `address_id` int NOT NULL,
  `user_id` int NOT NULL,
  `province` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `city` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `region` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `address` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `receiver` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `phonenumber` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `isdefault` tinyint NULL DEFAULT NULL,
  PRIMARY KEY (`address_id`),
  INDEX `relationship_1`(`user_id`)
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin;

CREATE TABLE `category`  (
  `category_id` int NOT NULL,
  `category_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `category_image` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  PRIMARY KEY (`category_id`)
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin;

CREATE TABLE `goods`  (
  `goods_id` int NOT NULL,
  `category_id` int NOT NULL,
  `goods_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `goods_description` text CHARACTER SET utf8 COLLATE utf8_bin NULL,
  `goods_original_price` float NULL DEFAULT NULL,
  `goods_discount_price` float NULL DEFAULT NULL,
  `goods_inventory_volum` int NULL DEFAULT NULL,
  `goods_origin` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `goods_material` varchar(200) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `goods_freight` float NULL DEFAULT NULL,
  `goods_listingdate` date NULL DEFAULT NULL,
  `goods_sales_volume` int NULL DEFAULT NULL,
  `goods_image` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  PRIMARY KEY (`goods_id`),
  INDEX `category_id`(`category_id`)
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin;

CREATE TABLE `goods_color`  (
  `color_id` int NOT NULL,
  `color_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  PRIMARY KEY (`color_id`)
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin;

CREATE TABLE `goods_color_relationship`  (
  `goods_id` int NOT NULL,
  `color_id` int NOT NULL,
  PRIMARY KEY (`goods_id`, `color_id`),
  INDEX `color_id`(`color_id`)
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin;

CREATE TABLE `goods_images`  (
  `goods_image_id` int NOT NULL,
  `goods_id` int NULL DEFAULT NULL,
  `image_address` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  PRIMARY KEY (`goods_image_id`),
  INDEX `goods_id`(`goods_id`)
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin;

CREATE TABLE `goods_inventory`  (
  `inventory_id` int NOT NULL,
  `goods_id` int NOT NULL,
  `size_id` int NOT NULL,
  `size_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `color_id` int NOT NULL,
  `color_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `inventory_volume` int NULL DEFAULT NULL,
  `sales_volume` int NULL DEFAULT NULL,
  PRIMARY KEY (`inventory_id`),
  INDEX `goods_id`(`goods_id`),
  INDEX `size_id`(`size_id`),
  INDEX `color_id`(`color_id`)
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin;

CREATE TABLE `goods_order`  (
  `order_id` int NOT NULL,
  `user_id` int NOT NULL,
  `order_number` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `order_status` int NULL DEFAULT NULL,
  `order_address` varchar(200) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `order_fee` float NULL DEFAULT NULL,
  `order_date` date NULL DEFAULT NULL,
  `order_express_number` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `order_express_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  PRIMARY KEY (`order_id`),
  INDEX `relationship_3`(`user_id`)
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin;

CREATE TABLE `goods_size`  (
  `size_id` int NOT NULL,
  `size_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  PRIMARY KEY (`size_id`)
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin;

CREATE TABLE `goods_size_relatonship`  (
  `goods_id` int NOT NULL,
  `size_id` int NOT NULL,
  PRIMARY KEY (`goods_id`, `size_id`),
  INDEX `size_id`(`size_id`)
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin;

CREATE TABLE `order_details`  (
  `order_details_id` int NOT NULL,
  `order_id` int NULL DEFAULT NULL,
  `goods_id` int NULL DEFAULT NULL,
  `order_details_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `order_details_size` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `order_details_color` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `order_details_price` float NULL DEFAULT NULL,
  `order_details_number` int NULL DEFAULT NULL,
  `order_details_image` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  PRIMARY KEY (`order_details_id`),
  INDEX `order_id`(`order_id`),
  INDEX `goods_id`(`goods_id`)
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin;

CREATE TABLE `user`  (
  `user_id` int NOT NULL,
  `user_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `password` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `age` int NULL DEFAULT NULL,
  `gender` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `jurisdiction` tinyint NULL DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin;

ALTER TABLE `address` ADD CONSTRAINT `relationship_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`);
ALTER TABLE `goods` ADD CONSTRAINT `goods_ibfk_1` FOREIGN KEY (`category_id`) REFERENCES `category` (`category_id`);
ALTER TABLE `goods_color_relationship` ADD CONSTRAINT `goods_color_relationship_ibfk_1` FOREIGN KEY (`goods_id`) REFERENCES `goods` (`goods_id`);
ALTER TABLE `goods_color_relationship` ADD CONSTRAINT `goods_color_relationship_ibfk_2` FOREIGN KEY (`color_id`) REFERENCES `goods_color` (`color_id`);
ALTER TABLE `goods_images` ADD CONSTRAINT `goods_images_ibfk_1` FOREIGN KEY (`goods_id`) REFERENCES `goods` (`goods_id`);
ALTER TABLE `goods_inventory` ADD CONSTRAINT `goods_inventory_ibfk_1` FOREIGN KEY (`goods_id`) REFERENCES `goods` (`goods_id`);
ALTER TABLE `goods_inventory` ADD CONSTRAINT `goods_inventory_ibfk_2` FOREIGN KEY (`size_id`) REFERENCES `goods_size` (`size_id`);
ALTER TABLE `goods_inventory` ADD CONSTRAINT `goods_inventory_ibfk_3` FOREIGN KEY (`color_id`) REFERENCES `goods_color` (`color_id`);
ALTER TABLE `goods_order` ADD CONSTRAINT `relationship_3` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`);
ALTER TABLE `goods_size_relatonship` ADD CONSTRAINT `goods_size_relatonship_ibfk_1` FOREIGN KEY (`goods_id`) REFERENCES `goods` (`goods_id`);
ALTER TABLE `goods_size_relatonship` ADD CONSTRAINT `goods_size_relatonship_ibfk_2` FOREIGN KEY (`size_id`) REFERENCES `goods_size` (`size_id`);
ALTER TABLE `order_details` ADD CONSTRAINT `order_details_ibfk_1` FOREIGN KEY (`order_id`) REFERENCES `goods_order` (`order_id`);
ALTER TABLE `order_details` ADD CONSTRAINT `order_details_ibfk_2` FOREIGN KEY (`goods_id`) REFERENCES `goods` (`goods_id`);

