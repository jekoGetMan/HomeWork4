package HomeWork4.tsk1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import static org.junit.Assert.*;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.verify;

    public class TrapeziumTest {

        @Test
        public void trap1() {
            Trapezium trapeziume = new Trapezium(3,5,2,3);
            assertEquals("Trapezium", figureSquare.getName());
            assertEquals(8, figureSquare.square(), 0.4);
        }

        @Test
        public void trap2() {
            Trapezium trapezium = new Trapezium();
            assertEquals("Trapezium",figureSquare.getName());
            assertEquals(3, figureSquare.square(), 0.3);
        }

        @Test
        public void trap3() {
            Trapezium trapezium = new Trapezium(88,1,2,3);
            assertEquals("Trapezium", figureSquare.getName());
            assertEquals(3, figureSquare.square(), 0.7);
        }
}