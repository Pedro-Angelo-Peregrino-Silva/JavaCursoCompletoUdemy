import java.util.Locale;
import java.util.Scanner;

public class Aula26 {
    public Aula26() {
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int b = sc.nextInt();
        double c = sc.nextDouble();
        char d = sc.next().charAt(0);
        System.out.println("Você digitou a String " + a);
        System.out.println("Você digitou o número inteiro " + b);
        System.out.println("Você digitou o número flutuante " + c);
        System.out.println("Você digitou a string com o primeiro caracter sendo " + d);
        sc.close();
    }
}
