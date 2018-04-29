CREATE TABLE `users` (
  `user_id` int(11) unsigned NOT NULL,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `email` varchar(255) NOT NULL,
  `dob` datetime DEFAULT NULL,
  `gender` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8


CREATE TABLE `goals` (
  `goal_id` int(11) NOT NULL AUTO_INCREMENT,
  `users_user_id` int(11) unsigned NOT NULL,
  `due_date` datetime(6) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `goal_complete` varchar(255) DEFAULT NULL,
  `goal_interval` varchar(255) DEFAULT NULL,
  `label_color` varchar(255) DEFAULT NULL,
  `pledge_amount` double DEFAULT NULL,
  `task_amount` int(11) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`goal_id`,`due_date`),
  UNIQUE KEY `goal_id_UNIQUE` (`goal_id`),
  KEY `user_id_idx` (`label_color`),
  KEY `user_id_idx1` (`users_user_id`),
  CONSTRAINT `user_id` FOREIGN KEY (`users_user_id`) REFERENCES `users` (`user_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8

