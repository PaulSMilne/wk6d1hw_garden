import static org.junit.Assert.assertEquals;
import org.junit.*;

public class GardenTest{
    Garden garden;
    Plant plant1;
    Plant plant2;
    Plant plant3;
    Plant plant4;
    Plant plant5;
    Plant plant6;
    Plant plant7;

    @Before
    public void before() {
        garden = new Garden("allotment", 2);
        plant1 = new Plant("Lettuce");
        plant2 = new Plant("Courgette");
        plant3 = new Plant("Onion");
        plant4 = new Plant("Potato");
        plant5 = new Plant("Daisy");
        plant6 = new Plant("Marigold");
        plant7 = new Plant("Foxglove");
    }

    @Test 
    public void hasName(){
        assertEquals("allotment", garden.getName());
        assertEquals("Lettuce", plant1.getName());
        assertEquals("Courgette", plant2.getName());
    }

    @Test
    public void gardenBedsStartEmpty(){
        assertEquals(0, garden.vegCount());
        assertEquals(0, garden.flowerCount());
    }

    @Test
    public void canPlantVeg(){
        garden.vegPlant(plant1)
        assertEquals(1, garden.vegCount());
    }

}