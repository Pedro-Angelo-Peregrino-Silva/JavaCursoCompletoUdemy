import java.util.Scanner;
import java.util.Locale;

public class Ex08 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner userIn = new Scanner(System.in);

        double salary, valorImpostoRenda_faixa1, valorImpostoRenda_faixa2, valorImpostoRenda_faixa3;


        System.out.printf("Digite o salário: R$ ");
        salary = userIn.nextDouble();

        if(salary > 2000.00) {

            double totalImpostoRenda = 0;

            if(salary <= 3000.00) {
                valorImpostoRenda_faixa1 = (salary - 2000.00) * 0.08;
                totalImpostoRenda = valorImpostoRenda_faixa1;
            } else { // Salary > 3000.00
                if(salary <= 4500.00) {
                    valorImpostoRenda_faixa1 = 1000.00 * 0.08;
                    valorImpostoRenda_faixa2 = (salary - 3000.00) * 0.18;
                    totalImpostoRenda = valorImpostoRenda_faixa1 + valorImpostoRenda_faixa2;
                } else { // Salary > 4500.00
                    valorImpostoRenda_faixa1 = 1000.00 * 0.08;
                    valorImpostoRenda_faixa2 = 1500.00 * 0.18;
                    valorImpostoRenda_faixa3 = (salary-4500.00) * 0.28;
                    totalImpostoRenda = valorImpostoRenda_faixa1 + valorImpostoRenda_faixa2 + valorImpostoRenda_faixa3;
                }
            }

            System.out.printf("O valor á pagar pelo imposto de renda é de: R$ %.2f%n", totalImpostoRenda);
        } else {
            System.out.println("Isento de imposto.");
        }
        userIn.close();

    }
}