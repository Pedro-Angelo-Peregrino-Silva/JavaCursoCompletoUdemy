import java.util.Scanner;
import java.util.Locale;

public class Ex05 {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int codProduct, qntProduct;
        double valorPagar;

        System.out.printf("Tabela de Preços:%n");
        System.out.printf("Código - Produto - Valor%n");
        System.out.printf("1 - Cachorro-quente - R$ 4.00%n");
        System.out.printf("2 - X-salada - R$ 4.50%n");
        System.out.printf("3 - X-bacon - R$ 5.00%n");
        System.out.printf("4 - Misto-quente - R$ 2.00%n");
        System.out.printf("5 - Refrigerante - R$ 1.50%n");
        System.out.println();

        System.out.printf("COD produto: ");
        codProduct = userIn.nextInt();
        System.out.printf("QNT produto: ");
        qntProduct = userIn.nextInt();

        valorPagar = 0.00;

        if(codProduct == 1) {
            valorPagar = qntProduct * 4.00;
        } else if(codProduct == 2) {
            valorPagar = qntProduct * 4.50;
        } else if(codProduct == 3) {
            valorPagar = qntProduct * 5.00;
        } else if(codProduct == 4) {
            valorPagar = qntProduct * 2.00;
        } else if(codProduct == 5) {
            valorPagar = qntProduct * 1.50;
        } else {
            System.out.println("Código digitado errado.");
        }

        System.out.printf("Valor total a pagar: R$ %.2f", valorPagar);

        userIn.close();
    }
}