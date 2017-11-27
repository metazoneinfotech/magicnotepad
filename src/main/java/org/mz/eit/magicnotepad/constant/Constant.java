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
	String ROOT_PATH=System.getProperty("user.dir");
	String MAGIC_ICON_PATH = ROOT_PATH+"/target/classes/images/magic-icon.png";
	String SETTINGS_ICON_PATH = ROOT_PATH+"/target/classes/images/settings-icon.jpg";
	String SETTINGS_MENU_ICON_PATH = ROOT_PATH+"/target/classes/images/settings-menu-icon.jpg";
	String PATH_FILE_PATH = ROOT_PATH+"/target/classes/files/path-file.txt";
	String DEFAULT_FILE_PATH = ROOT_PATH+"/target/classes/files/default-file.txt";
	String INCORRECT_LOGIN_MSG = "Incorrect login or password";
	String INCORRECT_LOGIN_TITLE = "ERROR";
	String FILE_NOT_FOUND_TITLE = "File Not Found!!;Please Select a valid FilePath";
	String FONT_SANS_SERIF="SansSerif";
}
