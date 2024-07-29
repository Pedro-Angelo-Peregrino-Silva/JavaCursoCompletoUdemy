import java.util.Scanner;
import java.util.Locale;

public class Ex01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner userIn = new Scanner(System.in);

        String userName = "Pedro";
        int password;

        while(true) {
            System.out.println("Usuário: " + userName);
            System.out.printf("Senha: ");
            password = userIn.nextInt();

            if(password != 2002) {
                System.out.println();
                System.out.println("Senha Incorreta");
                System.out.println("Acesso negado");

                System.out.println();
            } else {
                System.out.println();
                System.out.println("Acesso permitido");
                break;
            }

        }

        userIn.close();
    }
}