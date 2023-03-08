package org.example.checker;

import org.example.config.ServerConfig;

public class AccessChecker {
    private static AccessChecker instance;

    public static AccessChecker getInstance() {
        if (instance == null) {
            //TODO create instance
            instance = new AccessChecker();
        }
        return instance;
    }

    private ServerConfig config = ServerConfig.getInstance();

    public AccessChecker() {
        // TODO initialization..
    }

    public boolean mayAccess(User user, String path) {
        String userLevel = config.getAccessLevel(user);
        //TODO check if level suffices
        return false;
    }
}