import java.util.Scanner;
import java.util.Locale;

public class Ex02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner userIn = new Scanner(System.in);

        int userNumber;

        System.out.printf("Digite umnúmero inteiro: ");
        userNumber = userIn.nextInt();

        if(userNumber % 2 == 0) {
            System.out.println("O número é PAR!");
        } else {
            System.out.println("O número é ÍMPAR!");
        }

        userIn.close();
    }
}