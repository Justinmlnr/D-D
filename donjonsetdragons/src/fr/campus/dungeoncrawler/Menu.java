package fr.campus.dungeoncrawler;

import java.util.Scanner;

public class Menu {

    private Scanner scanner;

    public Menu(Scanner scanner) { // constructeur
        this.scanner = scanner;
    }

    // Retourne vrai si l'utilisateur demande à quitter le jeu
    public boolean mainMenu() {
        System.out.println("""
                Faites votre choix:
                1 - Nouveau personnage
                2 - Editer personnage
                3 - Quitter le jeu
                """);

        int input = scanner.nextInt();
        scanner.nextLine();

        switch (input) {
            case 1:
                return false;
            case 2:
                System.out.println("Pas encore implémenté");
                return mainMenu();
            case 3:
                return true;
            default:
                System.out.println("Vous avez rentré n'importe quoi");
                return mainMenu();
        }
    }

    public String getType() {
        System.out.println("Faîtes votre choix entre Warrior et Wizard");
        return scanner.nextLine();
    }

    public String getName() {
        System.out.println("Entrer un nom");
        return scanner.nextLine();
    }
}
