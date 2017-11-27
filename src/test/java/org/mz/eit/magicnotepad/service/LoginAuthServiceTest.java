package org.mz.eit.magicnotepad.service;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.mz.eit.magicnotepad.bean.LoginCredentials;

@SuppressWarnings("unused")
@RunWith(Parameterized.class)
public class LoginAuthServiceTest {

    LoginAuthService service;
    LoginCredentials credentials;
    private String adminId = null;
    private String passwrd = null;
    private boolean result;

    public LoginAuthServiceTest(String adminId, String passwrd, boolean result) {
        this.adminId = adminId;
        this.passwrd = passwrd;
        this.result = result;
    }

    @Parameters
    public static Collection testConditions() {
        Object ouptputs[][] = {
            {"vc1234", "", false},
            {"vc1234", "vc1234", true},
            {"vc1234", "vc124", false},
            {"vc124", "vc1243", false},
            {"vc123", "vc123", false},
            {"", "", false},
            {"", "vc1234", false}
        };
        return Arrays.asList(ouptputs);
    }

    @Before
    public void setup() {
        service = new LoginAuthService();
        credentials = new LoginCredentials();
    }

    @Test
    public void authenticateUserTest() {
        credentials.setUserId(adminId);
        credentials.setPassword(passwrd);
        assertEquals(service.authenticateUser(credentials), result);
    }

}
