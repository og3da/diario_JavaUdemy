package entities;

import entities.enums.ColorEnum;

public abstract class Shape {
    private ColorEnum color;

    public Shape(ColorEnum color) {
        this.color = color;
    }

    public Shape() {

    }

    public ColorEnum getColor() {
        return color;
    }

    public void setColor(ColorEnum color) {
        this.color = color;
    }

    // methods
    public abstract double area();
}
