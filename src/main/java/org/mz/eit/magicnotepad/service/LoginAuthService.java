/*
 * Copyright (C) 2017 Metazone Infotech Pvt Ltd.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.mz.eit.magicnotepad.service;

import org.apache.log4j.LogManager;
import org.mz.eit.magicnotepad.bean.LoginCredentials;

/**
 *This service called when user have to log in.
 * @author NK Chitkara
 */
public class LoginAuthService {
    
    private static final String USER_ID = "vc1234";
    private static final String PASSWORD = "vc1234";
    private static final org.apache.log4j.Logger LOGGER = LogManager.getLogger(LoginAuthService.class.getName());
    /**
     * This method is called when user clicked on Login Button.
     * This method authenticate weather user id password is right or wrong.
     * @param userCredentials
     * @return result i.e. authorised or not
     */
    public boolean authenticateUser(LoginCredentials userCredentials){
      boolean authorised ;
      authorised = (userCredentials.getUserId().equals(USER_ID) && userCredentials.getPassword().equals(PASSWORD));
      LOGGER.info("User Authorised "+authorised);
      return authorised;
    }
}
