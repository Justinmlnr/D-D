package fr.campus.dungeoncrawler;

import fr.campus.dungeoncrawler.Dice;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) { // méthode
        Menu menu = new Menu(); // objet menu

        int choice = menu.showMainMenu(); // variable choice qui appelle la méthode dans menu

        if ( choice == 1 ) {
            int typeChoice = menu.chooseCharacterType();
            String name = menu.askCharacterName();

            String typeName;
            if (typeChoice == 1) {
                typeName = "Warrior";
            } else {
                typeName = "Wizard";
            }
            System.out.println("Type choisi : " + typeName + ", Nom : " + name );

            Character character = new Character(typeName, name, 0, 0, null, null );

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


}
