import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.*;

public class GardenTest{
    Garden garden;
    Flower flower;
    Veg veg;

    @Before
    public void before() {
        garden = new Garden("allotment");
        veg = new Veg("courgette");
        flower = new Flower("marigold");
    }

    @Test 
    public void hasName(){
        assertEquals("allotment", garden.getName());
        assertEquals("courgette", veg.getName());
        assertEquals("marigold", flower.getName());
    }

    @Test
    public void gardenBedStartsEmpty(){
        assertEquals(0, garden.plantCount());
    }

    @Test
    public void canPlantPlants(){
        garden.grow(veg);
        garden.grow(flower);
        assertEquals(2, garden.plantCount());
    }

    @Test
    public void canClearBeds(){
        garden.grow(veg);
        garden.grow(flower);
        garden.harvest();
        assertEquals(0, garden.plantCount());
    }

    @Test 
    public void canPullPlant(){
        garden.grow(veg);
        Plantable plant = garden.pull();
        assertNotNull(plant);
    }

    @Test 
    public void canGetVegBack(){
        garden.grow(veg);
        Plantable plant = garden.pull();
        Veg original = (Veg) plant;
        assertEquals("Veg swells.", original.grow());
    }
}