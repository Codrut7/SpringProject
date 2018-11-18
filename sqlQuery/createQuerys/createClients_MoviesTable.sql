CREATE TABLE `clients_movies` (
  `client_id` int(11) NOT NULL,
  `movie_id` int(11) NOT NULL,
  PRIMARY KEY (`client_id`,`movie_id`),
  KEY `FK_4xbae9h5oi2hh4a6l90tt4v81` (`client_id`),
  KEY `fk2_idx` (`movie_id`),
  CONSTRAINT `fk1` FOREIGN KEY (`client_id`) REFERENCES `clients` (`idclients`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk2` FOREIGN KEY (`movie_id`) REFERENCES `movies` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
