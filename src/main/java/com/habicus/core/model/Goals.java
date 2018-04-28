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

import java.sql.Timestamp;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(GoalsPK.class)
public class Goals {

  private int goalId;
  private String title;
  private String description;
  private String interval;
  private int usersUserId;
  private int taskAmount;
  private Timestamp dueDate;
  private String labelColor;
  private Double pledgeAmount;
  private String goalComplete;

  @Id
  @Column(name = "goal_id")
  public int getGoalId() {
    return goalId;
  }

  public void setGoalId(int goalId) {
    this.goalId = goalId;
  }

  @Basic
  @Column(name = "title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Basic
  @Column(name = "description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Basic
  @Column(name = "goal_interval")
  public String getInterval() {
    return interval;
  }

  public void setInterval(String interval) {
    this.interval = interval;
  }

  @Id
  @Column(name = "users_user_id")
  public int getUsersUserId() {
    return usersUserId;
  }

  public void setUsersUserId(int usersUserId) {
    this.usersUserId = usersUserId;
  }

  @Basic
  @Column(name = "task_amount")
  public int getTaskAmount() {
    return taskAmount;
  }

  public void setTaskAmount(int taskAmount) {
    this.taskAmount = taskAmount;
  }

  @Id
  @Column(name = "due_date")
  public Timestamp getDueDate() {
    return dueDate;
  }

  public void setDueDate(Timestamp dueDate) {
    this.dueDate = dueDate;
  }

  @Basic
  @Column(name = "label_color")
  public String getLabelColor() {
    return labelColor;
  }

  public void setLabelColor(String labelColor) {
    this.labelColor = labelColor;
  }

  @Basic
  @Column(name = "pledge_amount")
  public Double getPledgeAmount() {
    return pledgeAmount;
  }

  public void setPledgeAmount(Double pledgeAmount) {
    this.pledgeAmount = pledgeAmount;
  }

  @Basic
  @Column(name = "goal_complete")
  public String getGoalComplete() {
    return goalComplete;
  }

  public void setGoalComplete(String goalComplete) {
    this.goalComplete = goalComplete;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Goals goals = (Goals) o;
    return goalId == goals.goalId
        && usersUserId == goals.usersUserId
        && taskAmount == goals.taskAmount
        && Objects.equals(title, goals.title)
        && Objects.equals(description, goals.description)
        && Objects.equals(interval, goals.interval)
        && Objects.equals(dueDate, goals.dueDate)
        && Objects.equals(labelColor, goals.labelColor)
        && Objects.equals(pledgeAmount, goals.pledgeAmount)
        && Objects.equals(goalComplete, goals.goalComplete);
  }

  @Override
  public int hashCode() {

    return Objects.hash(
        goalId,
        title,
        description,
        interval,
        usersUserId,
        taskAmount,
        dueDate,
        labelColor,
        pledgeAmount,
        goalComplete);
  }
}
