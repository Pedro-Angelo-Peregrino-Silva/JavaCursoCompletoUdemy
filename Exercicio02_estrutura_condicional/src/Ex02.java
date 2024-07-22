import java.util.Scanner;
import java.util.Locale;

public class Ex02 {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        Locale.setDefault(Locale.US);

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