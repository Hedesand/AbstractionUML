public class Squirrel {

    private int weight;
    private int numOfConesInNest;
    private int age;
    private String subspecies;
    private int numOfKittens;

    Squirrel(int weight, int numOfConesInNest, int age, String subspecies, int numOfKittens){
        this.weight = weight;
        this.numOfConesInNest = numOfConesInNest;
        this.age = age;
        this.subspecies = subspecies;
        this.numOfKittens = numOfKittens;

    }

    public boolean eat(int numOfConesInNest, int numOfKittens){
        switch (numOfKittens) {
            case 0:
                if(numOfConesInNest < 1){
                    return false;
                }
                else{
                    return true;
                }
            case 1:
            case 2:
                if(numOfConesInNest < 2){
                    return false;
                }
                else{
                    return true;
                }
            case 3:
            case 4:
                if(numOfConesInNest < 3){
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
