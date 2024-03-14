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
                
        }


            System.out.println("Qual Valor o lado: ");
        double num = sc.nextDouble();

        Quadrado quadrado = new Quadrado(num);
        System.out.println("ÁREA DO QUADRADO É :" + quadrado.areaQuadrado());

        System.out.println("Perimetro:"+quadrado.perimetroQuadrado());

    }
}
