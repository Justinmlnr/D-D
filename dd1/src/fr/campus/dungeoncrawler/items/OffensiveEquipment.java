package fr.campus.dungeoncrawler.items;

public abstract class OffensiveEquipment {
    private String type;
    private int attackLevel;
    private String name;

    public OffensiveEquipment(String type, int attackLevel, String name) {
        this.type = type;
        this.attackLevel = attackLevel;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAttackLevel() {
        return attackLevel;
    }

    public void setAttackLevel(int attackLevel) {
        this.attackLevel = attackLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "nom : " + name +
                ", type : " + type +
                ", Niveau d'attaque : " + attackLevel + ".";
    }
}
