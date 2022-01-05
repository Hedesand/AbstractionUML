import java.util.List;

public class PineTree {

    private List<Squirrel> squirrels;
    private int numOfCones;
    private Owl owl;
    private int age;
    private int height;
    private boolean disease;

    PineTree(int numOfCones, int age, int height){
        this.numOfCones = numOfCones;
        this.age = age;
        this.height = height;

    }
    PineTree(){

    }

    public List<Squirrel> getSquirrels() {
        return squirrels;
    }

    public void setSquirrels(List<Squirrel> squirrels) {
        this.squirrels = squirrels;
    }

    public int getNumOfCones() {
        return numOfCones;
    }

    public void setNumOfCones(int numOfCones) {
        this.numOfCones = numOfCones;
    }

    public Owl getOwl() {
        return owl;
    }

    public void setOwl(Owl owl) {
        this.owl = owl;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isDisease() {
        return disease;
    }

    public void setDisease(boolean disease) {
        this.disease = disease;
    }

    boolean fall(boolean lumberjack){
        if(age > 67 && height > 65 && squirrels.size() > 5){
            owl.setAlive(false);
            return true;
        }
        else if(height > 100) {
            return true;
        }
        return true;
    }

}
