package fr.campus.dungeoncrawler;
import java.util.Scanner;

public class Game {
    private int position;
    private Dice dice;
    private Scanner scanner = new Scanner(System.in);
    private final int boardSize = 64;

    public void startGame () {
    dice = new Dice ();
    boolean replay = true;

    while (replay) {
        position = 1;
        System.out.println( "position : " + "/" + boardSize);
    }

    while (position < boardSize) {
        System.out.println("Appuyez sur Entrée pour lancer le dé");
        scanner.nextLine();
        int result = dice.roll();
        System.out.println("Dé : " + result + "." );
        position = position + result;
        System.out.println("case :" + position + "/" + boardSize);
        System.out.println("Fin de partie !");
        System.out.println("1 - Recommencer");
        System.out.println("2 - Quitter");
        scanner.nextInt();
        scanner.nextLine();
        
    }

    }

}
