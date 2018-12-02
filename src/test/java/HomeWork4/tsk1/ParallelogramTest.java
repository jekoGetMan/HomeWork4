package HomeWork4.tsk1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import static org.junit.Assert.*;

//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.verify;

public class ParallelogramTest {

    @Test
    public void par1() {
        Parallelogram parallelogram = new Parallelogram(6,5,45);
        assertEquals("Parallelogram", figureSquare.getName());
        assertEquals(21, figureSquare.square(), 0.7);
    }

    @Test
    public void par2() {
        Parallelogram parallelogram = new Parallelogram();
        assertEquals("Parallelogram", figureSquare.getName());
        assertEquals(6, figureSquare.square(), 0.9);
    }

    @Test
    public void par3() {
        Parallelogram parallelogram = new Parallelogram(5,9,-34);
        assertEquals("Parallelogram", figureSquare.getName());
        assertEquals(6, figureSquare.square(), 0.7);
    }

}