public class Triangulo {
    double lado;

    public Triangulo(double lado) {
        this.lado = lado;
    }

    double areaTriangulo(){
        return lado * (Math.sqrt(3.0/4.0));
    }

    double perimetro(){
        return lado*3;
    }
}
