package fr.campus.dungeoncrawler.game;

import java.util.Scanner;

public class Menu {
    private final Scanner scanner = new Scanner(System.in); // scanner en attribut

    /**
     * Affiche le menu principal du jeu
     * @return le choix de l'utilisateur dans le menu principal
     */
    public int showMainMenu() { // le choix de l’utilisateur
        System.out.println("1 - Nouveau personnage");
        System.out.println("2 - Quitter le jeu");
        System.out.print("Votre choix : ");
        return scanner.nextInt(); // lit le prochain nombre entier tapé au clavier.
    }

    /**
     * Choisir le type du personnage
     * @return le type du personnage choisi
     */
    public int chooseCharacterType (){
        System.out.println("1 - Warrior");
        System.out.println("2 - Wizard");
        System.out.print("Votre choix : ");
        return scanner.nextInt();
    }

    /**
     * Demande le nom du personnage
     * @return le nom du personnage
     */
    public String askCharacterName () {
        System.out.println("Nom du personnage : ");
        scanner.nextLine();
        return scanner.nextLine();
    }

    /**
     * Affiche le menu pour gérer le personnage
     * @return le choix de l'user dans le menu de création du personnage
     */
    public Integer showCharacterCreationMenu () {
        System.out.println("1 - Afficher toutes les infos du personnage");
        System.out.println("2 - Modifier ses infos");
        System.out.println("3 - Quitter le jeu");
        System.out.println("4 - Démarrer la partie");
        System.out.print("Votre choix : ");
        return scanner.nextInt();
    }

    /**
     * Demande à l'user de taper un nouveau nom pour le personnage
     * @return le nouveau nom saisi par l'user
     */
    public String askNewCharacterName() {
        System.out.print("Nouveau nom : ");
        scanner.nextLine();
        return scanner.nextLine();
    }
}