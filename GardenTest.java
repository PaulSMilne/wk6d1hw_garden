import static org.junit.Assert.assertEquals;
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

    // @Test
    // public void canPlantVeg(){
    //     garden.vegPlant(plant1);
    //     assertEquals(1, garden.vegCount());
    // }

    // @Test
    // public void canPlantFlowers(){
    //     garden.flowersPlant(plant5);
    //     assertEquals(1, garden.flowerCount());
    // }

    // @Test
    // public void cantPlantMoreVegThanBedWillHold(){
    //     for (int i = 0; i <=5; i++) {
    //         garden.vegPlant(plant1);
    //     }
    //     assertEquals(4, garden.vegCount());
    // }

    // @Test
    // public void cantPlantMoreFlowersThanBedWillHold(){
    //     for (int i = 0; i <=5; i++) {
    //         garden.flowersPlant(plant5);
    //     }
    //     assertEquals(3, garden.flowerCount());
    // }

    // @Test
    // public void canPlantUpVegBed(){
    //     garden.vegPlant(plant1);
    //     garden.vegPlant(plant2);
    //     garden.vegPlant(plant3);
    //     garden.vegPlant(plant4);
    // }

    // @Test
    // public void canListVeg(){
    //     assertEquals("The following plants are in the vegetable bed - ", garden.vegList());
    // }


}