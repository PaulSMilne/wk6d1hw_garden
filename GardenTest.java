import static org.junit.Assert.assertEquals;
import org.junit.*;

class GardenTest{
    Garden garden;
    Plant plant1;
    Plant plant2;

    @Before
    public void before() {
        garden = new Garden("allotment", 2);
        plant1 = new Plant("Lettuce");
        plant2 = new Plant("Daisy");
    }

    // @Test

}