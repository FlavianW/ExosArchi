package org.example.tp.l.reponse;

public class AreaCalculation {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 4);
        System.out.println("Aire du rectangle : " + rectangle.calculateArea());

        Shape square = new Square(5);
        System.out.println("Aire du carré : " + square.calculateArea());
    }
}

abstract class Shape {
    public abstract int calculateArea();
}

class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Les dimensions doivent être positives.");
        }
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        if (width <= 0) {
            throw new IllegalArgumentException("La largeur doit être positive.");
        }
        this.width = width;
    }

    public void setHeight(int height) {
        if (height <= 0) {
            throw new IllegalArgumentException("La hauteur doit être positive.");
        }
        this.height = height;
    }

    @Override
    public int calculateArea() {
        return width * height;
    }
}

class Square extends Shape {
    private int side;

    public Square(int side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Le côté doit être positif.");
        }
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Le côté doit être positif.");
        }
        this.side = side;
    }

    @Override
    public int calculateArea() {
        return side * side;
    }
}
