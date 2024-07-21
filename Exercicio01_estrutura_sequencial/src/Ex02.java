import java.util.Locale;
import java.util.Scanner;


public class Ex02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner numeroUser = new Scanner(System.in);

        double pi, area, raio;

        System.out.println("Digiteo valor do raio: ");
        raio = numeroUser.nextDouble();

        pi = 3.14159;
        area = pi * Math.pow(raio, 2);

        System.out.printf("O valor da área do círculo é de %.4f", area);

        numeroUser.close();
    }
}