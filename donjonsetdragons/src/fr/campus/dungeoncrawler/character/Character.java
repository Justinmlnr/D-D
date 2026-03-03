package fr.campus.dungeoncrawler.character;

import fr.campus.dungeoncrawler.equipment.OffensiveEquipement;

public  abstract class Character {

    private String name;
    private String type;
    private int hp;
    private int atkLevel;
    private OffensiveEquipement offensiveEquipment;

    public Character(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {

        return "P";
    }
}