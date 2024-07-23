import java.util.Scanner;
import java.util.Locale;

public class Ex03 {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int numberA, numberB;

        System.out.printf("Digite um número inteiro: ");
        numberA = userIn.nextInt();

        System.out.printf("Digite outro número inteiro: ");
        numberB = userIn.nextInt();

        if(numberA > numberB) {
            if(numberA % numberB == 0) {
                System.out.println("São múltiplos entre si.");
            } else {
                System.out.println("Não são múltiplos entre si.");
            }
        } else {
            if(numberB % numberA == 0) {
                System.out.println("São múltiplos entre si.");
            } else {
                System.out.println("Não são múltiplos entre si.");
            }
        }

        userIn.close();
    }
}