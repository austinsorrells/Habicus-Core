CREATE TABLE `goal_metrics` (
  `goal_metrics_id` int(11) NOT NULL,
  `goal_complete` varchar(45) DEFAULT NULL,
  `goal_in_progress` varchar(45) DEFAULT NULL,
  `money_made_on_goal` varchar(45) DEFAULT NULL,
  `time_until_due_date` decimal(10,0) DEFAULT NULL,
  `goals_goal_id` int(11) NOT NULL,
  PRIMARY KEY (`goal_metrics_id`,`goals_goal_id`),
  KEY `fk_goal_metrics_goals1_idx` (`goals_goal_id`),
  CONSTRAINT `fk_goal_metrics_goals1` FOREIGN KEY (`goals_goal_id`) REFERENCES `goals` (`goal_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `goals` (
  `goal_id` int(11) NOT NULL,
  `title` varchar(45) NOT NULL,
  `description` varchar(45) DEFAULT NULL,
  `goal_interval` varchar(255) NOT NULL,
  `users_user_id` int(10) unsigned NOT NULL,
  `task_amount` int(11) NOT NULL,
  `due_date` datetime NOT NULL,
  `label_color` varchar(15) NOT NULL,
  `pledge_amount` double DEFAULT NULL,
  `goal_complete` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`goal_id`,`users_user_id`,`due_date`),
  UNIQUE KEY `goal_id_UNIQUE` (`goal_id`),
  KEY `fk_goals_users_idx` (`users_user_id`),
  CONSTRAINT `fk_goals_users` FOREIGN KEY (`users_user_id`) REFERENCES `users` (`user_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `users` (
  `user_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `email` varchar(255) NOT NULL,
  `dob` datetime DEFAULT NULL,
  `gender` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
