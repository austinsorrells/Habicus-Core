/*
-- Query: SELECT * FROM habicus.users
LIMIT 0, 1000

-- Date: 2018-04-28 12:45
*/
INSERT INTO `users` (`user_id`,`dob`,`email`,`gender`,`password`,`username`) VALUES (1,'2013-07-17 17:18:55.000000','code@ryan-schachte.com','male','password123','testerUser');
INSERT INTO `users` (`user_id`,`dob`,`email`,`gender`,`password`,`username`) VALUES (2,'2013-07-17 17:18:55.000000','austinsorrells@hacker.com','female','pass123','testerUser2');

/*
-- Query: SELECT * FROM habicus.goals
LIMIT 0, 1000

-- Date: 2018-04-28 12:45
*/
INSERT INTO `goals` (`users_user_id`,`goal_id`,`due_date`,`description`,`goal_complete`,`goal_interval`,`label_color`,`pledge_amount`,`task_amount`,`title`) VALUES (1,1,'2013-07-17 17:18:55.000000','Tester Description','0','daily','green',5,1,'Running');
