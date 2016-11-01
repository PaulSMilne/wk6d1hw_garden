import java.util.*;

public class Garden {
    private String name;
    private ArrayList<Plantable> bed;

    public Garden(String name){
        this.name = name;
        this.bed = new ArrayList<Plantable>();
    }

    public String getName(){
        return this.name;
    }

    public int plantCount(){
        return this.bed.size();
    }

    // public void vegPlant(Plant veg){
    //     if (vegBedFull()){
    //         return;
    //     }
    //     int seedlings = vegCount();
    //     vegBed[seedlings] = veg;
    // }

    // public boolean vegBedFull(){
    //     return vegCount() == vegBed.length;
    // }

    // public void flowersPlant(Plant flower){
    //     if (flowerBedFull()){
    //         return;
    //     }
    //     int seedlings = flowerCount();
    //     flowerBed[seedlings] = flower;
    // }

    // public boolean flowerBedFull(){
    //     return flowerCount() == flowerBed.length;
    // }

    // public String listVeg(){
    //     string = System.out.println("The following plants are in the vegetable bed - ");
    //     // for (int i=0; i < vegBed.length; i++){
    //     //     System.out.println(vegBed[0].getName);
    //     // }
    //     return string;
    // }


}