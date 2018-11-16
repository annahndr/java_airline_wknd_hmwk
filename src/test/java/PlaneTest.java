import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane1;
    Plane plane2;

    @Before
    public void before(){
        plane1 = new Plane(PlaneType.AIRBUSA300);
        plane2 = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void canGetPlaneType() {
        assertEquals(PlaneType.AIRBUSA300, plane1.getPlaneType());
    }

    @Test
    public void canGetPlaneCapacity() {
        assertEquals(1, plane1.getPlaneCapacity());
    }

    @Test
    public void canGetPlaneWeight() {
        assertEquals(100, plane1.getPlaneTotalWeight());
    }
}
