public class Hexagono {
    double lado;

    public Hexagono(double lado) {
        this.lado = lado;
    }

    double areaHexagono(){
        return (6*lado*(Math.sqrt(3/4)));
    }

    double perimetroHexagono(){
        return (lado*6);
    }
}
