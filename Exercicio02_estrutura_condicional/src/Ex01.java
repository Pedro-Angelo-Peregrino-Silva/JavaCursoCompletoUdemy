import java.util.Scanner;
import java.util.Locale;

public class Ex01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner userIn = new Scanner(System.in);

        int userNumber;

        System.out.printf("Digite um número inteiro: ");
        userNumber = userIn.nextInt();

        if(userNumber >= 0) {
            System.out.println("Não negativo");
        } else {
            System.out.println("Negativo");
        }

        userIn.close();
    }
}