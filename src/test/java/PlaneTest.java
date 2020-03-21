import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane1;
    Plane plane2;

    @Before
    public void before(){
        plane1 = new Plane(PlaneType.BOEING747);
        plane2 = new Plane(PlaneType.PRIVATEPLANE);
    }

    @Test
    public void getPlaneCapacity(){
        assertEquals(100, plane1.getCapacity());
    }

    @Test
    public void getPlaneWeight(){
        assertEquals(200, plane2.getWeight());
    }
}
