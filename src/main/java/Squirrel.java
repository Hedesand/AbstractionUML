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
                if(numOfConesInNest < 1){
                    return false;
                }
                else{
                    return true;
                }
            case 2:
                break;
            default:

        }
        return false;
    }
}
