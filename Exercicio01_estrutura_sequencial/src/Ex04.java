import java.util.Locale;
import java.util.Scanner;


public class Ex04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner numberUser = new Scanner(System.in);

        int workerNumber, hourWork;
        double hourValue, salary;

        System.out.println("Número do funcionário: ");
        workerNumber = numberUser.nextInt();

        System.out.println("Quantidade de horas trabalhadas: ");
        hourWork = numberUser.nextInt();

        System.out.println("Valor da hora de trabalho: ");
        hourValue = numberUser.nextDouble();

        salary = hourWork * hourValue;

        System.out.printf("NUMBER = %d%n", workerNumber);
        System.out.printf("SALARY = R$ %.2f",salary);

        numberUser.close();
    }
}
