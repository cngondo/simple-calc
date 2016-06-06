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

    @Test
    public void subtraction() throws  Exception{
        assertEquals(2, new Home().subtraction(6 ,4), 0);
    }

    @Test
    public void multiplication() throws Exception{
        assertEquals(40, new Home().multiplication(10, 4), 0);
    }

    @Test
    public void division() throws Exception{
        assertEquals(2, new Home().division(6, 3), 0);
    }


}