import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------CALCULADORA---------------");
        System.out.println("Insira seu nome: ");
        String nome = sc.nextLine();
        System.out.println(nome+" digite qual forma Geométrica você gostaria de calcular?");
        System.out.println("[1] Forma Geométrica Plana");
        System.out.println("[2] Forma Geométrica Espacial");
        System.out.println("[3] SAIR");
        int escolha = sc.nextInt();

        if (escolha == 1) {
            System.out.println(nome+" digite qual forma GEOMÉTRICA PLANA você gostaria de calcular");
            System.out.println("[1] Quadrado");
            System.out.println("[2] Retângulo");
            System.out.println("[3] Triângulo Equilátero");
            System.out.println("[4] Circulo");
            System.out.println("[5] Hexágono Regular");
            System.out.println("[6] SAIR");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Qual valor do lado do quadrado: ");
                    double ladoQuadrado = sc.nextDouble();
                    Quadrado quadrado = new Quadrado(ladoQuadrado);
                    System.out.println("ÁREA DO QUADRADO: " + quadrado.areaQuadrado());
                    System.out.println("PERÍMETRO: " + quadrado.perimetroQuadrado());
                    break;

                case 2:
                    System.out.println("Qual valor da base do retângulo: ");
                    double baseRetangulo = sc.nextDouble();
                    System.out.println("Qual valor da altura do retângulo: ");
                    double alturaRetangulo = sc.nextDouble();
                    Retangulo retangulo = new Retangulo(baseRetangulo, alturaRetangulo);
                    System.out.println("ÁREA DO RETÂNGULO: " + retangulo.areaRetangulo());
                    System.out.println("PERÍMETRO: " + retangulo.perimetroRetangulo());
                    break;

                case 3:
                    System.out.println("Qual valor do lado do triângulo equilátero: ");
                    double ladoTriangulo = sc.nextDouble();
                    Triangulo triangulo = new Triangulo(ladoTriangulo);
                    System.out.println("ÁREA DO TRIÂNGULO EQUILÁTERO: " + triangulo.areaTriangulo());
                    System.out.println("PERÍMETRO: " + triangulo.perimetro());
                    break;

                case 4:
                    System.out.println("Qual valor do raio do círculo: ");
                    double raioCirculo = sc.nextDouble();
                    Circulo circulo = new Circulo(raioCirculo);
                    System.out.println("ÁREA DO CÍRCULO: " + circulo.areaCirculo());
                    System.out.println("PERÍMETRO DO CÍRCULO: " + circulo.perimetroCirculo());
                    break;

                case 5:
                    System.out.println("Qual valor do lado do hexágono: ");
                    double ladoHexagono = sc.nextDouble();
                    Hexagono hexagono = new Hexagono(ladoHexagono);
                    System.out.println("ÁREA DO HEXÁGONO: " + hexagono.areaHexagono());
                    System.out.println("PERÍMETRO DO HEXÁGONO: " + hexagono.perimetroHexagono());
                    break;

                case 6:
                    System.out.println(nome+ " você saiu da Calculadora!");

            }

        } else if (escolha == 2) {
            System.out.println(nome+" digite qual forma GEOMÉTRICA ESPACIAL você gostaria de calcular");
            System.out.println("[1] Cubo");
            System.out.println("[2] Paralelepípedo");
            System.out.println("[3] Esfera");
            System.out.println("[4] Pirâmide");
            System.out.println("[5] Cilindro");
            System.out.println("[6] Cone");
            System.out.println("[7] SAIR");

            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Qual valor do lado do Cubo: ");
                    double ladoCubo = sc.nextDouble();
                    Cubo cubo = new Cubo(ladoCubo);
                    System.out.println("ÁREA DO CUBO: " + cubo.volumeCubo());
                    System.out.println("ÁREA SUPERFICIAL: " + cubo.areasuperficialCubo());
                    break;

                case 2:
                    System.out.println("Qual valor do comprimento do paralelepípedo: ");
                    double comprimentoParalelepipedo = sc.nextDouble();
                    System.out.println("Qual valor da altura do paralelepipedo: ");
                    double alturaParalelepipedo = sc.nextDouble();
                    System.out.println("Qual valor da altura do paralelepipedo: ");
                    double larguraParalelepipedo = sc.nextDouble();
                    Paralelepipedo paralelepipedo = new Paralelepipedo(comprimentoParalelepipedo, alturaParalelepipedo, larguraParalelepipedo);
                    System.out.println("VOLUME DO PARALELEPÍPEDO: " + paralelepipedo.volumeParalelepipedo());
                    System.out.println("ÁREA SUPERFICIAL: " + paralelepipedo.areasuperficialParalelepipedo());
                    break;

                case 3:
                    System.out.println("Qual valor do raio da Esfera: ");
                    double raioEsfera = sc.nextDouble();
                    Esfera esfera = new Esfera(raioEsfera);
                    System.out.println("VOLUME DA ESFERA: " + esfera.volumeEsfera());
                    System.out.println("ÁREA SUPERFICIAL: " + esfera.areasuperficialEsfera());
                    break;

                case 4:
                    System.out.println("Qual valor da aresta da Pirâmide de Base Quadrada: ");
                    double arestadabasePiramide = sc.nextDouble();
                    System.out.println("Qual valor da altura da Pirâmide de Base Quadrada: ");
                    double alturaPiramide = sc.nextDouble();
                    System.out.println("Qual valor da apotema da Pirâmide de Base Quadrada: ");
                    double apotemaPiramide = sc.nextDouble();
                    Piramide piramide = new Piramide(arestadabasePiramide, alturaPiramide, apotemaPiramide);
                    System.out.println("VOLUME DO PARALELEPÍPEDO: " + piramide.volumePiramide());
                    System.out.println("ÁREA SUPERFICIAL: " + piramide.areasuperficialPiramide());
                    break;

                case 5:
                    System.out.println("Qual valor do raio do cilindro: ");
                    double raioCilindro = sc.nextDouble();
                    System.out.println("Qual valor da altura do cilindro: ");
                    double alturaCilindro = sc.nextDouble();
                    Cilindro cilindro = new Cilindro(raioCilindro, alturaCilindro);
                    System.out.println("VOLUME DO PARALELEPÍPEDO: " + cilindro.volumeCilindro());
                    System.out.println("ÁREA SUPERFICIAL: " + cilindro.areasuperficialCilindro());
                    break;

                case 6:
                    System.out.println("Qual valor do raio do cone: ");
                    double raioCone = sc.nextDouble();
                    System.out.println("Qual valor da altura do cone: ");
                    double alturaCone = sc.nextDouble();
                    Cone cone = new Cone(raioCone, alturaCone);
                    System.out.println("VOLUME DO PARALELEPÍPEDO: " + cone.volumeCone());
                    System.out.println("ÁREA SUPERFICIAL: " + cone.areasuperficialCone());
                    break;

                case 7:
                    System.out.println(nome+ " você saiu da Calculadora!");


            }

        } else if (escolha == 3) {
            System.out.println(nome+ " você saiu da Calculadora!");

        } else {
            System.out.println("Opção inválida!");
        }

    }
}


