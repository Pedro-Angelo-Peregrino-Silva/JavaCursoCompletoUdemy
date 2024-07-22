import java.util.Scanner;
import java.util.Locale;

public class Ex04 {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int beginGameHour, endGameHour, durationGame;

        System.out.printf("Digite a hora de início da partida: ");
        beginGameHour = userIn.nextInt();

        System.out.printf("Digite a hora de término da partida: ");
        endGameHour = userIn.nextInt();

        if(beginGameHour == endGameHour) {
            System.out.println("O jogo durou 24 horas");
        } else if(beginGameHour < endGameHour) {
            durationGame = endGameHour - beginGameHour;
            if (durationGame == 1) {
                System.out.printf("O jogo durou %d hora.", durationGame);
            } else {
                System.out.printf("O jogo durou %d horas.", durationGame);
            }
        } else {
            durationGame = (24 - beginGameHour) + endGameHour;
            if (durationGame == 1) {
                System.out.printf("O jogo durou %d hora.", durationGame);
            } else {
                System.out.printf("O jogo durou %d horas.", durationGame);
            }
        }

        userIn.close();
    }
}