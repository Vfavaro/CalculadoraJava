public class Cone {
    double raio;
    double altura;

    public Cone(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }
    double volumeCone(){
        return (1.0/3.0) * 3.14 * (raio*raio) * altura;
    }
    double areasuperficialCone(){
        return 3.14 * raio * (Math.sqrt((altura*altura)+(raio*raio)));
    }

}
