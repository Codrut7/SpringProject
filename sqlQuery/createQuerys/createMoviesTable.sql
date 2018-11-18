CREATE TABLE `movies` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `genre` varchar(45) DEFAULT NULL,
  `description` varchar(2000) DEFAULT NULL,
  `imageURL` varchar(200) DEFAULT NULL,
  `programDetails_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=latin1;
