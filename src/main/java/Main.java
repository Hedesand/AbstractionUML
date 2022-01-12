import java.util.Random;

public class Main {
    public static void main(String[] args) {

    Squirrel orre = new Squirrel(3,"Pine Tree Squirrel");
    Random randBool = new Random();
    boolean rand = randBool.nextBoolean();
    boolean gotToEat = orre.eat(rand);
    if(gotToEat){
        System.out.println("Detta är en historia om en lycklig " + orre.getSubspecies() + " som en dag fick en god måltid:");
    }
    else{
        System.out.println("Detta är en  sorglig historia om en " + orre.getSubspecies() + " som en dag inte fick någon mat:");
    }
    System.out.println(orre.getStory() + "\n");
    Random randChar = new Random();
    char ch = randChar.nextBoolean() ? 'F' : 'M';
    Random randInt = new Random();
    int i = randInt.nextInt((155 - 130) + 1) + 130;
    Owl owl = new Owl(i, ch, rand);
    owl.eat();
    System.out.println();

    int randCones = randInt.nextInt(100);
    int randAge = randInt.nextInt((150 - 50) + 1) + 50;
    int randHeight = randInt.nextInt((110 - 80) + 1) + 80;
    PineTree pt = new PineTree(randCones, 80, 101);
    System.out.println(pt.fall(2));

    }
}
