import Charcters.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WarriorTest {

    private Warrior skill;
    private Party party;
    private CreatureType creatureType;
    private Item axe;

    @Before
    public void setup(){
        axe = new Item(ItemType.AXE);
        party = new Party(AlignmentType.PLAYER);
        creatureType = CreatureType.DWARF;
        skill = new Warrior("Splag The Mighty",party,creatureType);
    }

    @Test
    public void hasDwarfCharacteristics() {
        assertEquals("Splag The Mighty", skill.getName());
        assertEquals(100, skill.getCurrentHealth());
        assertEquals(100, skill.getMaxHealth());
        assertEquals(3, skill.getArmour());
        assertEquals(4, skill.getToughness());
        assertEquals(3, skill.getInitiative());
        assertEquals(3, skill.getStrength());
        assertEquals(CreatureType.DWARF, skill.getCreatureType());
        assertEquals(PlayerType.WARRIOR, skill.getPlayerType());
        assertEquals(6, skill.getIntelligence());
    }

    @Test
    public void setMaxHealth() {
        int currentHealth = skill.getCurrentHealth();
        skill.setCurrentHealth(currentHealth+50);
        assertEquals(100, skill.getCurrentHealth());
    }

    @Test
    public void setHealth() {
        skill.setCurrentHealth(60);
        assertEquals(60, skill.getCurrentHealth());
    }

    @Test
    public void canUseAxe() {
        assertTrue(skill.allowedToUse(axe));
    }

    @Test
    public void canNotUseAxe()    {
        axe.setPlayerType(PlayerType.MAGE);
        assertFalse(skill.allowedToUse(axe));
    }

    @Test
    public void warriorHasAxe() {
        skill.setItem(axe);
        assertEquals(axe, skill.getItem());
    }
}

