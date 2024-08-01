import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner userIn = new Scanner(System.in);

        int number;

        System.out.printf("Digite um número inteiro: ");
        number = userIn.nextInt();
        System.out.println("Considerando do número 1 até " + number + ",");
        System.out.println("os seguintes números abaixo são primos:");
        for(int i = 1; i <= number; i++) {
            if(i % 2 != 0) {
                System.out.println(i);
            }
        userIn.close();
        }

    }
}