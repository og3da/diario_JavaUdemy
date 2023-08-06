package entities;

public class Rectangle {
    public double width;
    public double height;

    // Para calcular a área de um retângulo, multiplicamos a sua base e a sua altura.
    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public double diagonal() {
        double d;
        d = (Math.pow(width, 2)) + (Math.pow(height, 2));
        d = Math.sqrt(d);
        return d;
    }
}
