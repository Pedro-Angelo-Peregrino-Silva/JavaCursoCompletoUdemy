import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner userIn = new Scanner(System.in);

        int qntNumberEnter, numberVerify, numberIn = 0, numberOut = 0;

        System.out.printf("Digite a quantidade de números a ser verificado: ");
        qntNumberEnter = userIn.nextInt();
        System.out.println("Digite abaixo os números a serem verificados:");

        for (int i = 1; i <= qntNumberEnter; i++) {
            numberVerify = userIn.nextInt();
            if (numberVerify >= 10 && numberVerify <= 20) {
                numberIn++;
            } else {
                numberOut++;
            }
        }

        System.out.printf("Dos números digitados, %d in e %d out.%n", numberIn, numberOut);

        userIn.close();

    }
}