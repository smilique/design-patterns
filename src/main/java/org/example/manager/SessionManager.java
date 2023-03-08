package org.example.manager;

import org.example.checker.AccessChecker;

public class SessionManager {
    private AccessChecker access = AccessChecker.getInstance();

    //TODO write tests for createSession()
    public Session createSession(User user, String accessedPath) {
        if (access.mayAccess(user, accessedPath)) {
            return new Session(user);
        } else {
            throw new InsufficientRightsException(user, accessedPath);
        }
    }
}