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
package com.habicus.core;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithUserDetails;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import static org.hamcrest.Matchers.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@TestPropertySource(locations = "classpath:application-development.properties")
public class GoalControllerTests {
  @Autowired private MockMvc mvc;
  private final String BASEURL = "/api/v1/goals";
  private static final String USER = "testerUser1";

  @Test
  @WithUserDetails(USER)
  public void getGoalsForSpecificUser() throws Exception {
    this.mvc
        .perform(get(this.BASEURL).accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
        .andExpect(MockMvcResultMatchers.jsonPath("$[0].description").value("Tester Description"));
  }

  @Test
  @WithUserDetails(USER)
  public void getGoalsForSpecificUserInvalid() throws Exception {
    this.mvc
            .perform(get(this.BASEURL).accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$[0].description", is(not("BAD Description"))));
  }

  @Test
  @WithUserDetails(USER)
  public void verifyGoalCount() throws Exception {
    this.mvc
            .perform(get(this.BASEURL).accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$", hasSize(1)));
  }
}
