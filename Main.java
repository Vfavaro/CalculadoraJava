import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("------------------CALCULADORA---------------");
        System.out.println("Digite qual forma Geométrica você gostaria de calcular");
        System.out.println("[1] Forma Geométrica Plana");
        System.out.println("[2] Forma Geométrica Espacial");

        int option= sc.nextInt();
        switch(option){
            case 1:
                System.out.println("Digite qual forma GEOMÉTRICA PLANA você gostaria de calcular");
                System.out.println("[1] Quadrado");
                System.out.println("[2] Retângulo");
                System.out.println("[3] Triângulo Equilátero");
                System.out.println("[4] Circulo");
                System.out.println("[5] Hexágono Regular");

                switch (option){
                    case 1:
                        System.out.println("Qual Valor o lado: ");
                        double num = sc.nextDouble();
                        Quadrado quadrado = new Quadrado(num);
                        System.out.println("A ÁREA DO QUADRADO É:" + quadrado.areaQuadrado());
                        System.out.println("O PERÍMETRO É: "+quadrado.perimetroQuadrado());
                        break;

                    case 2:
                        System.out.println("Qual Valor do lado: ");
                        double lado = sc.nextDouble();
                        System.out.println("Qual Valor da Base: ");
                        double base = sc.nextDouble();

                        Retangulo retangulo = new Retangulo(num);
                        System.out.println("A ÁREA DO RETÂNGULO É:" + retangulo.areaRetangulo());
                        System.out.println("O PERÍMETRO É: "+retangulo.perimetroRetangulo());
                        break;

                }

        }


            System.out.println("Qual Valor o lado: ");
        double num = sc.nextDouble();

        Quadrado quadrado = new Quadrado(num);
        System.out.println("ÁREA DO QUADRADO É :" + quadrado.areaQuadrado());

        System.out.println("Perimetro:"+quadrado.perimetroQuadrado());

    }
}
