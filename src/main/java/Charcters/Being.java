package Charcters;

public abstract class Being {
    private String name;
    private Party party;
    private int currentHealth;
    private int maxHealth;
    private int armour;
    private int toughness;
    private int initiative;
    private int strength;
    private int intelligence;

    public Being(String name, Party party, int currentHealth, int maxHealth, int armour, int toughness, int initiative, int strength, int intelligence) {
        this.name = name;
        this.party = party;
        this.currentHealth = currentHealth;
        this.maxHealth = maxHealth;
        this.armour = armour;
        this.toughness = toughness;
        this.initiative = initiative;
        this.strength = strength;
        this.intelligence = intelligence;
    }

    public String getName() {
        return this.name;
    }

    public Party getParty() {
        return this.party;
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

    public int getInitiative() {
        return this.initiative;
    }

    public int getStrength() {
        return this.strength;
    }

    public int getIntelligence() {
        return this.intelligence;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
        if (this.currentHealth>this.maxHealth) {
            this.currentHealth = this.maxHealth;
        }
    }


    public abstract void attack(Being victim);

    public abstract boolean allowedToUse(Item item);
}
