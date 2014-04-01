package edu.berkeley.ischool.aep;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by brianbloomer on 3/7/14.
 */

public class ReverseTest {


    @Test
    public void reverseSingleChar(){
        String name = "a";
        assertEquals("a",Reverse.reverse(name));
    }

    @Test
    public void isReversed(){
        String name = "ReverseMe";
        assertEquals("eMesreveR", Reverse.reverse(name));
    }
}