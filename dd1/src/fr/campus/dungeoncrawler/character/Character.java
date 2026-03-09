package fr.campus.dungeoncrawler.character;

import fr.campus.dungeoncrawler.items.DefensiveEquipment;
import fr.campus.dungeoncrawler.items.OffensiveEquipment;

// Déclarer les attributs (les variables de la classe)
public abstract class Character {
    private String type; // attribut
    private String name;
    private int lifeLevel;
    private int attackLevel;
    private OffensiveEquipment offensiveEquipment;
    private DefensiveEquipment defensiveEquipment;

    // Constructeur
    public Character(String type, String name, int lifeLevel, int attackLevel, OffensiveEquipment offensiveEquipment, DefensiveEquipment defensiveEquipment) {
        this.type = type;
        this.name = name;
        this.lifeLevel = lifeLevel;
        this.attackLevel = attackLevel;
        this.offensiveEquipment = offensiveEquipment;
        this.defensiveEquipment = defensiveEquipment;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifeLevel() {
        return lifeLevel;
    }

    public void setLifeLevel(int lifeLevel) {
        this.lifeLevel = lifeLevel;
    }

    public int getAttackLevel() {
        return attackLevel;
    }

    public void setAttackLevel(int attackLevel) {
        this.attackLevel = attackLevel;
    }

    public OffensiveEquipment getOffensiveEquipment() {
        return offensiveEquipment;
    }

    public void setOffensiveEquipment(OffensiveEquipment offensiveEquipment) {
        this.offensiveEquipment = offensiveEquipment;
    }

    @Override
    public String toString() {
        return  "type = " + type +
                ", Character = " + name +
                ", Niveau de vie = " + lifeLevel +
                ", Niveau d'attaque = " + attackLevel +
                ", Equipement offensif = " + offensiveEquipment +
                ", Equipement défensif = " + defensiveEquipment + ".";
    }

    public DefensiveEquipment getDefensiveEquipment() {
        return defensiveEquipment;
    }

    public void setDefensiveEquipment(DefensiveEquipment defensiveEquipment) {
        this.defensiveEquipment = defensiveEquipment;
    }
}
