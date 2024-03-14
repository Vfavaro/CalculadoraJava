public class Cubo {
    double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    double volumeCubo(){
        return lado*lado*lado;
    }

    double areasuperficialCubo (){
        return (lado*lado)*6;
    }
}
