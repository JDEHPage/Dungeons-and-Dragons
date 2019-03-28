package Charcters;

public enum ItemType {
    AXE("Axe", 10,PlayerType.WARRIOR),
    SWORD("Sword",8,null ),
    FIREBALL("Scroll OF Fire Ball", 25, PlayerType.MAGE),
    HEALINGPOTION("Healing Potion", -10, PlayerType.HEALER);


    final String name;
    final int damage;
    final PlayerType playerType;

    ItemType(String name, int damage, PlayerType playerType){
        this.name = name;
        this.damage = damage;
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
