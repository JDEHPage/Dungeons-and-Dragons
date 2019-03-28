import Charcters.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealerTest {

    private Healer skill;
    private Party party;
    private CreatureType creatureType;


    @Before
    public void setup(){
        party = new Party(AlignmentType.PLAYER);
        creatureType = CreatureType.DWARF;
        skill = new Healer("Medic",party,creatureType);
    }

    @Test
    public void hasDwarfCharacteristics() {
        assertEquals("Medic", skill.getName());
        assertEquals(100, skill.getCurrentHealth());
        assertEquals(100, skill.getMaxHealth());
        assertEquals(3, skill.getArmour());
        assertEquals(4, skill.getToughness());
        assertEquals(3, skill.getInitiative());
        assertEquals(3, skill.getStrength());
        assertEquals(CreatureType.DWARF, skill.getCreatureType());
        assertEquals(PlayerType.HEALER, skill.getPlayerType());
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

}
