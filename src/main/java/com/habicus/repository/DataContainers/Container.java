/*
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

package com.habicus.repository.DataContainers;

import java.util.List;

/**
 * Every test data table will inherit Container in an effort to genericize the calls to grab
 * all data in the {@link com.habicus.repository.Loader}. This greatly increases the amount
 * of code reuse we can enable when iterating through and loading all the test data into the database.
 * @param <T>
 */
public interface Container<T> {
  public List<T> getAll();
}
