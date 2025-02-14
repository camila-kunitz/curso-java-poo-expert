package exercicio5.exercicioRetangulo.entities;

public class Retangulo {

    public double widht;
    public double height;

    public double area(double a, double b) {
        return a * b;
    }

    public double perimetro() {
        return 2 * (widht + height);
    }

    public double diagonal() {
        return Math.sqrt(widht * widht + height * height);
    }
}
