import static org.junit.Assert.assertEquals;
import org.junit.*;

class GardenTest{
    Garden garden;
    Plant plant;

    @Before
    public void before() {
        garden = new Garden("allotment", 2);
    }
}