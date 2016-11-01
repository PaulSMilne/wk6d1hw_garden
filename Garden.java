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

    public void grow(Plantable seedling){
        this.bed.add(seedling);
    }

    public void harvest(){
        this.bed.clear();
    }

    public Plantable pull(){
        if (plantCount() < 0){ 
            Plantable plant = bed.remove(0);
            return plant;
        }
        return null;
    }

}