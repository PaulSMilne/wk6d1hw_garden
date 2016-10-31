public class Garden {
    private String name;
    private int size; //size refers to number of beds in the garden
    private Plant[] veg;
    private Plant[] flowers;

    public Garden(String name, int size){
        this.name = name;
        this.size = size;
        this.veg = new Plant[4];
        this.flowers = new Plant[3];
    }

    public String getName(){
        return this.name;
    }

}