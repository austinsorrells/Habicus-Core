/*
 _   _       _     _
| | | | __ _| |__ (_) ___ _   _ ___
| |_| |/ _` | '_ \| |/ __| | | / __|
|  _  | (_| | |_) | | (__| |_| \__ \
|_| |_|\__,_|_.__/|_|\___|\__,_|___/

 * This file is part of the Habicus Core Platform (https://github.com/Habicus/Habicus-Core).
 * Copyright (c) 2018 Habicus Core
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, version 3.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.habicus.core.service.Goal;

import com.habicus.core.dao.repository.GoalRepository;
import com.habicus.core.dao.repository.UserRepository;
import com.habicus.core.model.Goals;
import com.habicus.core.model.Users;
import com.habicus.core.service.User.UserService;
import java.sql.Timestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoalService {

  // Repository definitions
  @Autowired private GoalRepository goalRepository;
  @Autowired private UserRepository userRepository;

  // Service definitions
  @Autowired private UserService userService;

  public void testSave() {
    Users user = new Users();
    Goals goal = new Goals();

    user.setDob(new Timestamp(System.currentTimeMillis()));
    user.setEmail("email@gmail.com");
    user.setGender("male");
    user.setPassword("pass");
    user.setUserId(4);
    user.setUsername("username");
    userRepository.save(user);

    goal.setDescription("This is a demo goal");
    goal.setDueDate(new Timestamp(System.currentTimeMillis()));
    goal.setGoalComplete("false");
    goal.setGoalInterval("daily");
    goal.setLabelColor("green");
    goal.setTaskAmount(1);
    goal.setTitle("tester Goal");
    goal.setPledgeAmount(5.6);
    goal.setUsersUserId(user.getUserId());
    goalRepository.save(goal);
  }
}
