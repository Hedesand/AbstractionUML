import java.util.Random;

public class Squirrel {

    private int weight;
    private int numOfConesInNest;
    private int age;
    private String subspecies;
    private int numOfKittens;

    Squirrel(int weight, int age, String subspecies){
        this.weight = weight;
        this.age = age;
        this.subspecies = subspecies;

    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getNumOfConesInNest() {
        return numOfConesInNest;
    }

    public void setNumOfConesInNest(int numOfConesInNest) {
        this.numOfConesInNest = numOfConesInNest;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSubspecies() {
        return subspecies;
    }

    public void setSubspecies(String subspecies) {
        this.subspecies = subspecies;
    }

    public int getNumOfKittens() {
        return numOfKittens;
    }

    public void setNumOfKittens(int numOfKittens) {
        this.numOfKittens = numOfKittens;
    }

    public boolean eat(){
        Random randomNumOfCones = new Random();
        setNumOfConesInNest(randomNumOfCones.nextInt(10));

        Random randomNumOfKittens = new Random();
        setNumOfKittens(randomNumOfKittens.nextInt(4));

        switch (getNumOfKittens()) {
            case 0:
                if(getNumOfConesInNest() < 1){
                    return false;
                }
                else{
                    return true;
                }
            case 1:
            case 2:
                if(getNumOfConesInNest() < 2){
                    return false;
                }
                else{
                    return true;
                }
            case 3:
            case 4:
                if(getNumOfConesInNest() < 3){
                    return false;
                }
                else{
                    return true;
                }
            default:
                return false;
        }
    }
}
