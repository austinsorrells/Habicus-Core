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
package com.habicus.core.service.User;

import com.habicus.core.dao.repository.UserRepository;
import com.habicus.core.model.Users;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

  @Autowired UserRepository userRepository;

  /**
   * Allows searching for a user by their associated email (PK)
   * @param email
   * @return
   * @throws NonExistentUserException
   */
  public Users retrieveUserByEmail(String email) throws NonExistentUserException {
    Users requestedUser = userRepository.findByEmail(email);

    if (requestedUser == null) {
      throw new NonExistentUserException("Error: The requested user does not exist", email);
    }
    return requestedUser;
  }

  public class NonExistentUserException extends Exception {
    public NonExistentUserException() {
      super();
    }

    public NonExistentUserException(String err) {
      super(err);
    }

    public NonExistentUserException(String err, String email) {
      super(err + " : " + email);
    }
  }
}
