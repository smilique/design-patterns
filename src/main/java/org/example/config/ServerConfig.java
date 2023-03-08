package org.example.config;

public class ServerConfig {
    private static ServerConfig instance;
    private static String configFilePath = "..."; //TODO add config file

    public static ServerConfig getInstance() {
        if (instance == null) {
            //TODO create instance
            instance = new ServerConfig();
        }
        return instance;
    }

    public ServerConfig() {
        //TODO load configuration from file
        //TODO validate
    }

    public String getAccessLevel(User u) {
        //TODO
        return null;
    }
}

