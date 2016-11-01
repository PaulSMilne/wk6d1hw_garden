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
        garden.vegPlant(plant1);
        assertEquals(1, garden.vegCount());
    }

    @Test
    public void canPlantFlowers(){
        garden.flowersPlant(plant5);
        assertEquals(1, garden.flowerCount());
    }

    @Test
    public void cantPlantMoreVegThanBedWillHold(){
        for (int i = 0; i <=5; i++) {
            garden.vegPlant(plant1);
        }
        assertEquals(4, garden.vegCount());
    }

    @Test
    public void cantPlantMoreFlowersThanBedWillHold(){
        for (int i = 0; i <=5; i++) {
            garden.flowersPlant(plant5);
        }
        assertEquals(3, garden.flowerCount());
    }

    @Test
    public void canPlantUpVegBed(){
        garden.vegPlant(plant1);
        garden.vegPlant(plant2);
        garden.vegPlant(plant3);
        garden.vegPlant(plant4);
    }

    @Test
    public void canListVeg(){
        assertEquals("The following plants are in the vegetable bed - ", garden.vegList());
    }


}