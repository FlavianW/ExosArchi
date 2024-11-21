package org.example.tp.factory;

public class CharacterFactory {

    public Mage createCharacter(String type) {
        switch (type.toLowerCase()) {
            case "warrior":
                //
            case "mage":
                //
            case "archer":
                //
            default:
                throw new IllegalArgumentException("Unknown character type.");
        }
    }
}
