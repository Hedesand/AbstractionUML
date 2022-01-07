import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PineTree {

    private List<Squirrel> squirrels = new ArrayList<>();
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

    public List<Squirrel> getSquirrels() {
        return squirrels;
    }

    public void setSquirrels(Squirrel squirrel) {
        this.squirrels.add(squirrel);
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

    boolean fall(int numOfAdultSquirrel){
        int numOfSquirrelsInTree = 0;
        for(int i = 0; i <=numOfAdultSquirrel; i++){
            Random ranWeight = new Random();
            Random ranAge = new Random();
            Squirrel sq = new Squirrel(ranWeight.nextDouble(), ranAge.nextInt(15),"Pine Tree Squirrel");
            setSquirrels(sq);
        }
        for (Squirrel squirrel : squirrels) {
            squirrel.eat(true);
            numOfSquirrelsInTree += (1 + squirrel.getNumOfKittens());
        }
        if(numOfSquirrelsInTree > 10){
            setDisease(true);
        }
        else{
            setDisease(false);
        }
        if(age > 67 && height > 65 && numOfSquirrelsInTree > 5){
            System.out.println("1");
            /*owl.setAlive(false);*/
            return true;
        }
        else if(height > 100) {
            System.out.println("2");

            return true;
        }
        else if(isDisease()){
            System.out.println("3");
            return true;
        }
        System.out.println("4");

        return false;
    }

}
