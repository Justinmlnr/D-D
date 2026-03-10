package fr.campus.dungeoncrawler.items;

public class Spell extends OffensiveEquipment {
    public Spell(String type, int attackLevel, String name) {
        super(type, attackLevel, name);
    }

    @Override
    public String toString() {
        return " Nom : " + getName() +
                ", Type : " + getType() +
                ", Niveau d'attaque : " + getAttackLevel();
    }
}
