public class Piramide {
    double arestadabase;
    double altura;
    double apotema;

    public Piramide(double arestadabase, double altura, double apotema) {
        this.arestadabase = arestadabase;
        this.altura = altura;
        this.apotema = apotema;
    }

    double areasuperficialPiramide(){
        return (2 * arestadabase * apotema) + (arestadabase*arestadabase);
    }

    double volumePiramide (){
        return ((arestadabase*arestadabase)*altura)/3;
    }

}
