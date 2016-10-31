public class Garden {
    private String name;
    private int size; //size refers to number of beds in the garden
    private Plant[] vegBed;
    private Plant[] flowerBed;

    public Garden(String name, int size){
        this.name = name;
        this.size = size;
        this.vegBed = new Plant[4];
        this.flowerBed = new Plant[3];
    }

    public String getName(){
        return this.name;
    }

    pub int vegCount(){
        int counter = 0;
        for (Plant seedlings : vegBed){
            if (seedlings != null) {
                counter++
            }
        }
    }

pub int flowerCount(){
    int counter = 0;
    for (Plant seedlings : flowerBed){
        if (seedlings != null) {
            counter++
        }
    }
}
}