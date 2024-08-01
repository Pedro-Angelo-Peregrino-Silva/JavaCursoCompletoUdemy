import java.util.Scanner;
import java.util.Locale;

public class Ex03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner userIn = new Scanner(System.in);

        int userChoise = 1;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println("Selecione o combustível para abastecimento:");
        System.out.println("1. Álcool");
        System.out.println("2. Gasolina");
        System.out.println("3. Diesel");
        System.out.println("4. Sair");
        System.out.printf("Digite a opção: ");

        userChoise = userIn.nextInt();

        while (true) {
            if (userChoise >= 1 && userChoise <= 3) {
                switch (userChoise) {
                    case 1:
                        alcool += 1;
                        break;
                    case 2:
                        gasolina += 1;
                        break;
                    case 3:
                        diesel += 1;
                        break;
                }

                System.out.printf("Digite a mais uma opção: ");
                userChoise = userIn.nextInt();

            } else if (userChoise == 4){

                System.out.printf("Álcool = %d%n", alcool);
                System.out.printf("Gasolina = %d%n", gasolina);
                System.out.printf("Diesel = %d%n", diesel);

                break;
            } else {
                System.out.println();
                System.out.println("Número inválido");
                System.out.printf("Digite a opção: ");
                userChoise = userIn.nextInt();

            }
        }

        userIn.close();
    }
}