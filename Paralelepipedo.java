public class Paralelepipedo {
    double largura;
    double altura;
    double comprimento;

    public Paralelepipedo(double largura, double altura, double comprimento) {
        this.largura = largura;
        this.altura = altura;
        this.comprimento = comprimento;
    }

    double volumeParalelepipedo(){
        return comprimento*altura*largura;
    }

    double areasuperficialParalelepipedo(){
        return 2*(comprimento*altura)+(altura*largura)+(comprimento*largura);
    }
}
