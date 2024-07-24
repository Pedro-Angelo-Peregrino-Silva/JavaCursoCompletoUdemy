import java.util.Scanner;
import java.util.Locale;

public class Ex07 {
        public static void main(String[] args) {

            Locale.setDefault(Locale.US);
            Scanner userIn = new Scanner(System.in);

            double numberX, numberY;

            System.out.printf("Digiteo número X: ");
            numberX = userIn.nextDouble();

            System.out.printf("Digiteo número Y: ");
            numberY = userIn.nextDouble();

            if(numberX == 0 && numberY == 0) {
                System.out.println("Origem");
            } else {
                if(numberX > 0 && numberY > 0) {
                    System.out.println("Q1");
                } else if(numberX < 0 && numberY < 0) {
                    System.out.println("Q3");
                } else if(numberX < 0 && numberY > 0) {
                    System.out.println("Q2");
                } else {
                    System.out.println("Q4");
                }
            }

            userIn.close();
    }
}
