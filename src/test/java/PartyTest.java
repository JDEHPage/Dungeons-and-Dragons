import Charcters.AlignmentType;
import Charcters.Party;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PartyTest {

    Party party1;

    @Before
    public void setup(){
        party1= new Party(AlignmentType.PLAYER);
    }

    @Test
    public void hasAlignment() {
        assertEquals(AlignmentType.PLAYER, party1.getAlignment());
    }
}
