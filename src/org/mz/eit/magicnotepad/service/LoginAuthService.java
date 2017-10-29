package org.mz.eit.magicnotepad.service;

import org.mz.eit.magicnotepad.bean.LoginCredentials;

/**
 *
 * @author NK Chitkara
 */
public class LoginAuthService {
    
    private final String userId = "vc1234";
    private final String password = "vc1234";
    
    public boolean authenticateUser(LoginCredentials userCredentials){
      boolean authorised ;
      authorised = userCredentials.getUserId().equals(userId) && userCredentials.getPassword().equals(password);
      return authorised;
    }
}
