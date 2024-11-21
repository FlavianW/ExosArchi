package org.example.tp.singleton;

public class Demo {
    public static void main(String[] args) {
        ConfigManagementService config1 = ConfigManagementService.getInstance("bdd1", "abcd", "1234");
        ConfigManagementService config2 = ConfigManagementService.getInstance("aaaa","aaaa","aaaa");
        System.out.println(config1 == config2);
    }
}
