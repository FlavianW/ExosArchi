package org.example.tp.singleton;

public class Demo {
    public static void main(String[] args) {
        Configuration config1 = Configuration.getInstance();
        Configuration config2 = Configuration.getInstance();
        System.out.println(config1 == config2);
    }
}
