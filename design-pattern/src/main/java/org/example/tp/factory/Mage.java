package org.example.tp.factory;

public class Mage implements CharacterInterface {
    int pv;
    int pa;
    String competence;

    public Mage(int pv, int pa, String competence) {
        this.pv = pv;
        this.pa = pa;
        this.competence = competence;
    }


    @Override
    public int getHealth() {
        return this.pv;
    }

    @Override
    public int getAttack() {
        return this.pa;
    }

    @Override
    public String getCompetence() {
        return this.competence;
    }
}
