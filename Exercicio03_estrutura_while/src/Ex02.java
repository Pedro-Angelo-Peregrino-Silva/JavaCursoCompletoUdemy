import java.util.Scanner;
import java.util.Locale;

public class Ex02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner userIn = new Scanner(System.in);

        int numberX, numberY;

        System.out.println("Escreva abaixo dois números inteiros para saber a qual quadrante no plano cartesiano pertence.");
        System.out.println();

        while(true) {
            System.out.printf("X: ");
            numberX = userIn.nextInt();
            System.out.printf("Y: ");
            numberY = userIn.nextInt();
            System.out.println();

            if(numberX != 0 && numberY != 0) {

                if (numberX > 0 && numberY > 0) {
                    System.out.println("Primeiro quadrante");
                } else if (numberX < 0 && numberY > 0) {
                    System.out.println("Segundo quadrante");
                } else if (numberX > 0 && numberY < 0) {
                    System.out.println("Quarto quadrante");
                } else {
                    System.out.println("Terceiro quadrante");
                }
                System.out.println();
            } else {
                System.out.println();
                System.out.println("Sistema encerrado.");
                break;
            }
        }

        userIn.close();
    }
}