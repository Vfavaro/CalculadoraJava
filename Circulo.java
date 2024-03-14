public class Circulo {
    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }
    double areaCirculo(){
        return (3.14)*(raio*raio);
    }

    double perimetroCirculo(){
        return 2 * 3.14 * raio;
    }
}
