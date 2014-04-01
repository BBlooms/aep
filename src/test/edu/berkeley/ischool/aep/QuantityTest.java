package edu.berkeley.ischool.aep;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;


/**
 * Created by sonali on 2/14/14.
 */
public class QuantityTest {

    @Test
    public void testConvertFeetToYard()
    {
        assertEquals(new Quantity(Unit.YARD, 1.0), new Quantity(Unit.FEET,3.0));
    }

    @Test
    public void testThousandSomethingYardsEqualToOneMile()
    {
        assertEquals(new Quantity(Unit.YARD, 1760), new Quantity(Unit.MILES,1.0));
    }

    @Test
    public void testOneOunceEqualsTwoTablespoons()
    {
        assertEquals(new Quantity(Unit.OZ, 1), new Quantity(Unit.TBSP,2.0));
    }

    @Test
    public void testOneTbspEqualsThreeTablespoons()
    {
        assertEquals(new Quantity(Unit.TBSP, 1), new Quantity(Unit.TSP,3.0));
    }

    @Test
    public void testEightOunceEqualsOneCup()
    {
        assertEquals(new Quantity(Unit.OZ, 8), new Quantity(Unit.CUP,1.0));
    }

    @Test
    public void twoInchPlusTwoInchesEqualsFourInches()
    {
        assertEquals(new Quantity(Unit.INCHES, 4), new Quantity(Unit.INCHES, 2).add(new Quantity(Unit.INCHES,2.0)));
    }

    @Test
    public void twoTbspPlusOneOunceEquals12Tsp()
    {
        assertEquals(new Quantity(Unit.TSP, 12), new Quantity(Unit.TBSP, 2).add(new Quantity(Unit.OZ,1.0)));
    }


    @Test
    //Here the class should have a check mechanism because we are adding ounce with inch
    public void twoInchesPlus8OunceEquals12Tsp()
    {
        assertEquals(new Quantity(Unit.TSP, 12), new Quantity(Unit.TBSP, 2).add(new Quantity(Unit.OZ,1.0)));
    }

    @Test(expected = RuntimeException.class)
    public void twoOzOneFootShouldThrowException()
    {
        assertEquals( new Quantity(Unit.FEET, 1),new Quantity(Unit.FEET, 1).add(new Quantity(Unit.OZ, 2)));
    }

}
