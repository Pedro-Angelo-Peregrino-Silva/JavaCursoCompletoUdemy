import java.util.Locale;
import java.util.Scanner;


public class Ex03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner numberUser = new Scanner(System.in);

        int numberA, numberB, numberC, numberD, diferenca;

        System.out.println("Digite o 1º número: ");
        numberA = numberUser.nextInt();
        System.out.println("Digite o 2º número: ");
        numberB = numberUser.nextInt();
        System.out.println("Digite o 3º número: ");
        numberC = numberUser.nextInt();
        System.out.println("Digite o 4º número: ");
        numberD = numberUser.nextInt();

        diferenca = (numberA * numberB) - (numberC * numberD);

        System.out.printf("A diferença do produto do 1º e 2º número pelo produto do 3º e 4º número é igual a %d .", diferenca);

        numberUser.close();
    }
}
