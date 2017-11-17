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
package org.mz.eit.magicnotepad.constant;

/**
 *This class used to give constant values.
 * @author NK Chitkara
 */
public interface Constant {
    static String MAGIC_ICON_PATH = System.getProperty("user.dir")+"/target/classes/images/magic-icon.png";
    static String SETTINGS_ICON_PATH = System.getProperty("user.dir")+"/target/classes/images/settings-icon.jpg";
    static String SETTINGS_MENU_ICON_PATH = System.getProperty("user.dir")+"/target/classes/images/settings-menu-icon.jpg";
    static String PATH_FILE_PATH = System.getProperty("user.dir")+"/target/classes/files/path-file.txt";
    static String DEFAULT_FILE_PATH = System.getProperty("user.dir")+"/target/classes/files/default-file.txt";
    static String INCORRECT_LOGIN_MSG = "Incorrect login or password";
    static String INCORRECT_LOGIN_TITLE = "ERROR";
    static String FILE_NOT_FOUND_TITLE = "File Not Found!!;Please Select a valid FilePath";
}
