package org.example.tp.prototype;

public abstract class Model3D {

    private String name;
    private String path;

    public Model3D(String name, String path) {
        this.name = name;
        this.path = path;
    }

    public abstract Model3D clone();

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
