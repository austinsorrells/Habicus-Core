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
package com.habicus.core.controller.v1.goal;

import com.habicus.core.service.Goal.GoalService;
import com.habicus.core.service.User.UserService.NonExistentUserException;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/goal")
public class GoalController {

  private static final Logger LOGGER = Logger.getLogger(GoalController.class.getName());

  private GoalService goalService;

  @Autowired
  public void setGoalService(GoalService goalService) {
    this.goalService = goalService;
  }

  @RequestMapping("/tester")
  public String testSave() {
    try {
      goalService.testSave();
      return "Saved";
    } catch (NonExistentUserException e) {
      return "The user you are trying to save does not exist!";
    }
  }
}
