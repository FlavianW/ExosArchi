package org.example.structural;

import java.util.HashMap;
import java.util.Map;

public class Configuration {

    Map<String, String> settings;

    private static Configuration instance;

    private Configuration() {
        this.settings = new HashMap<>();
        this.settings.put("bdd","abcd");
        this.settings.put("env","abcd");
        this.settings.put("api","1234");
    }

    private String getSetting(String key){
        return this.settings.get(key);
    }

    private void setSettings(String key, String value){
        this.settings.put(key,value);
    }

    public static Configuration getInstance(){
        if (instance == null) {
            instance = new Configuration();
        }
        return instance;
    }
}


