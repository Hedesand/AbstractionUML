import java.util.List;

public class PineTree {

    private List<Squirrel> squirrels;
    private int numOfCones;
    private Owl owl;
    private int age;
    private int height;

    PineTree(int numOfCones, Owl owl, int age, int height){
        this.numOfCones = numOfCones;
        this.owl = owl;
        this.age = age;
        this.height = height;

    }

    boolean fall(int age, int height, List squirrels){
        if(age > 67 && height > 65 && squirrels.size() > 5){

        }

        return true;
    }

}
