package edu.berkeley.ischool.aep;

/**
 * Created by galahad on 1/31/14.
 */
import org.junit.Test;
import static junit.framework.Assert.assertEquals;
public class ChanceTest {

    @Test
    public void shouldReturnChanceOfNotGettingAHead(){
        Chance c = new Chance(0.5);
        Chance c1 = new Chance(0.5);
        Chance dieThrow = new Chance(1/6);
        // assertEquals(c1.getProbability(), c.not().getProbability());
        //assertEquals(new Chance(0.5), c);
        assertEquals(new Chance(1-1/6), dieThrow.not());
    }
}
