public class Esfera {
    double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }
    double areasuperficialEsfera(){
        return (4*3.14)*(raio*raio);
    }

    double volumeEsfera (){
        return ((4/3)*3.14) * (raio * raio * raio);
    }
}
