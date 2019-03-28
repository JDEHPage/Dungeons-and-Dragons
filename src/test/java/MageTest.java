import Charcters.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MageTest {

        private Mage skill;
        private Party party;
        private CreatureType creatureType;


        @Before
        public void setup(){
            party = new Party(AlignmentType.PLAYER);
            creatureType = CreatureType.DWARF;
            skill = new Mage("Merlin the Mighty",party,creatureType);
        }

        @Test
        public void hasDwarfCharacteristics() {
            assertEquals("Merlin the Mighty", skill.getName());
            assertEquals(100, skill.getCurrentHealth());
            assertEquals(100, skill.getMaxHealth());
            assertEquals(3, skill.getArmour());
            assertEquals(4, skill.getToughness());
            assertEquals(3, skill.getInitiative());
            assertEquals(3, skill.getStrength());
            assertEquals(CreatureType.DWARF, skill.getCreatureType());
            assertEquals(PlayerType.MAGE, skill.getPlayerType());
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


