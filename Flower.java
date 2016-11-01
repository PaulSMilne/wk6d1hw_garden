public class Flower Plantable {

    private String name;

    public Flower(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public String grow() {
     return "Flowers blossom."
    }
}