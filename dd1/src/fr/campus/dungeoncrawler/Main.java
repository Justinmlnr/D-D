package fr.campus.dungeoncrawler;

import fr.campus.dungeoncrawler.Dice;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) { // méthode
        Menu menu = new Menu(); // objet menu
        Game game = new Game();
        game.run(menu);
    }


}
