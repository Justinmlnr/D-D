package fr.campus.dungeoncrawler.character;

import fr.campus.dungeoncrawler.items.DefensiveEquipment;
import fr.campus.dungeoncrawler.items.OffensiveEquipment;

public class Wizard extends Character {
    public Wizard(String type, String name, int lifeLevel, int attackLevel, OffensiveEquipment offensiveEquipment, DefensiveEquipment defensiveEquipment) {
        super(type, name, 6, 8, offensiveEquipment, defensiveEquipment);
    }

    @Override
    public String toString() {
        return "Personnage : " + getName() +
                ", Niveau de vie : " + getLifeLevel() +
                ", Force : " + getAttackLevel();
    }
}
