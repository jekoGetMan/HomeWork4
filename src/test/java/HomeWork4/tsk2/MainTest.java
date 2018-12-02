package HomeWork4.tsk2;

import static org.junit.Assert.*;
import org.junit.Test;
import junit.framework.Assert.*;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.verify;


public class MainTest {
    Planet p1 = new Planet("Venus");
    Island island = new Island("Hawaii");
    @Test
    public void main() {
        p1.newOcean(new Ocean("Arctic Ocean"));
        p1.newOcean(new Ocean("Indian Ocean"));
        Assert.assertEquals("My name is:Heisenberg",p1.newContinent(new Continent("Australia")));
        Assert.assertEquals(2,pl.displayFirstContinentName());
        Assert.assertEquals(3,pl.displayFirstContinentName());
    }
}