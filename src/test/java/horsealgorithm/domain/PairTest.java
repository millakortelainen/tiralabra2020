package horsealgorithm.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PairTest {

    Pair pair;

    @Before
    public void setUp() {
        pair = new Pair(new Horse(1), new Rider(1));
    }

    @Test
    public void testSetterAndGetters() {
        Horse h2 = new Horse(2);
        pair.setHorse(h2);
        assertEquals(h2, pair.getHorse());

        Rider r2 = new Rider(2);
        pair.setRider(r2);
        assertEquals(r2, pair.getRider());
    }

    @Test
    public void testCompareTo() {
        Pair p2 = new Pair(new Horse(1), new Rider(1));
        assertEquals(p2.compareTo(pair), 1);
        Pair p3 = new Pair(new Horse(4), new Rider(1));

        assertEquals(p3.compareTo(pair), 0);
    }

}