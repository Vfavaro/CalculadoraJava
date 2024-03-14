public class Retangulo {
    double lado;
    double altura;

    public Retangulo(double lado, double altura) {
        this.lado = lado;
        this.altura = altura;
    }
    double areaRetangulo(){
        return lado*altura;
    }
    double perimetroRetangulo(){
        return (lado*2)+(altura*2);
    }

}