import java.util.Scanner;
import java.util.Locale;

public class Ex06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner userIn = new Scanner(System.in);

        double anyValue;

        System.out.printf("Digite um número qualquer: ");
        anyValue = userIn.nextDouble();

        if(anyValue >=0 && anyValue <= 100) {
            if (anyValue <= 25) {
                System.out.println("Dentro do intervalo [0 , 25]");
            } else if (anyValue <= 50) {
                System.out.println("Dentro do intervalo [25 , 50]");
            } else if (anyValue <= 75) {
                System.out.println("Dentro do intervalo [50 , 75]");
            } else {
                System.out.println("Dentro do intervalo [75 , 100]");
            }
        } else {
            System.out.println("Fora de intervalo");
        }

        userIn.close();
    }
}
