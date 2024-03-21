public class Cilindro {
    double altura;
    double raio;

    public Cilindro(double altura, double raio) {
        this.altura = altura;
        this.raio = raio;
    }
    double volumeCilindro(){return 3.14 * altura * (raio*raio);
    }
    double areasuperficialCilindro(){
        return (2 * 3.14 * raio * altura) + (2 * 3.14 * (raio*raio));
    }

}
