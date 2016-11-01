public class Veg implements Plantable {

    private String name;

    public Veg(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

     public String grow() {
          return "Veg swells.";
     }
}