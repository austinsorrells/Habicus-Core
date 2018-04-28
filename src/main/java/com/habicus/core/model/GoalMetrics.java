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

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "goal_metrics")
@IdClass(GoalMetricsPK.class)
public class GoalMetrics {

  private int goalMetricsId;
  private String goalComplete;
  private String goalInProgress;
  private String moneyMadeOnGoal;
  private Integer timeUntilDueDate;
  private int goalsGoalId;
  private int goalsUsersUserId;

  @Id
  @Column(name = "goal_metrics_id")
  public int getGoalMetricsId() {
    return goalMetricsId;
  }

  public void setGoalMetricsId(int goalMetricsId) {
    this.goalMetricsId = goalMetricsId;
  }

  @Basic
  @Column(name = "goal_complete")
  public String getGoalComplete() {
    return goalComplete;
  }

  public void setGoalComplete(String goalComplete) {
    this.goalComplete = goalComplete;
  }

  @Basic
  @Column(name = "goal_in_progress")
  public String getGoalInProgress() {
    return goalInProgress;
  }

  public void setGoalInProgress(String goalInProgress) {
    this.goalInProgress = goalInProgress;
  }

  @Basic
  @Column(name = "money_made_on_goal")
  public String getMoneyMadeOnGoal() {
    return moneyMadeOnGoal;
  }

  public void setMoneyMadeOnGoal(String moneyMadeOnGoal) {
    this.moneyMadeOnGoal = moneyMadeOnGoal;
  }

  @Basic
  @Column(name = "time_until_due_date")
  public Integer getTimeUntilDueDate() {
    return timeUntilDueDate;
  }

  public void setTimeUntilDueDate(Integer timeUntilDueDate) {
    this.timeUntilDueDate = timeUntilDueDate;
  }

  @Id
  @Column(name = "goals_goal_id")
  public int getGoalsGoalId() {
    return goalsGoalId;
  }

  public void setGoalsGoalId(int goalsGoalId) {
    this.goalsGoalId = goalsGoalId;
  }

  @Id
  @Column(name = "goals_users_user_id")
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
    GoalMetrics that = (GoalMetrics) o;
    return goalMetricsId == that.goalMetricsId
        && goalsGoalId == that.goalsGoalId
        && goalsUsersUserId == that.goalsUsersUserId
        && Objects.equals(goalComplete, that.goalComplete)
        && Objects.equals(goalInProgress, that.goalInProgress)
        && Objects.equals(moneyMadeOnGoal, that.moneyMadeOnGoal)
        && Objects.equals(timeUntilDueDate, that.timeUntilDueDate);
  }

  @Override
  public int hashCode() {

    return Objects.hash(
        goalMetricsId,
        goalComplete,
        goalInProgress,
        moneyMadeOnGoal,
        timeUntilDueDate,
        goalsGoalId,
        goalsUsersUserId);
  }
}
