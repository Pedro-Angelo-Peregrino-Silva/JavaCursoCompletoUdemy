import java.util.Locale;
import java.util.Scanner;


public class Ex05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner userIn = new Scanner(System.in);

        int productNumber_01, productNumber_02, productQnt_01, productQnt_02;
        double productValue_01, productValue_02, shopCar;

        System.out.printf("Digite o número de id do produto: ");
        productNumber_01 = userIn.nextInt();
        System.out.printf("Digite a quantidade comprada: ");
        productQnt_01 = userIn.nextInt();
        System.out.printf("Digite o valor do produto: ");
        productValue_01 = userIn.nextDouble();

        System.out.printf("Digite o número de id do produto: ");
        productNumber_02 = userIn.nextInt();
        System.out.printf("Digite a quantidade comprada: ");
        productQnt_02 = userIn.nextInt();
        System.out.printf("Digite o valor do produto: ");
        productValue_02 = userIn.nextDouble();

        shopCar = (productQnt_01 * productValue_01) + (productQnt_02 * productValue_02);

        System.out.printf("O valor total da compra é de %nR$ %.2f", shopCar);

        userIn.close();
    }
}