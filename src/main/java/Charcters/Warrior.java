package Charcters;

public class Warrior extends Being{

    private CreatureType creatureType;
    private PlayerType playerType;
    private Item item;
    public Warrior(String name, Party party, CreatureType creatureType) {

        super(name, party,
                creatureType.currentHealth,
                creatureType.maxHealth,
                creatureType.armour,
                creatureType.toughness,
                creatureType.initiative,
                creatureType.strength,
                creatureType.intelligence);
        this.playerType= PlayerType.WARRIOR;
        this.creatureType = creatureType;
        this.item = null;
    }

    public CreatureType getCreatureType() {
        return creatureType;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public int attack(Being victim) {
        int damage=0;
        if (this.item == null) {
            damage = 1;
        } else if (item.getPlayerType()==this.playerType) {
            damage = this.item.getDamage() + this.getStrength();
        } else {
            damage = this.item.getDamage();
        }
        return victim.getCurrentHealth()+victim.getArmour()+victim.getToughness()-damage
    }

    public boolean allowedToUse(Item item){
        if ((this.playerType == item.getPlayerType()) || (item.getPlayerType()==null)){
            return true;
        }
        return false;
    }

    public Item getItem() {
        return this.item;
    }

    public void setItem(Item item) {
        if (allowedToUse(item)){
            this.item = item;
        }
    }
}
