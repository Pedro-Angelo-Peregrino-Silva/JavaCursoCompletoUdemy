import java.util.Locale;
import java.util.Scanner;


public class Ex06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner userIn = new Scanner(System.in);

        double aSide, bSide, cSide, pi;
        double trianguloArea, circuloArea, trapezioArea, quadradoArea, retanguloArea;

        pi = 3.14159;

        System.out.printf("Digite o valor de A: ");
        aSide = userIn.nextDouble();

        System.out.printf("Digite o valor de B: ");
        bSide = userIn.nextDouble();

        System.out.printf("Digite o valor de C: ");
        cSide = userIn.nextDouble();

        trianguloArea = (aSide * cSide) / 2;
        circuloArea = pi * Math.pow(cSide, 2);
        trapezioArea = (aSide + bSide) * cSide / 2;
        quadradoArea = Math.pow(bSide, 2);
        retanguloArea = aSide * bSide;

        System.out.printf("A área do triângulo que tem A por base e C por altura é de %.3f%n", trianguloArea);
        System.out.printf("A área do círculo de raio C é de %.3f%n", circuloArea);
        System.out.printf("A área do trapézio que tem A e B por bases e C por altura é de %.3f%n", trapezioArea);
        System.out.printf("A área do quadrado que tem lado B é de %.3f%n", quadradoArea);
        System.out.printf("A área do retângulo que tem lados A e B é de %.3f%n", retanguloArea);

        userIn.close();
    }
}