package horsealgorithm.domain;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class HorseTest {
    Horse horse;
    Horse horse2;

    @Before
    public void setUp() {
        horse = new Horse(1, "TestHorse", 1, 177, 1);
        horse2 = new Horse(1);
    }

    @Test
    public void horseIsCreated() {
        assertNotNull(horse);
        assertEquals("HORSE INFO: \n" + "1. Name: TestHorse\n" + "Skill Level: easy\n" + "Height: 177 cm \n"
                + "Type: dressage", horse.toString());
    }

    @Test
    public void testHorseSettersAndGetters() {
        horse.setId(2);
        assertEquals(2, horse.getId());
        horse.setName("NewTest");
        assertEquals("NewTest", horse.getName());
        horse.setSkillLevel(2);
        assertEquals(2, horse.getSkillLevel());
        horse.setHeight(130);
        assertEquals(130, horse.getHeight());
        horse.setType(2);
        assertEquals(2, horse.getType());
    }

    @Test
    public void testHorseEquals() {
        assertTrue(horse.equals(horse));
        assertFalse(horse.equals(new Horse(2, "tester", 1, 123, 1)));
        assertTrue(horse.equals(new Horse(1, "TestHorse", 1, 177, 1)));
    }

    @Test
    public void testerConstructorTest() {
        assertNotNull(horse2);
        assertEquals(
                "HORSE INFO: \n" + "1. Name: HorseName1\n" + "Skill Level: Test\n" + "Height: 155 cm \n" + "Type: Test",
                horse2.toString());

    }

}
