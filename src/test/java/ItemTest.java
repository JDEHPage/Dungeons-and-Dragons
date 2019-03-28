import Charcters.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    Item axe;
    private Warrior skill;
    private Party party;
    private CreatureType creatureType;

    @Before
    public void setup(){
        axe = new Item(ItemType.AXE);
        party = new Party(AlignmentType.PLAYER);
        creatureType = CreatureType.DWARF;
        skill = new Warrior("Splag The Mighty",party,creatureType);
    }

    @Test
    public void hasName() {
        assertEquals("Axe", axe.getName());
    }

    @Test
    public void everyoneCanUse() {
        assertNull(axe.getPlayerType());
    }

    @Test
    public void hasDamage() {
        assertEquals(30, axe.getDamage());
    }


}

