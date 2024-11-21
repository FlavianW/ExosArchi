package org.example.tp.factory;

public class Character {

    public CharacterInterface getCharacter(String character, int pv, int pa, String competence) {
        if (character == null) {
            return null;
        }
        if (character.equalsIgnoreCase("WARRIOR")) {
            return new Warrior(pv, pa, competence);
        } else if (character.equalsIgnoreCase("ARCHER")) {
            return new Archer(pv, pa, competence);
        } else if (character.equalsIgnoreCase("MAGE")) {
            return new Mage(pv, pa, competence);
        }
        return null;
    }
}
