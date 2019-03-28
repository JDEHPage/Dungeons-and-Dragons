package Charcters;

public class Mage extends Being {


    private CreatureType creatureType;
    private PlayerType playerType;
    public Mage(String name, Party party, CreatureType creatureType) {

        super(name, party,
                creatureType.currentHealth,
                creatureType.maxHealth,
                creatureType.armour,
                creatureType.toughness,
                creatureType.initiative,
                creatureType.strength,
                creatureType.intelligence);
        this.playerType= PlayerType.MAGE;
        this.creatureType = creatureType;
    }

    public CreatureType getCreatureType() {
        return creatureType;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void attack(Being victim) {

    }

    public boolean allowedToUse(Item item){
        if ((this.playerType == item.getPlayerType()) || (item.getPlayerType()==null)){
            return true;
        }
        return false;
    }

}
