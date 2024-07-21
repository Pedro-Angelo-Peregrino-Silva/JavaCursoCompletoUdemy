import java.util.Locale;
import java.util.Scanner;


public class Ex01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner numeroUser = new Scanner(System.in);

        int numero_01, numero_02, soma;

        System.out.println("Digite o primeiro número inteiro: ");
        numero_01 = numeroUser.nextInt();
        System.out.println("Digite o segundo número inteiro: ");
        numero_02 = numeroUser.nextInt();

        soma = numero_01 + numero_02;

        System.out.println("A soma dos numeros é igual a " + soma + ".");

        numeroUser.close();
    }
}