package Charcters;

public class Item {

    private String name;
    private int damage;
    private PlayerType playerType;

    public Item(ItemType itemType) {
        this.name = itemType.getName();
        this.damage = itemType.getDamage();
        this.playerType = itemType.getPlayerType();
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public String getName() {
        return this.name;
    }

    public int getDamage() {
        return this.damage;
    }

    public PlayerType getPlayerType() {
        return this.playerType;
    }


}

