package fr.campus.dungeoncrawler;

import java.util.Scanner;

public class Menu {
    private final Scanner scanner = new Scanner(System.in); // scanner en attribut

    public int showMainMenu() { // le choix de l’utilisateur
        System.out.println("1 - Nouveau personnage");
        System.out.println("2 - Quitter le jeu");
        System.out.print("Votre choix : ");
        return scanner.nextInt(); // lit le prochain nombre entier tapé au clavier.
    }

    public int chooseCharacterType (){
        System.out.println("1 - Warrior");
        System.out.println("2 - Wizard");
        System.out.print("Votre choix : ");
        return scanner.nextInt();
    }

    public String askCharacterName () {
        System.out.println("Nom du personnage : ");
        scanner.nextLine();
        return scanner.nextLine();
    }

    public Integer showCharacterCreationMenu () {
        System.out.println("1 - Afficher toutes les infos du personnage");
        System.out.println("2 - Modifier ses infos");
        System.out.println("3 - Quitter le jeu");
        System.out.println("4 - Démarrer la partie");
        System.out.print("Votre choix : ");
        return scanner.nextInt();
    }

    public String askNewCharacterName() {
        System.out.print("Nouveau nom : ");
        scanner.nextLine();
        return scanner.nextLine();
    }
}