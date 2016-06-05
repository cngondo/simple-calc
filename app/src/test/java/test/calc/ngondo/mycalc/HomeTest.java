package test.calc.ngondo.mycalc;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ngondo on 6/6/16.
 */
public class HomeTest {

    @Test
    public  void addition() throws Exception{
        assertEquals(19, new Home().addition(15,4), 0);
    }
}