public class Triangulo {
    double lado;

    public Triangulo(double lado) {
        this.lado = lado;
    }

    double areaTriangulo(){
        return lado * (Math.sqrt(3/4));
    }

    double perimetro(){
        return lado*3;
    }
}
