CREATE TABLE `program` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `location` varchar(45) DEFAULT NULL,
  `starting_hour` datetime DEFAULT NULL,
  `ending_hour` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
