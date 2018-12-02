package HomeWork4.tsk1;

import org.junit.Test;

import static org.junit.Assert.*;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.verify;

public class RingTest {


    @Test
    public void Ring2() {
        Ring ring = new Ring();
        assertEquals("Ring", figureSquare.getName());
        assertEquals(112, figureSquare.square(), 0.6);
    }

    @Test
    public void Ring3() {
        Ring ring = new Ring(9);
        assertEquals("Ring", figureSquare.getName());
        assertEquals(102, figureSquare.square(), 0.6);
    }

    @Test
    public void Ring1() {
        Ring ring = new Ring(-7);
        assertEquals("Ring", figureSquare.getName());
        assertEquals(104, figureSquare.square(), 0.7);
    }

    @Test
    public void Ring4() {
        Ring ring = new Ring(0);
        assertEquals("Ring", figureSquare.getName());
        assertEquals(101, figureSquare.square(), 0.6);
    }

}