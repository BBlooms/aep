package edu.berkeley.ischool.aep;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 * Created by galahad on 1/24/14.
 */

public class RectangleTest
{
    @Test
    public void shouldReturnAreaOfTeForTwoByFiveRectangle()
    {
        Rectangle rect = new Rectangle(2,5);
        assertEquals(10, rect.area());
    }

    @Test
    public void shouldReturnAreaOfTwelveOfThreeByFourRectangle()
    {
        Rectangle rect = new Rectangle(3,4);
        assertEquals(12, rect.area());
    }

    @Test
    public void shouldReturnAreaGreaterThanZero()
    {
        Rectangle rect = new Rectangle(1,1);
        assertEquals(0, rect.area());
        assertEquals(1, rect.area());

    }

    @Test
    public void shouldBeAbleToCreateSquare() {
        assertEquals(25, Rectangle.createSquare(5));
    }
}
