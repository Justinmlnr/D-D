package fr.campus.dungeoncrawler.items;

public class Shield extends DefensiveEquipment {
    public Shield(String type, int defenseLevel, String name) {
        super(type, defenseLevel, name);
    }

    @Override
    public String toString() {
        return "Nom : " + getName() +
                ", Type : " + getType() +
                ", Niveau de défense : " + getDefenseLevel();
    }
}
