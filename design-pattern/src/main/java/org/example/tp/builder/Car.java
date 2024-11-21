package org.example.tp.builder;

public class Car {

    private String modele;

    private String moteur;

    private String couleur;

    private int sieges;

    private String options;

    public Car(){}

    public Car(CarBuilder builder){
        this.modele = builder.modele;
        this.moteur = builder.moteur;
        this.couleur = builder.couleur;
        this.sieges = builder.sieges;
        this.options = builder.options;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getMoteur() {
        return moteur;
    }

    public void setMoteur(String moteur) {
        this.moteur = moteur;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getSieges() {
        return sieges;
    }

    public void setSieges(int sieges) {
        this.sieges = sieges;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    @Override
    public String toString() {
        return "Car{" +
                "modele='" + modele + '\'' +
                ", moteur='" + moteur + '\'' +
                ", couleur='" + couleur + '\'' +
                ", sieges=" + sieges +
                ", options='" + options + '\'' +
                '}';
    }

    public static class CarBuilder {

        private String modele;

        private String moteur;

        private String couleur;

        private int sieges;

        private String options;

        public CarBuilder(String modele, String moteur) {
            this.modele = modele;
            this.moteur = moteur;

        }

        public CarBuilder couleur(String couleur) {
            this.couleur = couleur;
            return this;
        }

        public CarBuilder sieges(int sieges) {
            this.sieges = sieges;
            return this;
        }

        public CarBuilder options(String options) {
            this.options = options;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
