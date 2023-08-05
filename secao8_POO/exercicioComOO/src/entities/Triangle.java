package entities;

public class Triangle {

    // declarando atributos da classe triangulo
    // (lados do triangulo)
    public double a;
    public double b;
    public double c;

    // criando uma função p/calcular area do triangulo
    // sem parametros pois nao usamos variaveis que estao fora da classe
    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
