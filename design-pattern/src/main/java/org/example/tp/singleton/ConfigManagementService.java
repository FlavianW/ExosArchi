package org.example.tp.singleton;

public class ConfigManagementService {

    private String Bdd;
    private String Env;
    private String Api;

    private static ConfigManagementService instance;

    private ConfigManagementService(String Bdd, String Env, String Api) {
        this.Api = Api;
        this.Env = Env;
        this.Api = Api;
    }

    public static ConfigManagementService getInstance(String Bdd, String Env, String Api){
        if (instance == null) {
            instance = new ConfigManagementService(Bdd, Env, Api);
        }
        return instance;
    }
}


