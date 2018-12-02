package HomeWork4.tsk1;

import org.junit.Test;

import static org.junit.Assert.*;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.verify;

public class TriangleTest {

    @Test
    public void triangl1() {
        Triangle triangle = new Triangle(6, 4, 5);
        assertEquals("Triangle", figureSquare.getName());
        assertEquals(10, figureSquare.square(), 0.4);
    }

    @Test
    public void triangl2() {
        Triangle triangle = new Triangle();
        assertEquals("Triangle", figureSquare.getName());
        assertEquals(6, figureSquare.square(), 0.3);
    }

    @Test
    public void triangl3() {
        Triangle triangle = new Triangle(8, 1, 2);
        assertEquals("Triangle", figureSquare.getName());
        assertEquals(6, figureSquare.square(), 0.5);
    }

}