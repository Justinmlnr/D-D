package fr.campus.dungeoncrawler;
import fr.campus.dungeoncrawler.character.Character;
import fr.campus.dungeoncrawler.character.Warrior;
import fr.campus.dungeoncrawler.character.Wizard;
import fr.campus.dungeoncrawler.items.Shield;
import fr.campus.dungeoncrawler.items.Weapon;

import java.util.Scanner;

public class Game {
    private int position;
    private Dice dice;
    private Scanner scanner = new Scanner(System.in);
    private final int boardSize = 64;

    public  void run ( Menu menu) {
        int choice = menu.showMainMenu();

        if ( choice == 1 ) {
            int typeChoice = menu.chooseCharacterType();
            String name = menu.askCharacterName();

            String typeName;
            Character character;
            if (typeChoice == 1) {
                typeName = "Warrior";
                Weapon weapon = new Weapon(String type, int attackLevel, String name);
                Shield shield = new Shield(String type, int defenseLevel, String name);
                character = new Warrior(typeName, name, 0, 0, null, null);
            } else {
                typeName = "Wizard";
                character = new Wizard(typeName, name, 0, 0, null, null);
            }
            System.out.println("Type choisi : " + typeName + ", Nom : " + name );




            // int creationChoice = menu.showCharacterCreationMenu();
            int creationChoice = 0;
            while (creationChoice !=3) {
                creationChoice = menu.showCharacterCreationMenu();
                if (creationChoice == 1) {
                    System.out.println(character);
                } else if (creationChoice == 2) {
                    String newName = menu.askNewCharacterName();
                    character.setName(newName);
                    System.out.println(character);
                } else if (creationChoice == 3) {
                    System.out.println("Au revoir");
                    break;
                } else if (creationChoice == 4) {
                    Game newGame = new Game();
                    newGame.startGame();
                } else {
                    System.out.print("Choix invalide");
                }
            }

        } else {
            System.out.println("Au revoir");
        }
    }

    public void startGame () {
    dice = new Dice ();
    boolean replay = true;

    while (replay) {
        position = 1;
        displayBoard();

        System.out.println("position : " + position + "/" + boardSize);

        while (position < boardSize) {
            System.out.println("Appuyez sur Entrée pour lancer le dé");
            scanner.nextLine();
            int result = dice.roll();
            System.out.println("Dé : " + result + ".");
            position = position + result;
            displayBoard();
            System.out.println("case :" + position + "/" + boardSize);
        }
        System.out.println("Fin de partie !");
        System.out.println("1 - Recommencer");
        System.out.println("2 - Quitter");

        int endChoice = scanner.nextInt();
        scanner.nextLine();
        if ( endChoice == 2 ) {
            replay = false;
        } else if (endChoice == 1){
            System.out.println("Nouvelle partie !");
        } else {
            System.out.println("Choix invalide");
        }
    }


    }

    public void displayBoard () {
        for ( int i = 0; i < boardSize; i++) {
            if ( i == position - 1) {
                System.out.print("P");
            } else {
                System.out.print(".");
            }
        }
            System.out.println();
    }

}
