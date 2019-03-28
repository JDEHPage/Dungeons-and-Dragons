package Charcters;

public enum CreatureType {
    DWARF(100,100,3,4,3,3, 6),
    BARBARIAN(80,80,1,3,5,5, 3),
    KNIGHT(90,90,4,2,2,2,4),
    WARLORD(70,70,1,2,3,3,7),
    WITCH(70,70,1,2,3,1,7),
    ORC(90,90,4,2,2,2,1);

    final int currentHealth;
    final int maxHealth;
    final int armour;
    final int toughness;
    final int initiative;
    final int strength;
    final int intelligence;

    CreatureType(int currentHealth, int maxHealth, int armour, int toughness, int initiative, int strength, int intelligence ){
        this.currentHealth = currentHealth;
        this.maxHealth = maxHealth;
        this.armour = armour;
        this.toughness = toughness;
        this.initiative = initiative;
        this.strength = strength;
        this.intelligence = intelligence;
    }

    public int getCurrentHealth() {
        return this.currentHealth;
    }

    public int getMaxHealth() {
        return this.maxHealth;
    }

    public int getArmour() {
        return this.armour;
    }

    public int getToughness() {
        return this.toughness;
    }

    public int getInitaitive() {
        return this.initiative;
    }

    public int getStrength() {
        return this.strength;
    }
}
