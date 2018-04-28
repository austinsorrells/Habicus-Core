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
package com.habicus.core.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Id;

public class GoalMetricsPK implements Serializable {

  private int goalMetricsId;
  private int goalsGoalId;
  private int goalsUsersUserId;

  @Column(name = "goal_metrics_id")
  @Id
  public int getGoalMetricsId() {
    return goalMetricsId;
  }

  public void setGoalMetricsId(int goalMetricsId) {
    this.goalMetricsId = goalMetricsId;
  }

  @Column(name = "goals_goal_id")
  @Id
  public int getGoalsGoalId() {
    return goalsGoalId;
  }

  public void setGoalsGoalId(int goalsGoalId) {
    this.goalsGoalId = goalsGoalId;
  }

  @Column(name = "goals_users_user_id")
  @Id
  public int getGoalsUsersUserId() {
    return goalsUsersUserId;
  }

  public void setGoalsUsersUserId(int goalsUsersUserId) {
    this.goalsUsersUserId = goalsUsersUserId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoalMetricsPK that = (GoalMetricsPK) o;
    return goalMetricsId == that.goalMetricsId
        && goalsGoalId == that.goalsGoalId
        && goalsUsersUserId == that.goalsUsersUserId;
  }

  @Override
  public int hashCode() {

    return Objects.hash(goalMetricsId, goalsGoalId, goalsUsersUserId);
  }
}
